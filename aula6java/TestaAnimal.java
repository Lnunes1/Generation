package br.com.generation.herançaEx1;

public class TestaAnimal {
	
	public static void main(String[] args) {
		
		cavalo A1 = new cavalo();
		cachorro A2 = new cachorro();
		preguiça A3 = new preguiça();
		
		A1.setNome("Cachorro");
		A1.setIdade(10);
		A1.setSom(true);
		A1.setCorrer(true);
		
		System.out.println("Nome do animal: " + A1.getNome());
		System.out.println("Idade: " + A1.getIdade());
		System.out.println("O animal emite som? " + A1.getSom());
		System.out.println("Ele corre? " + A1.getCorrer());
		
		System.out.println("\n-----------------------------------------------\n");
		
		A2.setNome("Cavalo");
		A2.setIdade(5);
		A2.setSom(true);
		A2.setCorrer(true);
		
		System.out.println("Nome do animal: " + A2.getNome());
		System.out.println("Idade: " + A2.getIdade());
		System.out.println("O animal emite som? " + A2.getSom());
		System.out.println("Ele corre? " + A2.getCorrer());
		
		System.out.println("\n-----------------------------------------------\n");
		
		A3.setNome("Preguiça");
		A3.setIdade(22);
		A3.setSom(true);
		A3.setSubirArvore(true);
		
		System.out.println("Nome do animal: " + A3.getNome());
		System.out.println("Idade: " + A3.getIdade());
		System.out.println("O animal emite som? " + A3.getSom());
		System.out.println("Ele Sobe em árvore? " + A3.getSubirArvore());
		
		
	}
}