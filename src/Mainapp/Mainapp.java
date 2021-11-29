package Mainapp;

import java.util.ArrayList;
import java.util.Scanner;

import Models.CuentaCorriente;
import Models.Persona;

public class Mainapp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// array para almacenar a las personas
		ArrayList<Persona> clientes = new ArrayList<Persona>();
		// array para almacenar las cuentas
		ArrayList<CuentaCorriente> cuentas = new ArrayList<CuentaCorriente>();
		boolean error;

		//
		int m = 0;
		Persona admin = new Persona("admin", " admin", "xxxxxxxxxZ", 999, null);
		CuentaCorriente CuAdmin = new CuentaCorriente(100, 999, admin);
		admin.setCuentaco(CuAdmin);
		clientes.add(admin);
		cuentas.add(CuAdmin);
		int opcion4;
		boolean SalirProg = false;

		boolean Menuper;

		String eleccion;
		do {// menu inicial
			System.out.println("--MENU INICIAL--");
			System.out.println("a) Añadir persona");

			System.out.println("b) elegir perosna");

			System.out.println("c) Borrar persona");

			System.out.println("d) Salir");
			eleccion = sc.nextLine();
			switch (eleccion) {
			/*
			 * metodo para añadir persona
			 */
			case "a":
				System.out.println("--Añadir persona--");
				// se introducen los datos
				System.out.println("nombre : ");
				String nombre = sc.nextLine();
				System.out.println("Aperllidos...");
				String apellido = sc.nextLine();
				System.out.println("DNI...");
				String Dni = sc.nextLine();
				// Se crea la persona y la cuenta.
				cuentas.add(new CuentaCorriente(m++, 0, null));
				clientes.add(new Persona(nombre, apellido, Dni, 0, cuentas.get(m)));
				System.out.println(clientes.get(m));

				break;
			/*
			 * opciones de elegir persona
			 */
			case "b":
				if (clientes.size() > 0) {
					System.out.println("--elegir persona--");
					int i = 0;
					for (Persona c : clientes) {
						i++;
						System.out.println(i + ". " + clientes.get(i - 1));

					}
					int elePerso = 0;
					do {
						try {
							elePerso = Integer.parseInt(sc.nextLine());
							if (elePerso > i) {
								do {
									System.out.println("Ingrese una opcion existente.");
									elePerso = Integer.parseInt(sc.nextLine());
								} while (elePerso > i);
							}
							else {error=false;}}
							catch (Exception e) {
							System.out.println("Ingrese un opcion existente");
							elePerso=Integer.parseInt(sc.nextLine());
							
							

						}
						
						
							
						
					} while ((elePerso !=1) || (elePerso!=2)||(elePerso!=3)||(elePerso!=4)||(error=false));
					
					
					if(elePerso<=i) {
					
					System.out.println(clientes.get(elePerso - 1));}
					/*
					 * menu de elegir persona
					 */
					System.out.println(
							"I. Cobrar sueldo \nII. Sacar pasta \nIII. Subir sueldo \nIV. Mostrar destalles de la persona");
					int operacion = Integer.parseInt(sc.nextLine());

					System.out.println("--elegir persona--");
					switch (operacion) {
					/*
					 * cobrar el sueldo
					 */
					case 1:
						System.out.println("--cobrar sueldo--");
						clientes.get(elePerso - 1).CobrarSueldo();
						System.out.println(CuAdmin.getSaldo());
						break;
					/*
					 * extrer dinero
					 */
					case 2:
						System.out.println("Introduzca la cantida de dinero que desea extraer");
						int GetMoney = Integer.parseInt(sc.nextLine());
						clientes.get(elePerso - 1).SacarPasta(GetMoney);
						System.out.println("Se ha retirado " + GetMoney + "$ de su cuenta");
						System.out.println("Ahora tiene " + cuentas.get(elePerso - 1).getSaldo() + " en su cuenta");

						break;

					// aumentar el sueldo
					case 3:
						System.out.println("Introduzca la cantidad que desea añadir a su sueldo:");
						double MasSueldo = Integer.parseInt(sc.nextLine());

						// añadir el valor que se desea sumar al sueldo base.

						clientes.get(elePerso - 1).SubirSueldo(MasSueldo);

						// imprime por pantalla el sueldo de la persona que se ha elegido
						System.out.println("Su sueldo actual es" + clientes.get(elePerso - 1).getSueldo());

						break;
					// mostrar infromacion de la persona
					case 4:
						System.out.println(clientes.get(elePerso - 1));

						break;
					}

					break;
				} else {
					System.out.println("El a la ultima persona");
				}
				break;
			/*
			 * eliminar una persona del array list de cliente
			 */
			case "c":
				int i = 1;
				for (Persona c : clientes) {

					System.out.println(i + ". " + clientes.get(i - 1));
					++i;
				}
				int remove = Integer.parseInt(sc.nextLine());

				clientes.remove(remove - 1);
				break;
			// Cerrar el programa.
			case "d":
				System.out.println("¡esto es un robo, aqui hacen de todo menos ingresar dinero!");

			default:
				System.out.println("ESA OPCION NO EXISTE");
				break;

			}
		} while (!eleccion.equals("d"));

	}
}
