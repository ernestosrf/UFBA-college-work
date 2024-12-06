#include <iostream>
#include <vector>

using namespace std;

int main()
{
    int N, M, A;
    int sum = 0;
    
    cin >> N;
    
    vector<int> X(N), B(N);
    
    for(int i = 0; i < N; i++) {
        cin >> X[i];
    }
    
    for(int i = 0; i < N; i++) {
        cin >> B[i];
    }
    
    cin >> M >> A;
    
    for(int i = 0; i < N; i++) {
        B[i]+=A;
    }
    
    for(int i = 0; i < N; i++) {
        sum += (X[i] * B[i]);
    }
    
    if(sum >= M) {
        cout << "Upou de Nivel!" << endl;
    } else {
        cout << "Nao foi dessa vez!" << endl;
    }

    return 0;
}