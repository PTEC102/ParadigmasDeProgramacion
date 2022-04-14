#include <iostream>
#include "estudiante.h"

using namespace std;

// Recordemos que este constructor debe indicar como será implementado el metodo constructor de la clase padre. En este caso Persona al no incluir un constructor por defecto (vacio) requiere que explicitamente le digamos a su clase derivada como implementar el constructor de la clase padre.
Estudiante::Estudiante(string nombre) : Persona(nombre) {
	cout << "creada ESTUDIANTE, nombre " << nombre << endl; 
	this->nombre = nombre;
}

void Estudiante::get_nombre(){
	cout << "-- ESTUDIANTE NOMBRE" << this->nombre << endl;
}
