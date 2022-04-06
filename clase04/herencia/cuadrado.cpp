#include "cuadrado.h"
//#include "figura.h"
#include <iostream>

using namespace std;

cuadrado::cuadrado(std::string color, int medida_lado){
    //ctor
    this->lados = 4;
    this->color = color;
    this->medida_lado = medida_lado;
    cout << "Se ha construido el CUADRADO con " << this->lados << " lados y color " << this->color << endl;
}

cuadrado::~cuadrado(){
    //dtor
    cout << "Se ha destruido el CUADRADO" << endl;
}

void cuadrado::MostrarLados() {
    cout << "Hola, soy un cuadrado y tengo " << this->lados << " lados" << endl;
}
std::string cuadrado::Getcolor() {
    return color;
}
void cuadrado::Setcolor(std::string val) {
    color = val;
}
