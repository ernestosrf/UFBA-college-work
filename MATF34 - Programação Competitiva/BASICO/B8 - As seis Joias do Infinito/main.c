#include <iostream>
using namespace std;
#include <algorithm>
#include <list>

int main()
{
    int INPUT;
    list<int> JOIAS = {1,2,3,4,5,6};
    list <int> JOIAS_RECUPERADAS;
    
    for (int i=0; i<6; i++) {
        cin >> INPUT;
        JOIAS_RECUPERADAS.push_back(INPUT);
    }
    
    for (int JOIA : JOIAS_RECUPERADAS) {
        if (std::find(JOIAS.begin(), JOIAS.end(), JOIA) != JOIAS.end()) {
            JOIAS.remove(JOIA);
        }
    }
    
    if (JOIAS.empty()) {
        cout << "Infelizmente perdemos a guerra." << endl;
    } else {
        cout << "Os Vingadores ganharam a batalha!!!" << endl;
    }
    
    return 0;
}
