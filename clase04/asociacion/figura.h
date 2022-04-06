#include <string>
#include <vector>

#include "lado.h"

using namespace std;

class figura {
    public:
				vector<lado*> Lados;
        // ctor y dtor
        figura(string color);
        figura();
        ~figura();
        // getters
        unsigned int GetNumeroLados();
        void Setlado(lado *L);
        

    private:
				string color;


};