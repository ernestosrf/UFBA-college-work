#include <iostream>
using namespace std;

int main()
{
    int A, B, C, SOMA;
    cin >> A >> B >> C;
    if(A > 50 || B > 50 || C > 50) {
        cout << "Shrek vai dar o urro!" << endl;
        return 0;
    }
    
    SOMA = A + B + C;
    
    if(SOMA > 80 || SOMA < 20) cout << "Shrek vai dar o urro!" << endl;
    else cout << "Shrek ficou calmo." << endl;
    
    return 0;
}
