#include "figura.h"
#include <iostream>

using namespace std;


//ctor
figura::figura(string color){
    this->color = color;
    cout << "Se ha construido la FIGURA con color " << this->color << endl;
}
//dtor
figura::~figura(){
    cout << "Se ha destruido la FIGURA" << endl;
}

unsigned int figura::GetNumeroLados() {
    return Lados.size();
}

void figura::Setlado(lado *L) {
		Lados.push_back(L);
		cout << "- Agregado LADO de longitud " << L->longitud << endl; 
}
