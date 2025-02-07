#include <iostream>
#include <vector>
#include <queue>

using namespace std;

struct Position {
    int x, y;
};

bool isValid(int x, int y, int N) {
    return x >= 0 && x < N && y >= 0 && y < N;
}

int main() {
    int N;
    cin >> N;

    vector<vector<int>> map(N, vector<int>(N));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> map[i][j];
        }
    }

    int X, Y;
    cin >> X >> Y;

    if (map[X][Y] != 1) {
        cout << 0 << endl;
        return 0;
    }

    queue<Position> queue;
    queue.push({X, Y});
    map[X][Y] = -1;

    int dx[] = {-1, 1, 0, 0};
    int dy[] = {0, 0, -1, 1};

    int area = 0;

    while (!queue.empty()) {
        Position current = queue.front();
        queue.pop();
        area++;

        for (int i = 0; i < 4; i++) {
            int nx = current.x + dx[i];
            int ny = current.y + dy[i];

            if (isValid(nx, ny, N) && map[nx][ny] == 1) {
                map[nx][ny] = -1;
                queue.push({nx, ny});
            }
        }
    }

    cout << area << endl;

    return 0;
}
