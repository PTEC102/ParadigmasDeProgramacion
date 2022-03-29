#include <iostream>
#include <vector>

using namespace std;

int main()
{
    vector<int> lista_numeros;
    lista_numeros.push_back(1);
    lista_numeros.push_back(2);
    lista_numeros.push_back(10);

    cout << lista_numeros.back() << endl;
    cout << lista_numeros.back() << endl;
    cout << lista_numeros.back() << endl;
    cout << lista_numeros.back() << endl;
    lista_numeros.pop_back();
    cout << lista_numeros.back() << endl;
    lista_numeros.pop_back();
    cout << lista_numeros.back() << endl;

    return 0;
}
