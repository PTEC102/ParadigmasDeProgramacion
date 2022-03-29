#include <iostream>
#include <map>
#include <string>

using namespace std;
 
int main()
{
  // Cre map de string e int
  std::map<std::string, int> m { {"pedro", 11}, {"jose", 25}, {"eduardo", 80}, };
 
  m["pedro"] = 25;  // actualiza pedro
  m["juan"] = 30;   // inserta juan 

	// muestra llave valor en el map
	for (auto [key, value] : m) {
      std::cout << '[' << key << "] = " << value << "; ";
  }
	cout << endl;
 
  m.erase("jose"); // borra a jose
	for (auto [key, value] : m) {
      std::cout << '[' << key << "] = " << value << "; ";
  }
	cout << endl;

 	cout << "Tamano = " << m.size() << endl;
	m.clear();
	std::cout << "Tamano despues de borrado = " << m.size() << endl;

	return 0;
}
