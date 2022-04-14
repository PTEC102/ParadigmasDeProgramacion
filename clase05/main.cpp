#include <iostream>
#include <string>
#include "persona.h"
#include "estudiante.h"
#include "empleado.h"

using namespace std;

void saludar(Persona p){
	cout << "!! ESTO ES UN SALUDO DE " << p.obtener_nombre() << endl;
}

int main() {
	Persona p("matias");
	p.get_nombre();

	Estudiante e("juan");
	e.get_nombre();

	Empleado j("pedro");
	j.get_nombre(); // imprime nombre como Empleado
	j.Persona::get_nombre(); // imprime nombre como Persona

	saludar(p);
	saludar(e);
	saludar(j);
	

}