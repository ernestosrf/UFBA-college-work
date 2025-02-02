#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N, Y;
    cin >> N;
    
    int HABILIDADES[N];
    for (int i = 0; i < N; i++) {
        cin >> HABILIDADES[i];
    }
    
    int IDS[N];
    for (int i = 0; i < N; i++) {
        cin >> IDS[i];
    }
    
    cin >> Y;
    
    vector<int> DOBRADORES_ESCOLHIDOS;
    for (int i = 0; i < N; i++) {
        if (HABILIDADES[i] == Y) {
            DOBRADORES_ESCOLHIDOS.push_back(IDS[i]);
        }
    }

    if (DOBRADORES_ESCOLHIDOS.empty()) {
        cout << "Nenhum" << endl;
    } else {
        for (size_t i = 0; i < DOBRADORES_ESCOLHIDOS.size(); i++) {
            cout << DOBRADORES_ESCOLHIDOS[i] << " ";
        }
        cout << endl;
    }
    
    return 0;
}
