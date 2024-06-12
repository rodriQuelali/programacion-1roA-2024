package estructuraRepetitivas;

import java.util.Iterator;
import java.util.Scanner;

public class OperadorFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ciclo FOR.
		
		/*for(i=0,i<10,i=i=1){
			verdadero....
		}*/
		//int i;
		//i=i+2
		int n = new Scanner(System.in).nextInt();
		for(int i=2;i<=n*10;i+=2) {
			System.out.println(i);
		}
	}

}
