#include <iostream>
#include <stack>
#include <string>
#include <algorithm>

using namespace std;

string reverseBlock(const string& block) {
    string reversed = block;
    for (char& c : reversed) {
        c = (c == '0') ? '1' : '0';
    }
    return reversed;
}

int main() {
    int N, M;
    cin >> N >> M;

    stack<string> tower;
    int points = 0;

    for (int i = 0; i < N; i++) {
        string block;
        cin >> block;

        if (!tower.empty() && block == reverseBlock(tower.top())) {
            tower.pop();
            points += 10;
        } else {
            tower.push(block);
        }

        if (tower.size() >= M) {
            cout << "game over" << endl;
            return 0;
        }
    }

    cout << points << endl;

    return 0;
}
