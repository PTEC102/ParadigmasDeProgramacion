#include <iostream>
#include <string.h>
//#include "figura.h"
#include "cuadrado.h"
using namespace std;

int main()
{

    //unsigned int a = 102;
    //figura figura1(a,"blanco");

    /**
    EJEMPLO DE CLASES CON SUS CORRESPONDIENTES .CPP Y .H
    RECORDAR QUE EN EL .H VA LA DEFINICIÓN DE LA CLASE (TODOS LOS ATRIBUTOS Y MÉTODOS CON SUS CORRESPONDIENTES TIPOS DE DATOS DE SALIDA Y ARGUMENTOS DE ENTRADA)
    Y EN LOS .CPP VAN LAS IMPLEMENTACIONES DE LOS MÉTODOS (ES DECIR, LO QUE HACE EL MÉTODO)

    EN ESTE CASO, CUADRADO HEREDA DE FIGURA. PUEDE PROBAR DIFERENTES INSTANCIACIONES Y VERIFICAR QUE CONSTRUCTOR SE EJECUTA.
    */
    cuadrado square("rojo", 1);

    cout << "el color es: " << square.Getcolor()   << endl;
    return 0;
}