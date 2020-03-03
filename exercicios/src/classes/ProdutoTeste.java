package classes;

public class ProdutoTeste {
	
	public static void main(String[] args) {		
		
		Produto p1 = new Produto("Notebook", 4356.85, 0.25);
		Produto p2 = new Produto("Celular", 1256.5);
		Produto.desconto = 0.3;
				
		System.out.println(p1.nome);		
		double precoFinal1 = p1.precoComDesconto();
		System.out.printf("Novo preço: %.2f \nDesconto de: %.2f \n------------\n",precoFinal1, Produto.desconto);
				
		System.out.println(p2.nome);
		double precoFinal2 = p2.precoComDesconto(0.1);
		System.out.printf("Novo preço: %.2f \nDesconto de: %.2f \n------------\n",precoFinal2, Produto.desconto);		
		
		double mediaCarrinho = ((precoFinal1 + precoFinal2)/2);
		System.out.printf("Média do carrinho: R$%.2f", mediaCarrinho);
	}
}
