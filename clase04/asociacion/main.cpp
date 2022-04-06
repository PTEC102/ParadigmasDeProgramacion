#include <iostream>
#include <string.h>
#include "figura.h"
#include "triangulo.h"
using namespace std;

int main()
{
		figura *fig = new figura("azul"); // esta figura es un triangulo
	
		lado *L1 = new lado(120);	
		fig->Setlado(L1);
		lado *L2 = new lado(20);	
		fig->Setlado(L2);
		lado *L3 = new lado(15);	
		fig->Setlado(L3);
		cout << "Figura tiene " << fig->Lados.size() << " Lados" << endl;
		delete fig; // se destruye la figura, y los lados?

		triangulo *tri = new triangulo("verde");
		tri->Setlado(10);
		tri->Setlado(20);
		tri->Setlado(30);
		delete tri;
		
    return 0;
}