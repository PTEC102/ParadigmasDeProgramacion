#include "figura.h"
#include <iostream>

using namespace std;



figura::figura(unsigned int lados, string color){
    //ctor
    this->lados = lados;
    this->color = color;
    cout << "Se ha construido la FIGURA con " << this->lados << " lados y color " << this->color << endl;
}
figura::figura(){
    //ctor
    this->lados = lados;
    this->color = color;
    cout << "Se ha construido la FIGURA sin parametros" << endl;
}

figura::~figura(){
    //dtor
    cout << "Se ha destruido la FIGURA" << endl;
}

unsigned int figura::Getlados() {
    return lados;
}
void figura::Setlados(unsigned int val) {
    lados = val;
}
std::string figura::Getcolor() {
    return color;
}
void figura::Setcolor(std::string val) {
    color = val;
}
