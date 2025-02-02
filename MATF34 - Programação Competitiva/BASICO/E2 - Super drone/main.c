#include <iostream>
#include <vector>
using namespace std;

int main() {
    int N;
    cin >> N;
    
    vector<vector<int>> MAPA(N, vector<int>(N));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> MAPA[i][j];
        }
    }
    
    int C;
    cin >> C;
    int TOTAL_ESPECIES = 0;
    
    for (int k = 0; k < C; k++) {
        int X, Y;
        cin >> X >> Y;
        TOTAL_ESPECIES += MAPA[X][Y];
    }
    
    cout << TOTAL_ESPECIES << endl;
    
    return 0;
}
