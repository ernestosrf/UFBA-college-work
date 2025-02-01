#include <iostream>

using namespace std;

int main() {
    int N, FISH_VALUE;
    cin >> N >> FISH_VALUE;
    int TOTAL = N*FISH_VALUE;

    if (TOTAL >= 7500) {
        cout << "Vara de Iridio";
    }else if(TOTAL >= 1800) {
        cout << "Vara de Fibra de Vidro";
    }else if(TOTAL >= 500) {
        cout << "Vara de Bambu";
    }else cout << "Paciencia Firmino!";
    
    return 0;
}
