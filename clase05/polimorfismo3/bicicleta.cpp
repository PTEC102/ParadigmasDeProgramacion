#include "bicicleta.h"


int id_aux_bici = 0;

Bicicleta::Bicicleta(){
  
  this->estado_motor = false;
  this->marcha = 0;
  this->bicicleta_id = ++id_aux_bici;
}


Bicicleta::Bicicleta(string modelo){
  this->estado_motor = false;
  this->marcha = 0;
  this->bicicleta_id = ++id_aux_bici;
  
  this->modelo = modelo;  
}

Bicicleta::~Bicicleta(){
  cout<< "Bicicleta " << this->bicicleta_id << " Destruida" << endl;
}

void Bicicleta::encender(){  
  cout << "La bicicleta " << this->bicicleta_id << " ";
  cout << "No puede ser encendida" << endl;
}

void Bicicleta::aumentar_marcha(){
  cout << "No puede aumentar marcha" << endl;
}

void Bicicleta::acelerar(int v){
  if(this->velocidad < v){
    this->velocidad = v;
  }
  cout << "Esta pedaleando más rapido" << endl;
}