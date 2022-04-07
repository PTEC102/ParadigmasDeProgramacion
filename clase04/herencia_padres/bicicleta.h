#include "automovil.h"


class Bicicleta : public Vehiculo{
    private:
        int bicicleta_id;
    public:
        
        Bicicleta();
        Bicicleta(string modelo);
        ~Bicicleta();
        
        void encender();
        void aumentar_marcha(); 
        void acelerar(int v);
};
