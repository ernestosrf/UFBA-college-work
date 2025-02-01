#include <iostream>
#include <string>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    int CAPACIDADE_TOTAL = 0;
    
    string QUARTO;
    while(true) {
        cin >> QUARTO;
        
        if (QUARTO == "FIM") break;
        
        if (QUARTO == "Casal") {
            CAPACIDADE_TOTAL += 2;
        } else if (QUARTO == "Triplo") {
            CAPACIDADE_TOTAL += 3;
        } else if (QUARTO == "Quadruplo") {
            CAPACIDADE_TOTAL += 4;
        } else if (QUARTO == "Familia") {
            CAPACIDADE_TOTAL += 5;
        }
    }
    
    if (CAPACIDADE_TOTAL >= N) {
        cout << "Pode reservar! Esses quartos cabem todos." << endl;
    } else {
        cout << "Procure outra pousada." << endl;
    }
    
    return 0;
}
