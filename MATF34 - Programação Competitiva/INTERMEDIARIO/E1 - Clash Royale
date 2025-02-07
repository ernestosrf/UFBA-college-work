#include <iostream>
#include <queue>

using namespace std;

int main() {
    int N, L;

    cin >> N;

    queue<int> deck;
    for (int i = 0; i < N; i++) {
        int power;
        cin >> power;
        deck.push(power);
    }

    cin >> L;

    vector<int> enemyMonsters(L);
    for (int i = 0; i < L; i++) {
        cin >> enemyMonsters[i];
    }

    int deadCards = 0;

    for (int i = 0; i < L; i++) {
        if (deck.empty()) {
            break;
        }

        int playerCard = deck.front();
        int enemyMonster = enemyMonsters[i];

        if (playerCard >= enemyMonster) {
            deck.pop();
            deck.push(playerCard);
        } else {
            deck.pop();
            deadCards++;
        }
    }

    cout << deadCards << endl;

    return 0;
}
