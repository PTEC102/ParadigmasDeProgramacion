#include <iostream>
#include <vector>
#include <stdlib.h>     /* srand, rand */
#include <time.h>   

using namespace std;

int main () {
    srand (time(NULL));
    vector<int> my_vector_rand_numbers;    
    
    //Lenamos el vector de manera aleatoria con números de 1 a 5
    for (int i = 0 ; i < 10 ; i++){
        int iSecret =  rand() % 5 + 1;
        my_vector_rand_numbers.push_back(iSecret);
    }

    for (int i = 0 ; i < 10 ; i++){     
        cout << my_vector_rand_numbers[i] << " ";
    }
    cout << endl;

    //Solicitamos 6 posiciones en memoria, cada una contiene un zero
    vector<int> histogram (6);

    //Si encontramos un número aumentamos el conteo de las veces que aparece
    for (int i = 0 ; i < my_vector_rand_numbers.size() ; i++){     
        histogram[my_vector_rand_numbers[i]]++;
    }
    
    for (int i = 0 ; i < histogram.size() ; i++){     
        cout<< i << ": ";
        for (int j = 0; j < histogram[i]; j++){
            cout<< "*";
        }
        cout << endl;
    }

    return 0;
}