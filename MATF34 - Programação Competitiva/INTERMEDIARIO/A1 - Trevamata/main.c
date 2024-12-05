#include <iostream>
#include <vector>
#include <string>

using namespace std;

int main()
{
    int N, C;
    cin >> N;
    
    vector<pair<string, int>> friends;
    
    for(int i=0; i<N; i++) {
        string name;
        int weight;
        cin >> name >> weight;
        friends.push_back({name, weight});
    }
    
    cin >> C;

    vector<string> guilties;
    
    for (const auto &f : friends) {
        if (f.second > C) {
            guilties.push_back(f.first);
        }
    }
    
    if (guilties.empty()) {
        cout << "Vamos todos encontrar a montanha!" << endl;
    } else {
        cout << "Vamos virar almoço de aranhas gigantes!" << endl;
        for (const auto &guilty : guilties) {
            cout << guilty << endl;
        }
    }
    
    

    return 0;
}