#include "vehiculo.h"

int id_aux = 0;

Vehiculo::Vehiculo(){
  
  this->estado_motor = false;
  this->marcha = 0;
  this->auto_id = ++id_aux;
}

Vehiculo::Vehiculo(string modelo, string tipo_motor){
  this->estado_motor = false;
  this->marcha = 0;
  this->auto_id = ++id_aux;
  
  this->modelo = modelo;
  this->tipo_motor = tipo_motor;
}

Vehiculo::~Vehiculo(){
  cout<< "Auto " << this->auto_id << " Destructor" << endl;
}

void Vehiculo::encender(){
  if( !this->estado_motor ){
    this->estado_motor = true;
  }
  cout << "Motor encendido" << endl;
}

int Vehiculo::aumentar_marcha(){
  ++(this->marcha);
  return this->marcha;
}

void Vehiculo::acelerar(int v){
  if(this->velocidad < v){
    this->velocidad = v;
  }
}