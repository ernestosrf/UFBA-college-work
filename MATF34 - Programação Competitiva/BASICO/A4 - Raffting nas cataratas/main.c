#include <iostream>

using namespace std;

int main() {
    int Q1, Q2, Q3, Q4;
    cin >> Q1 >> Q2 >> Q3 >> Q4;
    int sum = Q1 + Q2 + Q3 + Q4;
    int tourists = sum - 8;
    cout << tourists << endl;
    return 0;
}
