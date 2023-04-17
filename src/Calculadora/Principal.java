package Calculadora;

import java.util.Scanner;

class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int tope =0;
		double num1=0, num2=0, result=0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("BIENVENIDO A LA CALCULADORA");
		System.out.println("///////////////////////////");
		System.out.println();
		do {
			System.out.println();
			System.out.println("¿Qué operación desea realizar?");
			System.out.println("------------------------------");
			System.out.println("0. Salir.");
			System.out.println("1. Sumar.");
			System.out.println("2. Restar.");
			System.out.println("3. Dividir.");
			System.out.println("4. Multiplicar.");
			System.out.println("5. Resto.");
			System.out.println("------------------------------");
			System.out.println();
			tope = Integer.parseInt(sc.nextLine());
			switch (tope) {
			case 0:
				System.out.println("Saliendo");
				break;
			case 1:
				System.out.println("Primer número:");
				num1 = Double.parseDouble(sc.nextLine());
				System.out.println("Segundo número:");
				num2 = Double.parseDouble(sc.nextLine());
				result = num1 + num2;
				System.out.println("El resultado es: "+result);
				break;
			default:
				System.out.println("Opción desconocida.");
				break;
			}
			
		} while (tope != 0);
		System.out.println("Gracias.");
	}

}
