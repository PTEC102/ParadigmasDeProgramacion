#include "bicicleta.h"

//g++ main.cpp vehiculo.cpp automovil.cpp bicicleta.cpp -o main.exe
int main() {
  Vehiculo un_vehiculo("Sedan","V6");

  cout << "modelo: " << un_vehiculo.modelo << endl; 
  //cout << "auto id: " << un_vehiculo.vehiculo_id << endl; 
  un_vehiculo.encender();

  Vehiculo otro_vehiculo("otro","V8");
  cout << "modelo: " << otro_vehiculo.modelo << endl; 
  otro_vehiculo.encender();
  

  

  Automovil mi_auto("Ferrari","V8");
  mi_auto.encender();


  Bicicleta mi_bici("Bici");
  mi_bici.encender();

  return 0;
}

/*
  Podemos ver que cada vez que se contruye un objeto heredado, tambien se destruye el objeto padre.
*/