package condicionales;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//condicionales en java:
		//condicional simple.
		/*if (condicion)
		 * {
		 * operacion verdadera
		 * }
		 * */
		System.out.println("Ingrese primer numero: ");
		int a = new Scanner(System.in).nextInt();
		System.out.println("Ingrese segundo numero: ");
		int b = new Scanner(System.in).nextInt();
		if (a > b) {
			System.out.println("si es mayor: "+a);	
		}else{
			System.out.println("si es mayor: "+b);
		}
		//ejejrcicio 1, if anidado
		/*if (condicion) {
			verdadero	
		}else if(condicion){
			verdadero
		}else{
			falso
		}*/
	}

}
