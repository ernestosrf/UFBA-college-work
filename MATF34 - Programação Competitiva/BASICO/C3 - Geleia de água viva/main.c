#include <iostream>
using namespace std;

int main() {
    int N, Q, T, G;
    T = 0;
    G = 0;
    cin >> N;
    for(int i = 0; i < N; i++) {
        cin >> Q;
        if(Q == 10) T++;
        if(Q == 11) G++;
    }
    if(T>G) cout << "Tradicional";
    else cout << "Geleia";
    return 0;
}
