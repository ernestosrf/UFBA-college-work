#include <iostream>
#include <map>
#include <string>
#include <algorithm>

using namespace std;

int main() {
    int N;
    cin >> N;

    map<string, pair<string, long long>> systems;

    string systemCapital;
    string worldCapital;
    long long capitalPopulation = 0;

    for (int i = 0; i < N; i++) {
        string system, world;
        long long population;
        cin >> system >> world >> population;

        if (systems.find(system) == systems.end() || systems[system].second < population) {
            systems[system] = {world, population};
        }

        if (population > capitalPopulation) {
            systemCapital = system;
            worldCapital = world;
            capitalPopulation = population;
        }
    }

    cout << systemCapital << " " << capitalPopulation << endl;

    for (const auto& system : systems) {
        cout << system.first << " " << system.second.second << endl;
    }

    return 0;
}
