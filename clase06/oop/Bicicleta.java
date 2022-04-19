package clase06.oop;

public class Bicicleta extends Vehiculo {
            
    public Bicicleta(String modelo) {
        super();
        this.Modelo = modelo;
    }
    
    public void Encender() {               
        System.out.println("Soy una bici sin motor");
        System.out.println("No me puedo encender, pero si puedes encender las luces");
    };
    
    public int AumentarMarcha() {
        ++(this.Marcha);
        return this.Marcha;
    };
    
    public void Acelerar(int v) {
        if (this.Velocidad < v) {
            this.Velocidad = v;
        }
        System.out.println("Esta pedaleando más rápido, a una velocidad de " + this.Velocidad + " km/h");
    };
}
