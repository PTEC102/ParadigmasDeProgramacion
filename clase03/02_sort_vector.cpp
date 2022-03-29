#include <iostream>
#include <vector>
#include <algorithm>

using namespace std;

bool funcion_criterio_ordenamiento(int i,int j) { return (i>j); } // recibe dos numeros y los ordena de mayor a menor

int main()
{
    vector<int> lista_numeros;
    lista_numeros.push_back(1);
    lista_numeros.push_back(2);
    lista_numeros.push_back(10);
    lista_numeros.push_back(3);
    lista_numeros.push_back(8);

    sort (lista_numeros.begin(), lista_numeros.end(), funcion_criterio_ordenamiento);
    
    // se recorre utilizando un iterador para vector<int>
    for (vector<int>::iterator it=lista_numeros.begin(); it!=lista_numeros.end(); ++it) {
        cout << *it << endl;
    }

    return 0;
}
