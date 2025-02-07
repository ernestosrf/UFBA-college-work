#include <iostream>
#include <map>
#include <sstream>
#include <vector>

using namespace std;

int main() {
    int N;
    cin >> N;

    map<string, string> dictionary;
    for (int i = 0; i < N; i++) {
        string valyrian, common;
        cin >> valyrian >> common;
        dictionary[valyrian] = common;
    }

    int M;
    cin >> M;

    string phrase;
    cin.ignore();
    getline(cin, phrase);

    stringstream ss(phrase);
    string word;
    vector<string> words;
    while (ss >> word) {
        words.push_back(word);
    }

    for (size_t i = 0; i < words.size(); i++) {
        if (dictionary.find(words[i]) != dictionary.end()) {
            words[i] = dictionary[words[i]];
        }
    }

    for (size_t i = 0; i < words.size(); i++) {
        cout << words[i];
        if (i < words.size() - 1) {
            cout << " ";
        }
    }
    cout << endl;

    return 0;
}
