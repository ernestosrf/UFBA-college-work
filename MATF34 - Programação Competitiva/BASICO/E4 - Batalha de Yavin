#include <iostream>
#include <vector>

using namespace std;

int main() {
    int N, M;
    cin >> N >> M;
    
    vector<vector<int>> SPACE(N, vector<int>(N));
    for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
            cin >> SPACE[i][j];
        }
    }
    
    int DESTROYED = 0;
    
    for (int i = 0; i < M; i++) {
        int L, C;
        cin >> L >> C;
        
        for (int j = L-1; j >= 0; j--) {
            if (SPACE[j][C] == 1) {
                DESTROYED++;
                SPACE[j][C] = 0;
                break;
            }
        }
    }
    
    cout << DESTROYED << endl;
    
    return 0;
}
