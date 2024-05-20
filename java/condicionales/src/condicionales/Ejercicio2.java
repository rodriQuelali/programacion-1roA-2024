package condicionales;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Ingrese primer numero: ");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Ingrese segundo numero: ");
		int b = new Scanner(System.in).nextInt();
		if (a > b) {
			System.out.println("si es mayor: "+a);	
		}else{
			System.out.println("si es mayor: "+b);
		}
	}

}
