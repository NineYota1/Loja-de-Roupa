package loja;

import java.util.Scanner;

public class produto {
	int codigo_produto;
	String nome_produto;
	double preco;
	
	Scanner len = new Scanner(System.in);
	
	public void verificarProduto() {
		
	}

	public void cadastrodeprodutos(String nome_produto, double preco) {
		this.nome_produto = nome_produto;
		this.preco = preco;

	}

	
	
	
}
