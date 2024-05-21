package condicionales;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//if(){
		/*verdadero
		 * }else{
		 * falso
		 * }*/
		/*if anidados
		 * if(){
		 * verdadero
		 * }else if(condicion){
		 * verdaero
		 * }else{
		 * falso
		 * }
		 * */
		/*
		 * realizar un programa que verifique
		 * el menor de 3 numeros*/
		System.out.println("ingresar numero uno:");
		int a = new Scanner(System.in).nextInt();
		System.out.println("ingresar numero uno:");
		int b = new Scanner(System.in).nextInt();
		System.out.println("ingresar numero uno:");
		int c = new Scanner(System.in).nextInt();
		System.out.println("ingresar numero uno:");
		//condicional
		/*if(a < b) {
			if(a < c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else {
			if(b < c) {
				System.out.println(b);
			}else {
				System.out.println(c);
			}
		}*/
		//if anidado
		if(a < b) {
			if(a < c) {
				System.out.println(a);
			}else {
				System.out.println(c);
			}
		}else if(b < c){
				System.out.println(b);
		}else {
			System.out.println(c);
		}
		
	
	
	
	}

}
