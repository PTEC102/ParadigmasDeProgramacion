#include "vehiculo.h"

//g++ main.cpp vehiculo.cpp -o main.exe
int main() {
  Vehiculo auto_sedan("Sedan","V6");

  cout << "modelo: " << auto_sedan.modelo << endl; 
  //cout << "auto id: " << auto_sedan.auto_id << endl; 
  auto_sedan.encender();

  Vehiculo auto_otro("otro","V8");
  cout << "modelo: " << auto_otro.modelo << endl; 
  auto_otro.encender();
  
  return 0;
}