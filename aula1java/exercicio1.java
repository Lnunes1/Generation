package br.com.generation.aula1java;

import java.util.Scanner;

/*Fa�a um sistema que leia a idade de uma pessoa expressa em anos, meses e
dias e mostre-a expressa apenas em dias.*/

public class exercicio1 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int dias, meses, anos, idade;

            System.out.println("Quantos anos voc� tem? ");
            anos = leia.nextInt();

            System.out.println("E meses voc� tem? ");
            meses = leia.nextInt();

            System.out.println("E dias voc� tem? ");
            dias = leia.nextInt();

            idade = (anos * 365) + (meses * 30) + dias;

            System.out.println("A sua idade em dias �: " + idade);

            leia.close();
    }

}
/////////////////////