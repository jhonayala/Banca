package Models;

public class CuentaCorriente {
	// Crea la clase CuentaCorriente: númeroCuenta, saldo, titular (este último será
	// una Persona)
	// propiedades
	private int numeroCuenta;
	private double saldo;
	private Persona titular;

// Getters and Setters
	public int getNumeroCuenta() {
		return numeroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public Persona getTitular() {
		return titular;
	}
//constructorssumarCantidad(double cantidad)
	//restarCantidad(double cantidad)


	public CuentaCorriente(int numeroCuenta, double saldo, Persona titular) {
		super();
		this.numeroCuenta = numeroCuenta;
		this.saldo = saldo;
		this.titular = titular;
		
	}
	// metodos
	public void sumarCantidad(double cantidad) {
		setSaldo(cantidad + saldo);
		
		
	}
	public void restarCantidad(double cantidad) {
		setSaldo(saldo-cantidad);
		
	}
	
	

// to string

	public String toString() {
		return "CuentaCorriente [numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", titular=" + titular + "]";
	}

}
