#include "triangulo.h"
#include <iostream>

using namespace std;


//ctor
triangulo::triangulo(string color){
    this->color = color;
    cout << "Se ha construido el TRIANGULO con color " << this->color << endl;
}
//dtor
triangulo::~triangulo(){
		// como lado fue creado en este ámbito aqui debe ser destruido
		for (lado *L : this->Lados){
			delete L;
		}
    cout << "Se ha destruido el TRIANGULO" << endl;
}

unsigned int triangulo::GetNumeroLados() {
    return Lados.size();
}

void triangulo::Setlado(int longitud) {
		lado *l = new lado(longitud);
		Lados.push_back(l);
		cout << "- Agregado LADO de longitud " << l->longitud << endl; 
}
