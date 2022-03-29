#include <iostream>
//#include <iterator>
#include <set>
 
using namespace std;
 
int main()
{
    set<int> s1;
    // si no especificamos el orden se ordena creciente
	//set<int, greater<int> > s1;
 
    s1.insert(140);
    s1.insert(30);
    s1.insert(6);
    s1.insert(20);
    s1.insert(150);

	// de estas inserciones, solo insertara el 10
	// ya que el 150 ya está
    s1.insert(150);
    s1.insert(10);
 
    // imprimir
    set<int>::iterator itr;
    for (itr = s1.begin(); itr != s1.end(); itr++) {
        cout << *itr << " ";
    }
    cout << endl;
	// tambien se puede utilizar un iterador y el
	// tipo auto
	for(auto s : s1){
		cout << s << "--";
	}
    
    return 0;
}



