#include <iostream>

using namespace std;

int main() {
    char z,g,d,c;
    cin >> z >> g;
    cin >> d >> c;
    
    if(z != d) cout << "Bloqueado";
    else cout << "Driblado" << endl;
    if (z == d && g != c) cout << "...e o goleiro pega";
    else if (z == d && g == c) cout << "Gol";
    
    return 0;
}
