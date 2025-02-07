#include <iostream>
#include <vector>
#include <tuple>
#include <algorithm>

using namespace std;

int main()
{
    int d, m, a;
    vector<tuple<int, int, int>> dates;
    
    while(cin >> d >> m >> a) {
        dates.push_back(make_tuple(d, m, a));
    }
    
    sort(dates.begin(), dates.end(), [](const tuple<int, int, int>& t1, const tuple<int, int, int>& t2) {
        if (get<2>(t1) != get<2>(t2))
            return get<2>(t1) < get<2>(t2);
        if (get<1>(t1) != get<1>(t2))
            return get<1>(t1) < get<1>(t2);
        return get<0>(t1) < get<0>(t2);
    });
    
    for (const auto &date : dates) {
            cout << get<0>(date) << " " << get<1>(date) << " " << get<2>(date) << endl;
        }
    
    return 0;
}
