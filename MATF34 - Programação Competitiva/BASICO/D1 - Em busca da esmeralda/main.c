#include <iostream>
using namespace std;

int main() {
    int N, C;
    cin >> N;
    
    int CAIXAS[N];
    for (int i = 0; i < N; i++) {
        cin >> CAIXAS[i];
    }
    
    cin >> C;
    
    for (int i = 0; i < N; i++) {
        if (CAIXAS[i] == C) {
            cout << C << endl;
            return 0;
        }
    }
    
    cout << -1 << endl;
    
    return 0;
}
