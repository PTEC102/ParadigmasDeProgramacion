#include <iostream>
#include <vector>
#include <stdlib.h>     /* srand, rand */
#include <time.h>   

using namespace std;

int main () {
    srand (time(NULL));
    vector<int> my_vector_rand_numbers;    

    for (int i = 0 ; i < 10 ; i++){
        int iSecret =  rand() % 10 + 1;
        my_vector_rand_numbers.push_back(iSecret);
    }

    for (int i = 0 ; i < 10 ; i++){     
        cout << my_vector_rand_numbers[i] << " ";
    }
    cout << endl;
    return 0;
}