#include <string>
#include <vector>

#include "lado.h"

using namespace std;

class triangulo {
    public:
				vector<lado*> Lados;
        // ctor y dtor
        triangulo(string color);
        triangulo();
        ~triangulo();
        // getters
        unsigned int GetNumeroLados();
        void Setlado(int longitudlado);
        

    private:
				string color;


};