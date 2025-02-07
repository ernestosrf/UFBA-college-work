#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;

    vector<int> firstBalls(N / 2);
    for (int i = 0; i < N / 2; i++) {
        cin >> firstBalls[i];
    }

    vector<int> secondBalls(N / 2);
    for (int i = 0; i < N / 2; i++) {
        cin >> secondBalls[i];
    }

    unordered_set<int> uniqueBalls;
    for (int ball : firstBalls) {
        uniqueBalls.insert(ball);
    }
    for (int ball : secondBalls) {
        uniqueBalls.insert(ball);
    }

    int uniqueTotal = uniqueBalls.size();
    if (uniqueTotal == N) {
        cout << "Sortudo, ganhou os dois potes" << endl;
    } else if (uniqueTotal > N / 2 && uniqueTotal < N) {
        cout << "Ganhou um pote" << endl;
    } else if (uniqueTotal == N / 2) {
        cout << "Azarado" << endl;
    }

    return 0;
}
