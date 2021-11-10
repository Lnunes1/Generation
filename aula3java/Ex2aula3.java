package br.com.generation.LaçosRepetiçao;

import java.util.Scanner;

public class Ex2aula3 {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n , par = 0, impar = 0, i = 10, num;
		
		for(n = 1; n <= i; n++) {
			System.out.println("Digite um numero: ");
			num = scan.nextInt();
			
			if(num % 2 == 0) {
				par = par + 1;
				
			}
			if(num % 2 != 0) {
				impar = impar + 1;
			}
		}
		
		System.out.println("A sequencia tem: " + par + " numeros pares.");
		System.out.println("A sequencia tem: " + impar + " numeros impares.");
		
		scan.close();
	}

}
