#include <string>
#include <iostream>
using namespace std;

class Vehiculo{
  private:
    int vehiculo_id;
  public:
    string modelo;
    bool estado_motor;
    string tipo_motor; 
    int marcha; 
    int velocidad;

    Vehiculo();
    Vehiculo(string modelo, string tipo_motor);
    ~Vehiculo();

    void encender();
    int aumentar_marcha(); 
    void acelerar(int v);
};