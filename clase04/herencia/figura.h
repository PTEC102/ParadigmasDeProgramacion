#include <string>

using namespace std;

class figura {
    public:
        // ctor y dtor
        figura(unsigned int lados, std::string color);
        figura();
        ~figura();
        // getters
        unsigned int Getlados();
        std::string Getcolor();
        // setters
        void Setlados(unsigned int val);
        void Setcolor(std::string val);

				// Metodos por defecto

    protected:
        unsigned int lados;
        std::string color;
    private:

};