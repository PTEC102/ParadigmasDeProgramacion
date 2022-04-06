#include <iostream>
#include "lado.h"

using namespace std;

lado::lado(unsigned int longitud){
	this->longitud = longitud;
	cout << "LADO CREADO" << endl;
}

lado::~lado(){
	cout << "*Lado destruido" << endl;
}
