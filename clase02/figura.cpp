#include "figura.h"
#include <iostream>

using namespace std;
//ctor: sin tipo, mismo nombre de la clase
figura::figura(int lados, int tamano_lados){
	cout << "CREADO" << endl;
	this->lados = lados;
	this->tamano_lados = tamano_lados;
}
figura::~figura(){
	cout << "DESTRUIDO" << endl;
}

int figura::calcular_area(){
	cout << "area: " << this->tamano_lados*this->tamano_lados << endl;
	this->metodo_privado();
	return 1;
}

void figura::metodo_privado(){
	cout << "SOY UN METODO PRIVADO" << endl;
}