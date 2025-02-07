#include <iostream>
#include <queue>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;

    queue<int> queue;
    for (int i = 0; i < N; i++) {
        int time;
        cin >> time;
        queue.push(time);
    }

    for (int minute = 0; minute < M; minute++) {
        if (queue.empty()) {
            break;
        }

        int process = queue.front();
        queue.pop();

        process--;

        if (process > 0) {
            queue.push(process);
        }
    }

    if (queue.empty()) {
        cout << "pronto" << endl;
    } else {
        cout << queue.size() << endl;

        while (!queue.empty()) {
            cout << queue.front() << " ";
            queue.pop();
        }
        cout << endl;
    }

    return 0;
}
