#include <iostream>
#include <vector>
#include <set>
#include <ctime>
#include <cstdlib>
#include <algorithm>
#include <stdlib.h>
#include <time.h>

using namespace std;


//fill a vector with random numbers
void fill_vector(vector<int>& v, int size)
{
    srand (time(NULL));
    for (int i = 0; i < size; ++i)
    {
        v.push_back(rand() % size);
    }
}

//fill a set with random numbers
void fill_set(set<int>& s, int size)
{
    srand (time(NULL));
    for (int i = 0; i < size; ++i)
    {
        s.insert(rand() % size);
    }
}

//main in c++
int main()
{
    vector<int> mi_vector;
    fill_vector(mi_vector, 10000);
    
    
    //search for a value in a vector
    int search_value = 50;
    cout << "Searching for " << search_value << endl;
    cout << "Length of vector: " << mi_vector.size() << endl;

    clock_t start = clock();
    cout << "Found at position: " << find(mi_vector.begin(), mi_vector.end(), search_value) - mi_vector.begin() << endl;
    clock_t end = clock();

    cout << "Time of execution: " << (end - start) / (double)CLOCKS_PER_SEC << " seconds" << endl;

    //search for a value in a set
    set<int> mi_set;
    fill_set(mi_set, 10000*2);
    cout << "Searching for " << search_value << endl;
    cout << "Length of Set: " << mi_set.size() << endl;
    start = clock();
    auto value = mi_set.find(search_value); 
    end = clock();
    
    cout << "Found value: " << ( value == mi_set.end() ? "Not found" : to_string(*value) )  << endl;

    cout << "Time of execution set: " << (end - start) / (double)CLOCKS_PER_SEC << " seconds" << endl;


    return 0;
}