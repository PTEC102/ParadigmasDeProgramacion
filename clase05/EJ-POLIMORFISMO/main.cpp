#include <iostream>

using namespace std;

class clase1 {
public:
    int valor1;
    virtual void Saludar(){
        cout << "Hola soy la clase1" << endl;
    }
};

class clase2 : public clase1 {
public:
    void Saludar(){
        cout << "No quiero saludar soy la clase 2" << endl;
    }
    void Saludar(int i){
        cout << "No se que es esto" << endl;
    }
};



int main() {
    /*
   clase2 objeto;

   objeto.clase1::Saludar();    // saludar desde clase padre
   objeto.Saludar();            // saludar desde metodo de clase2
   objeto.Saludar(1);           // metodo sobrecargado
    */

    clase1 *arreglo_de_objetos[3];

    arreglo_de_objetos[0] = new clase1();
    arreglo_de_objetos[1] = new clase2();

    // OBSERVE QUE ARREGLO_DE_OBJETOS ES UN ARREGLO DE TIPO CLASE 1
    arreglo_de_objetos[0]->Saludar();  // TIPO CLASE 1
    arreglo_de_objetos[1]->Saludar(); // EN UN ARREGLO DE OBJETOS TIPO CLASE 1 INSTANCIAMOS UN ELEMENTO TIPO CLASE 2, QUE SE COMPORTA COMO CLASE 2
    arreglo_de_objetos[1]->clase1::Saludar(); // PARA HACER QUE SE COMPORTE COMO CLASE 1 A PESAR DE SER CLASE 2

   return 0;
}
