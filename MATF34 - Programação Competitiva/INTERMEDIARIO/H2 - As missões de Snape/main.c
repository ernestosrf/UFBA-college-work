#include <iostream>
#include <vector>
#include <queue>
#include <string>

using namespace std;

struct Student {
    int hability;
    string name;
};

struct GriffindorComparator {
    bool operator()(const Student& a, const Student& b) {
        return a.hability < b.hability;
    }
};

struct SlitherinComparator {
    bool operator()(const Student& a, const Student& b) {
        return a.hability > b.hability;
    }
};

int main() {
    int N;
    cin >> N;
    
    priority_queue<Student, vector<Student>, GriffindorComparator> griffindorQueue;
    priority_queue<Student, vector<Student>, SlitherinComparator> slitherinQueue;
    
    while (N--) {
        int G, S, M;
        cin >> G >> S >> M;
        
        for (int i = 0; i < G; i++) {
            Student student;
            cin >> student.hability;
            cin.ignore();
            getline(cin, student.name);
            griffindorQueue.push(student);
        }
        
        for (int i = 0; i < S; i++) {
            Student student;
            cin >> student.hability;
            cin.ignore();
            getline(cin, student.name);
            slitherinQueue.push(student);
        }
        
        for (int i = 0; i < M; i++) {
            if (griffindorQueue.empty() || slitherinQueue.empty()) {
                break;
            }
            
            Student bestGriffindor = griffindorQueue.top(); griffindorQueue.pop();
            Student worstSlitherin = slitherinQueue.top(); slitherinQueue.pop();
            
            cout << bestGriffindor.name << " e " << worstSlitherin.name << endl;
        }
    }
    
    return 0;
}
