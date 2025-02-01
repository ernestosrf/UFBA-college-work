#include <iostream>
using namespace std;

int main() {
    int N, T;
    cin >> N >> T;
    
    int H[N];
    for (int i = 0; i < N; i++) {
        cin >> H[i];
    }
    
    int TEMPO_ACUMULADO = 0;
    int PEIXES_PESCADOS = 0;
    
    for (int i = 0; i < N; i++) {
        if (TEMPO_ACUMULADO + H[i] <= T) {
            TEMPO_ACUMULADO += H[i];
            PEIXES_PESCADOS++;
        } else {
            break;
        }
    }
    
    cout << PEIXES_PESCADOS << endl;
    
    return 0;
}
