#include <iostream>
#include <string>
using namespace std;

int main() {
    int E, P;
    cin >> E >> P;
    
    int ATK = 0;
    
    while(E>0 && P>0) {
        E -= P;
        P--;
        ATK++;
    }
    
    if (E <= 0) {
        cout << ATK << endl;
    } else {
        cout << 'F' << endl;
    }    
    
    return 0;
}
