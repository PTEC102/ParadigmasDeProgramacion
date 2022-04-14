#pragma once 
#include <string>
#include "persona.h"

using namespace std;

class Estudiante : public Persona {
	public:
		Estudiante(string nombre); //: Persona(nombre)
		void get_nombre();
};