#include <iostream>
#include "figura.h"

int main() {
  figura f(1,10);
	f.calcular_area();

	figura* a = new figura(2,20);
	a->calcular_area();
	//a->metodo_privado(); // observe que pasa al compilar con esta linea
	delete a;
} 