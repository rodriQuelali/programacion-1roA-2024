package estructuraRepetitivas;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Do, ingresa por primera vez al ciclo.
		//{
		//si
		//}
		//do(condicion)
		//no
		/*int x = 0;
		do {
			System.out.println("hola");
			x++;
		} while (x < 10);
		*/
		//donde se aplica do, en validaciones de datos
		//N = 2
		//1,2
		//N-2
		int n,x,c=1;
		System.out.println("ingrese datos......");
		do {
			System.out.println("ingrese datos positivos");
			n = new Scanner(System.in).nextInt();
		} while (n<0);
		System.out.print("datos correctos!!!!");
		while (c<=n) {
			System.out.print("ingrese valor " + c + ":");
			x = new Scanner(System.in).nextInt();
			System.out.println(x);
			c++;
		}
		
		
	}

}
