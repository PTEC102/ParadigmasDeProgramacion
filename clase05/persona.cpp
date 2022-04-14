#include <iostream>
#include "persona.h"

using namespace std;

Persona::Persona(string nombre) {
	this->nombre = nombre;
	cout << "creada PERSONA, nombre " << nombre << endl;
}
string Persona::obtener_nombre(){
	return this->nombre;
}

void Persona::get_nombre(){
	cout << "** PERSONA NOMBRE: " << this->nombre << endl;
}