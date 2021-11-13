package br.com.generation.aula5ex1;
public class TesteCliente {

	public static void main(String[] args) {
		
		//Instanciar o objeto
		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();
		Cliente c3 = new Cliente();
		
		c1.nome = "Dudu";
		c1.cadastro = "1367";
		c1.idade = 19;

		c2.nome = "Gustavo Scarpa";
		c2.cadastro = "5476";
		c2.idade = 32;
		
		c3.nome = "Raphael Veiga";
		c3.cadastro = "2345";
		c3.idade = 29;
		
		System.out.println("Nome do cliente: " + c1.nome);
		System.out.println("Cadastro do cliente: " + c1.cadastro);
		System.out.println("Idade do cliente: " + c1.idade);
		c1.comprar();
		
		System.out.println();
		
		System.out.println("Nome do cliente: " + c2.nome);
		System.out.println("Cadastro do cliente: " + c2.cadastro);
		System.out.println("Idade do cliente: " + c2.idade);
		c1.pagar();
		
		System.out.println();
		
		System.out.println("Nome do cliente: " + c3.nome);
		System.out.println("Cadastro do cliente: " + c3.cadastro);
		System.out.println("Idade do cliente: " + c3.idade);
		c1.atendimento();
		
	}

}