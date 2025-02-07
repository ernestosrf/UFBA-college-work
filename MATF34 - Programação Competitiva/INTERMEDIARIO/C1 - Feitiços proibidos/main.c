#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

int main() {
    int N, M, C;

    cin >> N;
    vector<string> generalSpells(N);
    for (int i = 0; i < N; i++) {
        cin >> generalSpells[i];
    }

    cin >> M;
    vector<string> forbiddenSpells(M);
    for (int i = 0; i < M; i++) {
        cin >> forbiddenSpells[i];
    }

    cin >> C;
    vector<string> searchs(C);
    for (int i = 0; i < C; i++) {
        cin >> searchs[i];
    }

    for (const string& search : searchs) {
        if (binary_search(forbiddenSpells.begin(), forbiddenSpells.end(), search)) {
            cout << "Proibido" << endl;
        } else {
            cout << "Geral" << endl;
        }
    }

    return 0;
}
