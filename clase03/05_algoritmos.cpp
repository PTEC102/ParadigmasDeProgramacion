#include <algorithm>
#include <iostream>
#include <iterator>
#include <vector>

using namespace std; 

bool divisible_por_2(int i){
	if (i % 2 == 0){
		return true;
	}
	else {
		return false;
	}
}

int main()
{
		// declara un vector con numeros
    vector<int> v = { 1, 2, 9, 4, 3, 7, 8, 9, 10, 4 };
    cout << "v: ";
    // pasamos la funcion cout
		copy(v.begin(), v.end(), ostream_iterator<int>(cout, " "));
    
		std::cout << endl;
 
    // determinar cuantos numeros existen de cierto valor
    for (const int num: {3, 4, 5}) {
        int num_items = count(v.cbegin(), v.cend(), num);
        cout << "numero: " << num << ", cantidad: " << num_items << endl;
    }

		int count_equal4 = count(v.begin(), v.end(), 4);
		cout << "iguales a 4: " << count_equal4 << endl;

		int count_div2 = count_if(v.begin(), v.end(), divisible_por_2);
    cout << "divisibles por 2: " << count_div2 << endl;
	
		// tambien podriamos utilizar una funcion lambda para aplicar (similar a filter de programacion funcional). Encontrar cuales de ellos son divisibles por 4.
    int count_div4 = count_if(v.begin(), v.end(), [](int i){return i % 4 == 0;});
    cout << "divisibles por 4: " << count_div4 << endl;

		// verifica si esta ordenado
		cout << ": esta ordenado: " << boolalpha
              << is_sorted(v.begin(), v.end()) << endl;
 		
		// ordena el vector
    sort(v.begin(), v.end());
		
		// lo muestra
		for (int elem : v){
			cout << elem << ", ";
		}
		cout << endl;

		cout << ": esta ordenado: " << boolalpha
              << is_sorted(begin(v), end(v)) << endl;	
    
}
