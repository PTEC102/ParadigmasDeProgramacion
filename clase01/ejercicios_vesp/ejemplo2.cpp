#include <iostream>
#include <stdlib.h>     /* srand, rand */
#include <time.h>   


using namespace std;

int main()
{
    srand (time(NULL));
    int array[10];     

    for (int i = 0 ; i < 10 ; i++){
        int iSecret =  rand() % 10 + 1;
        array[i] = iSecret;
    }

    for (int i = 0 ; i < 10 ; i++){     
        cout << array[i] << " ";
    }
    cout << endl;
    
    return 0;
}
