#include <iostream>
using namespace std;

int main() {
    int A, B, C, D, E;
    cin >> A >> B >> C >> D >> E;
    int TOTAL_ALLY_SHIPS = B+C+D+E;
    int TOTAL_ENEMY_SHIPS = A - TOTAL_ALLY_SHIPS;
    cout << TOTAL_ENEMY_SHIPS << endl;
    return 0;
}
