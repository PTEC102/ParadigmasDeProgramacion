#include "automovil.h"

int id_aux_auto = 0;

Automovil::Automovil(){
  
  this->estado_motor = false;
  this->marcha = 0;
  this->automovil_id = ++id_aux_auto;
}


Automovil::Automovil(string modelo, string tipo_motor){
  this->estado_motor = false;
  this->marcha = 0;
  this->automovil_id = ++id_aux_auto;
  
  this->modelo = modelo;
  this->tipo_motor = tipo_motor;
}

Automovil::~Automovil(){
  cout<< "Automovil " << this->automovil_id << " Destruido" << endl;
}
