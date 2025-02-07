#include <iostream>
#include <vector>
#include <tuple>
#include <algorithm>

using namespace std;

int main()
{
    int N, M, P;
    vector<tuple<string, int>> names;
    string name;
    
    cin >> N;
    
    for (int i = 0; i < N; i++) {
            cin >> name >> M >> P;
            int completed = M - P;
            names.push_back(make_tuple(name, completed));
        }
        
    sort(names.begin(), names.end(), [](const tuple<string, int>& t1, const tuple<string, int>& t2) {
        return get<0>(t1) < get<0>(t2);
    });
    
    for (const auto& entry : names) {
            cout << get<0>(entry) << " " << get<1>(entry) << " " << endl;
        }
    
    return 0;
}
