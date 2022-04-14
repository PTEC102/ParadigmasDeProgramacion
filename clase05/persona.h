#pragma once 
#include <string>
using namespace std;
class Persona { 
	public:
		int anos_de_trabajo;
		Persona(string nombre); // *implementar metodo constructor
		virtual void get_nombre(); // imprimira su nombre
		string obtener_nombre();
	protected: // define la visibilidad, solo puede ser accedido por la misma clase o sus clases derivadas
		string nombre;
};
