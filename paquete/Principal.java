package paquete;

import java.util.Scanner;

public class Principal {
	/**
	 * Funcion para pedir un entero
	 * 
	 * @param enun
	 * @return entero
	 */
	@SuppressWarnings("resource")
	private static int pedirEntero(String enun) {
		System.out.println(enun);
		return new Scanner(System.in).nextInt();
	}

	/**
	 * Funcion para pedir numeros decimales de gran precision
	 * 
	 * @param enunciado
	 * @return
	 */
	@SuppressWarnings("resource")
	private static double pedirFlotante(String enunciado) {
		System.out.println(enunciado);
		return new Scanner(System.in).nextDouble();
	}

	/**
	 * Metodo que calcula el Area de un circulo
	 * 
	 * @param radio
	 * @return PI · radio al cuadrado
	 */
	private static double CalcularAreaCirculo(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	private static void Menu() {
		int opc = 0;
		do {// Utilizo do while para garantizar que pido la opcion al menos una vez
			System.out.println("1-. Calcular Area Circulo");
			System.out.println("2-. Calcular Area Rectangulo");
			System.out.println("3-. Calcular Area Triangulo");
			System.out.println("4-. Salir");
			opc = pedirEntero("Elige una Opcion del Menu");
			switch (opc) {
			case 1:
				System.out.println(
						"El Area del circulo es: " + CalcularAreaCirculo(pedirFlotante("Introduzca el radio")));
				break;
			case 2:
				System.out.println("El Area del rectangulo es: " + CalcularAreaRectangulo(
						pedirFlotante("Introduzca la base "), pedirFlotante("Introduzca la altura")));
				break;
			case 3:
				System.out.println("El Area del Triangulo es: " + CalcularAreaTriangulo(
						pedirFlotante("Introduzca la base "), pedirFlotante("Introduzca la altura")));
				break;
			}
		} while (opc < 4);
	}

	/**
	 * Metodo que calcula el area de un TRiangulo
	 * 
	 * @param base
	 * @param altura
	 * @return base · (altura / 2)
	 */
	private static double CalcularAreaTriangulo(double base, double altura) {
		return base * (altura / 2);

	}

	private static double CalcularAreaRectangulo(double base, double altura) {
		return base * altura;
	}

	public static void main(String[] args) {
		Menu();
	}
}
