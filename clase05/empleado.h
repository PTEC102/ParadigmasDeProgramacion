#pragma once 
#include <string>
#include "persona.h"

using namespace std;

class Empleado : public Persona {
	public:
		Empleado(string nombre); //: Persona(nombre)
		void get_nombre();
};