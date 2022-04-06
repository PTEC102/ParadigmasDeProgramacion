#include <string>
#include "figura.h"

class cuadrado : public figura {
    public:
        // ctor y dtor
        cuadrado(std::string color, int medida_lado);
        ~cuadrado();
        // getters
        std::string Getcolor();
        // setters
        void Setcolor(std::string val);

        // otras cosas
        void MostrarLados();

    protected:

    private:
        unsigned int medida_lado;

};
