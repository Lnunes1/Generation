package br.com.generation.La�osRepeti�ao;

import java.util.Scanner;

public class Ex5aula3 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		int i, soma = 0;
		
		do {
			System.out.println("digite um n�mero... Ou digite 0 para sair.");
			i = in.nextInt();
			
				soma = soma + i;
				

		} while(i != 0);
		
		System.out.println("A soma dos n�meros digitados �: " + soma);
		
		in.close();

	}

}