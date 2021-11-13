package br.com.generation.aula5ex2;

public class Aviao {
	
	String modelo, empresa;
	int quantLugares, velocidade = 0;
	
	
	void voar(int aceleracao) {
		velocidade += aceleracao;
	}
	void pousar(int reduzir) {
		velocidade -= reduzir;
	}
}