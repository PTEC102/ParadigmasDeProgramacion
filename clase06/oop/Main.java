package clase06.oop;

public class Main {
    
    public static void main(String[] args) {

        Vehiculo miVehiculo = new Vehiculo();
        Vehiculo otroVehiculo = new Vehiculo("Sedan","V6");

        Bicicleta miBicicleta = new Bicicleta("Mountain");

        //Automovil mi_automovil = new Automovil(); //Esto da un error dado que Automovil no tiene un constructor vacio

        Automovil miAutomovil = new Automovil("Ferrari","V8");
        
        otroVehiculo.Encender();


        miAutomovil.Encender();

        miBicicleta.Encender();
        miBicicleta.Acelerar(10);
    }
}
