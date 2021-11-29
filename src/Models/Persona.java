package Models;

import java.io.InputStream;

public class Persona {
	
	private String nombre;
	private String apellidos;
	private String dni;
	private double sueldo;
	private CuentaCorriente cuentaco;
	//getters and setters
	public String getNombre() {
		return nombre;
	}
	public String getApellidos() {
		return apellidos;
	}
	
	public String getDni() {
		return dni;
	}
	public double getSueldo() {
		return sueldo;
	}
	
	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}
	
	public CuentaCorriente getCuentaco() {
		return cuentaco;
	}
	public void setCuentaco(CuentaCorriente cuentaco) {
		this.cuentaco = cuentaco;
	}
	//constructors
	public Persona(String nombre, String apellidos, String dni, double sueldo,CuentaCorriente cuentaco) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.dni = dni;
		this.sueldo = sueldo;
		this.cuentaco =cuentaco;
		
	}
	
		// TODO Auto-generated constructor stub
	
	//metedos
	public void CobrarSueldo() {
		cuentaco.setSaldo(sueldo+cuentaco.getSaldo());
	}
	public void SacarPasta(double m) {
		if(m<cuentaco.getSaldo())
		cuentaco.setSaldo(m);
		else
			System.out.println("Tu saldo es insuficiente.");
		
	}
	public void SubirSueldo(double m) {
		if(m>sueldo)
			setSueldo(m);
		else {
			setSueldo(sueldo);
			System.out.println("no se puede bajar el sueldo con esta opcion");}
		
	}
	
	// tostring

	public String toString() {
		return "Persona [nombre=" + nombre + ", apellidos=" + apellidos + ", dni=" + dni + ", sueldo=" + sueldo +", cuentacorriente="+cuentaco.getNumeroCuenta()+"saldo= "+cuentaco.getSaldo() +"]";
	}
	
	
	
	
	
	
	
	
}
