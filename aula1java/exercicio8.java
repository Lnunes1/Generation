package br.com.generation.aula1java;

import java.util.Scanner;

/*O custo ao consumidor de um carro novo ? a soma do custo de f?brica com a
percentagem do distribuidor e dos impostos (aplicados ao custo de f?brica).
Supondo que a percentagem do distribuidor seja de 28% e os impostos de 45%,
escrever um sistema que leia o custo de f?brica de um carro e escreva o custo ao
consumidor.*/

public class exercicio8 {

    public static void main(String[] args) {

        Scanner leia = new Scanner(System.in);

        int fabrica, consumidor;

            System.out.println("Qual o custo de f?brica do carro ?? ");
            fabrica = leia.nextInt();

            consumidor = ((fabrica / 100) * 28) + ((fabrica / 100) * 45) + fabrica;

            System.out.println("Ent?o o valor do carro ?: " + consumidor);

            leia.close();
    }

}