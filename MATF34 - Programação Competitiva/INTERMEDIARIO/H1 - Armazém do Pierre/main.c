#include <iostream>
#include <vector>
#include <algorithm>
#include <string>

using namespace std;

struct Villager {
    string name;
    int age;
};

bool compareByAge(const Villager &a, const Villager &b) {
    return a.age > b.age;
}

int main() {
    int D, X;
    cin >> D >> X;
    
    vector<Villager> queue;
    vector<string> served;
    
    for(int day = 0; day < D; day++) {
        int N;
        cin >> N;
        
        for(int i = 0; i < N; i++) {
            Villager m;
            cin >> m.name >> m.age;
            queue.push_back(m);
        }
        
        sort(queue.begin(), queue.end(), compareByAge);
        
        int limit = min(X, (int)queue.size());
        
        for(int i = 0; i < limit; i++) {
            served.push_back(queue[i].name);
        }
        queue.erase(queue.begin(), queue.begin() + limit);
    }
    
    for(const string &name : served) {
        cout << name << endl;
    }
    
    return 0;
}
