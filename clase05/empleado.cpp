#include <iostream>
#include "empleado.h"

using namespace std;

Empleado::Empleado(string nombre) : Persona(nombre) {
	cout << "creada EMPLEADO, nombre " << nombre << endl;
	this->nombre = nombre;
}

void Empleado::get_nombre(){
	cout << "++ EMPLEADO NOMBRE" << this->nombre << endl;
}