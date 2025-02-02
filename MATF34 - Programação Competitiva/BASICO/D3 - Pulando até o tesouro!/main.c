#include <iostream>
using namespace std;

int main() {
    int N, S;
    cin >> N;
    
    int OBSTACULOS[N];
    for (int i = 0; i < N; i++) {
        cin >> OBSTACULOS[i];
    }

    cin >> S;

    int OBSTACULOS_PULADOS = 0;
    bool TODOS_VENCIDOS = true;

    for (int ALTURA : OBSTACULOS) {
        if (ALTURA <= S) {
            OBSTACULOS_PULADOS++;
        } else {
            TODOS_VENCIDOS = false;
            break;
        }
    }

    cout << OBSTACULOS_PULADOS << endl;
    cout << (TODOS_VENCIDOS ? 1 : 0) << endl;
    
    return 0;
}
