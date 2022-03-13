#include <iostream>
#include <vector>

using namespace std;

int main () {
    
    vector<int> my_vector = {1,2,5,8,7,9,4,3};    

    for (int i = my_vector.size()-1 ; i >=0 ; i--){
        cout << my_vector[i] << " ";
    }
    cout << endl;
    return 0;
}