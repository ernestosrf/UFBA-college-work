#include <iostream>

using namespace std;

int main() {
  int N1, N2, N3, N4, N5;
  cin >> N1 >> N2 >> N3 >> N4 >> N5;
  int TOTAL = N1 + N2 + N3 + N4 + N5;
  if (TOTAL > 5000) cout << "Acesso proibido";
  else cout << "Acesso liberado";
  return 0;
}
