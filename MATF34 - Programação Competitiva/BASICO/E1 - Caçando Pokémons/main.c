#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, M, P;
    cin >> N >> M;

    vector<vector<int>> AREA(N, vector<int>(M));

    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            cin >> AREA[i][j];
        }
    }

    cin >> P;

    int count = 0;
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < M; j++) {
            if (AREA[i][j] == P) {
                count++;
            }
        }
    }

    cout << "Ash pegou " << count << " pokemon" << endl;

    return 0;
}
