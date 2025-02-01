#include <iostream>

using namespace std;

int main() {
    int X,Y;
    cin >> X >> Y;
    int Y2 = Y*9;

    if (X <= Y2) cout << "Lar doce lar.";
    else {
        int REST = (X-Y2)/9;
        if (((X-Y2)%9) != 0) REST+=1;
        cout << "Precisa de mais difusores!" << endl;
        cout << REST;
    }
    return 0;
}
