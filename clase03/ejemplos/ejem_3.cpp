#include <iostream>
#include <vector>
#include <set>
#include <ctime>
#include <cstdlib>
#include <algorithm>
#include <stdlib.h>
#include <map>
#include <time.h>

using namespace std;
//g++ ejem_3.cpp -o main -std=c++17

void fill_vector(vector<int>& v, int size)
{
    //srand (time(NULL)); //Si dejamos esto da el mimo resultado del vector
    for (int i = 0; i < size; ++i)
    {
        v.push_back(rand() % size);
    }
}

//print vector
void print_vector(vector<int>& v)
{
    for (int i = 0; i < v.size(); ++i)
    {
        cout << v[i] << " ";
    }    
}

int main(){

    map<vector<int>, int> m;
    
    vector<vector<int>> v;

    for (int i = 0; i < 10; ++i)
    {
        vector<int> v1;
        fill_vector(v1, 10);
        print_vector(v1);
        v.push_back(v1);
        m[v1] = i;
        cout << endl;
    }
    
    for (auto it = m.begin(); it != m.end(); ++it)
    {        
        cout << "Key: ";
        vector<int> a = it->first;
        print_vector(a);
        cout << " Value: " << it->second << endl;
    }
    
    cout << endl;

    for (auto [key, value] : m) {
        cout << "[ "; 
        vector<int> a = key;
        print_vector(a);
        cout << "] = " << value << endl;
    }
}