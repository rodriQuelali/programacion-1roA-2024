package condicionales;

import java.util.Scanner;

public abstract class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//utilizando case
		double a,b,r;
		int estado;
		System.out.println("seleccione la operacion 1: suma, resta: 2, multplicacion: 3 y division : 4");
		estado = new Scanner(System.in).nextInt();
		System.out.println("ingresa los valores para realizar la operacion");
		a = new Scanner(System.in).nextDouble();
		b = new Scanner(System.in).nextDouble();
		switch (estado) {
			case 1: {
				r = a+b;
				System.out.println(r);
				break;
			}
			case 2: {
				r = a-b;
				System.out.println(r);
				break;
			}
			case 3: {
				r = a*b;
				System.out.println(r);
				break;
			}
			case 4: {
				if(b>0) {
					r = a/b;
					System.out.println(r);
				}else {
					System.out.println("no se puede .....");
				}
				
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + estado);
		}
	}

}
