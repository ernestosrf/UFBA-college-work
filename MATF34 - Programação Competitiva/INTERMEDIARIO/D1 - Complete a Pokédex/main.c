#include <iostream>
#include <unordered_set>
#include <vector>

using namespace std;

int main() {
    int N, M;

    cin >> N;
    unordered_set<int> catched;
    for (int i = 0; i < N; i++) {
        int X;
        cin >> X;
        catched.insert(X);
    }

    cin >> M;
    vector<int> wild(M);
    for (int i = 0; i < M; i++) {
        cin >> wild[i];
    }

    for (int i = 0; i < M; i++) {
        int X = wild[i];
        if (catched.find(X) == catched.end()) {
            catched.insert(X);
            cout << "Temos que pegar!" << endl;
        } else {
            cout << "Repetido" << endl;
        }
    }

    return 0;
}
