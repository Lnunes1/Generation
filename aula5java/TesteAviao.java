package br.com.generation.aula5ex2;

public class TesteAviao {

	public static void main(String[] args) {
		
		Aviao aviao1 = new Aviao();
		
		
		aviao1.empresa = "LATAM Brasil";
		aviao1.modelo = "Cessna 406";
		aviao1.quantLugares = 60;
		aviao1.voar(415);
		
		System.out.println("O nome da empresa é: " + aviao1.empresa);
		System.out.println("O Modelo é: " + aviao1.modelo);
		System.out.println("A quantidade de Lugares: " + aviao1.quantLugares);
		
		System.out.println("---------------------------------------------------------");
		System.out.println("Velocidade máxima: " + aviao1.velocidade + "Km/h");
		
		aviao1.pousar(62);
		System.out.println("Velocidade de cruzeiro: " + aviao1.velocidade + "Km/h");
	}

}