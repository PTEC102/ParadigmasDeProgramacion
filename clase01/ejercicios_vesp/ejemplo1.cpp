// puede leer los numeros por teclado o por un archivo usando ./programa.o < num.txt

#include <iostream>
//#include <stdlib.h> // si utilizamos la funcion malloc debemos incluir esta biblioteca
using namespace std;

int main()
{
	int *p; //declaracion de pntero
	int i=0;

	// reserva memoria pero usando malloc (C like)
	//p = (int*) malloc(sizeof(int)*5);
	// reserva memoria para un arreglo de 5 elementos de int usando new (C++ like)
	p = new int[5];

	cout << "Lee los 5 elementos por teclado :\n";
	for(i=0;i<5;i++)
		cin>>p[i];

	cout<<"La entrada es :\n";
	for(i=0;i<5;i++)
		cout<<p[i]<<endl;
	
	delete p;
	return 0;
}
