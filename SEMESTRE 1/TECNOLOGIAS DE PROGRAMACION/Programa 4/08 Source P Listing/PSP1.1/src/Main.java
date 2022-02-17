/******************************************************************/
/* Program Assignment:  PSP1.1                                                         */
/* Name:                Edgar Valentin Ruiz Padilla               */
/* Date:                13-noviembre-2021gram                     */
/* Description:         Programa calcular correlacion  oes        */
/******************************************************************/
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		int Ntemp = 0;
		String Entrada = "";
		Boolean VEntrada = false;
		Scanner entrada = new Scanner(System.in);
		System.out.println("Programa para calcular la Correlacion de 2 conjuntos de numeros");
		while (VEntrada != true) {
			System.out.println("Ingresa la cantidad de numeros por conjunto a ingresar");
			Entrada = entrada.nextLine();
			VEntrada = Entrada.matches("[+-]?\\d*(\\.\\d+)?");
		}
		Ntemp = Integer.parseInt(Entrada);
		double[] DBX = new double[Ntemp];
		VEntrada = false;
		for (int b = 0; b < Ntemp; b++) {
			while (VEntrada != true) {
				int bT = b + 1;
				System.out.println("Ingrese el numero " + bT + " del conjunto X");
				Entrada = entrada.nextLine();
				VEntrada = Entrada.matches("[+-]?\\d*(\\.\\d+)?");
			}
			DBX[b] = Double.parseDouble(Entrada);
			VEntrada = false;
		}
		double[] DBY = new double[Ntemp];
		VEntrada = false;
		for (int b = 0; b < Ntemp; b++) {
			while (VEntrada != true) {
				int bT = b + 1;
				System.out.println("Ingrese el numero " + bT + " del conjunto Y");
				Entrada = entrada.nextLine();
				VEntrada = Entrada.matches("[+-]?\\d*(\\.\\d+)?");
			}
			DBY[b] = Double.parseDouble(Entrada);
			VEntrada = false;
		}
		VEntrada = false;
		Operaciones operacion = new Operaciones();		
		double Resultado=0;
		entrada.close();
		Resultado = operacion.Correlacion(DBX, DBY);
		System.out.println("La correlacion rx,y es: " + Resultado);
		System.out.println("La correlacion r^2 es: " + Math.pow(Resultado, 2));
	}

}
