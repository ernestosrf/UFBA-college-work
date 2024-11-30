#include <iostream>

using namespace std;

int main() {
    int Q1, Q2, Q3, E1, E2, E3;
    cin >> Q1 >> Q2 >> Q3;
    cin >> E1 >> E2 >> E3;
    int totalEggsCollected = Q1 + Q2 + Q3;
    int totalEggsLost = (E1 + E2 + E3) * 3;
    cout << totalEggsCollected - totalEggsLost << endl;
    return 0;
}
