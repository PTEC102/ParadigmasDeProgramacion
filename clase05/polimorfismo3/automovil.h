//create a class auto with inheritance from class vehiculo
#include "vehiculo.h"


class Automovil : public Vehiculo{
    private:
        int automovil_id;
    public:
        
        Automovil();
        Automovil(string modelo, string tipo_motor);
        ~Automovil();        
};
