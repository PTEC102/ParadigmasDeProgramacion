#include <iostream>
#include <cstring>
using namespace std;



class Persona {
  public:
  int anos_de_trabajo = 10;
   Persona(string n) { 
      this->nombre = n;
   }
   virtual void VerNombre() { cout << nombre << endl; }
  protected:
   string nombre;
};

class Empleado : public Persona {
  public:
   Empleado(string n) : Persona(n) {}
   
   void VerNombre() {
      cout << "Emp: " << nombre << endl;
   }
};

class Estudiante : public Persona {
  public:
   Estudiante(string n) : Persona(n) {}
   void VerNombre() {
      cout << "Est: " << nombre << endl;
   }
};
/*
*/
void F1(Persona P){
   cout << "Los anos de trabajo " << P.anos_de_trabajo << endl;
}

/*
template <typename T>
void F2(T obj){
   cout << "Los anos de trabajo " << obj.anos_de_trabajo << endl;
}
*/

int main() {

   Persona *Pepito = new Estudiante("Jose"); // PEPITO DE TIPO PERSONA SE INSTANCIA COMO ESTUDIANTE
   Persona *Carlos = new Empleado("Carlos"); // CARLOS DE TIPO PERSONA SE INSTANCIA COMO EMPLEADO

   Carlos->VerNombre(); // CARLOS MUESTRA SU NOMBRE COMO EMPLEADO
   Pepito->VerNombre(); // PEPITO MUESTRA SU NOMBRE COMO ESTUDIANTE
   /** PRUEBE Y VERIFIQUE QUE PASA AL ELIMINAR EL PREFIJO "VIRTUAL" DESDE EL METODO MOSTRAR NOMBRE DE LA CLASE PERSONA */

   Carlos->Persona::VerNombre();

   F1(*Carlos);

   //F2(*Carlos); Llama a la funcion en template
   //F2(86652); // arroja error de compilacion ya que


   delete Pepito;
   delete Carlos;

   return 0;
}
