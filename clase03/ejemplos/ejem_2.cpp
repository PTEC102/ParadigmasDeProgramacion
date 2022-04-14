#include <iostream>
#include <vector>
#include <set>
#include <ctime>
#include <cstdlib>
#include <algorithm>
#include <stdlib.h>
#include <time.h>
#include "tiempo.cpp"

using namespace std;
//g++ ejem_2.cpp -o main

//restar tiempo en dos variables
void restar_tiempo(Tiempo& start, Tiempo& end)
{
    int minutos;
    int hora;

    if(end.horas > start.horas){
        
        if(start.minutos > end.minutos){
            end.horas = end.horas - 1;
            
            hora = end.horas - start.horas;
            minutos = end.minutos + 60 - start.minutos;            

        }else{
            
            hora = end.horas - start.horas;            
            minutos = end.minutos - start.minutos;
            
        }
        cout << "Tiempo restado: " << hora << " horas y " << minutos << " minutos" << endl;
    }
}


int main(){

    Tiempo start(15, 00);
    Tiempo end(16, 30);

    restar_tiempo(start, end);
    return 0;
}