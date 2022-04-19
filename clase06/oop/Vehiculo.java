package clase06.oop;

public class Vehiculo implements IVehiculo {
	
	public String Modelo;
	public boolean EstadoMotor;
	public String TipoMotor;
	public int Marcha;
	public int Velocidad;

	public Vehiculo() {

	}

	public Vehiculo(String modelo, String tipo_motor) {
		this.Modelo = modelo;
		this.TipoMotor = tipo_motor;
		this.Velocidad = 0;
		this.Marcha = 0;
	}

	public void Encender() {
		if (!this.EstadoMotor) {
			this.EstadoMotor = true;
		}

		System.out.println("Motor encendido");
	};

	public int AumentarMarcha() {
		++(this.Marcha);
		return this.Marcha;
	};

	public void Acelerar(int v) {
		if (this.Velocidad < v) {
			this.Velocidad = v;
		}
	};
}