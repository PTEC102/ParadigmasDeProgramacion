#include "bicicleta.h"
#include "automovil.h"

//g++ main.cpp vehiculo.cpp automovil.cpp bicicleta.cpp -o main.exe

void funcion_vehiculo(Vehiculo v){
    v.encender();
}

void funcion_bici(Bicicleta b){
    b.encender();
}

//function template
template <class T>
void funcion_template(T t){
    t->encender();
}


int main() {
  // Vehiculo un_vehiculo("Sedan","V6");
  Vehiculo *un_vehiculo = new Vehiculo("Sedan","V6");

  cout << "modelo: " << un_vehiculo->modelo << endl; 
  //cout << "auto id: " << un_vehiculo->vehiculo_id << endl; //error dado que es privado
  un_vehiculo->encender();

  // Vehiculo otro_vehiculo("otro","V8");
  // cout << "modelo: " << otro_vehiculo.modelo << endl; 
  // otro_vehiculo.encender();
  

  
  
  Automovil *mi_auto = new Automovil("Ferrari","V8");
  mi_auto->encender();


  Bicicleta *mi_bici = new Bicicleta("Bici");
  //mi_bici.encender();

  funcion_vehiculo(*mi_auto); //Vemos que en cada llamada destruye un objeto
  funcion_vehiculo(*mi_bici); //Vemos que en cada llamada destruye un objeto

  funcion_bici(*mi_bici); //Vemos que en cada llamada destruye un objeto

  funcion_template(mi_auto); //Se envia el puntero por lo que no se destruye el objeto
  funcion_template(mi_bici); //Se envia el puntero por lo que no se destruye el objeto

  delete un_vehiculo;
  delete mi_auto;
  delete mi_bici;
  return 0;
}

/*
  Podemos ver que cada vez que se contruye un objeto heredado, tambien se destruye el objeto padre.
*/