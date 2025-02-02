#include <iostream>
#include <vector>
using namespace std;

int main() {
    int M, N;
    cin >> M >> N;
    
    vector<vector<int>> GRID(M, vector<int>(N));
    for (int i = 0; i < M; ++i) {
        for (int j = 0; j < N; ++j) {
            cin >> GRID[i][j];
        }
    }
    
    char TIPO;
    int X;
    cin >> TIPO >> X;
    X--;
    
    int SOMA = 0;
    if (TIPO == 'L') {
        for (int VALOR : GRID[X]) {
            SOMA += VALOR;
        }
    } else if (TIPO == 'C') {
        for (int i = 0; i < M; ++i) {
            SOMA += GRID[i][X];
        }
    }
    
    cout << SOMA << endl;
    
    return 0;
}
