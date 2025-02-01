#include <iostream>

using namespace std;

int main() {
    int SC, MM, CK;
    cin >> SC >> MM >> CK;

    if (SC < 30) {
        cout << 30-SC << " " << 6-MM << " " << 3-CK;
    }
    else cout << "PROXIMO MUNDO";
    
    return 0;
}
