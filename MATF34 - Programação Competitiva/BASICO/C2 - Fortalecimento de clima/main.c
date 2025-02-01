#include <iostream>

using namespace std;

int main() {
    int N, P, M;
    cin >> N;
    
    for(int i=0; i<N; i++) {
        cin >> P >> M;
        cout << P+M << endl;
    }
    
    return 0;
}
