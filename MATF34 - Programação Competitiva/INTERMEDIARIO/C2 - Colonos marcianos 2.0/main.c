#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

struct Candidate {
    int grade;
    int id;
};

bool compareCandidates(const Candidate& a, const Candidate& b) {
    if (a.grade == b.grade) {
        return a.id < b.id;
    }
    return a.grade > b.grade;
}

int main() {
    int N, Q;
    cin >> N >> Q;

    vector<Candidate> candidates(Q);
    for (int i = 0; i < Q; i++) {
        cin >> candidates[i].grade >> candidates[i].id;
    }

    sort(candidates.begin(), candidates.end(), compareCandidates);

    vector<Candidate> approvedCandidates(candidates.begin(), candidates.begin() + N);

    int C;
    cin >> C;
    for (int i = 0; i < C; i++) {
        int gradeSearched, idSearched;
        cin >> gradeSearched >> idSearched;

        bool approved = false;
        for (const Candidate& candidate : approvedCandidates) {
            if (candidate.grade == gradeSearched && candidate.id == idSearched) {
                approved = true;
                break;
            }
        }

        if (approved) {
            cout << "Sim" << endl;
        } else {
            cout << "Nao" << endl;
        }
    }

    return 0;
}
