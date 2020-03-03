package classes;

public class Produto {
	
	String nome;
	double preco;
	static double desconto;
	
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = 0.25;
	}
	
	Produto(String nomeInicial, double precoInicial, double descontoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		desconto = descontoInicial;
	}
	
	double precoComDesconto() {
		return preco*(1-desconto);
	}
	
	double precoComDesconto(double descontoGerente) {
		return preco*(1 - desconto - descontoGerente);
	}
}
