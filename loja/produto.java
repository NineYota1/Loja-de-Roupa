package loja;

import java.util.Scanner;

public class produto {
	String nome_produto;
	double preco;
	Double quantidade;
	private double valor;
	private String nome;
	
	Scanner len = new Scanner(System.in);
	
	public void estoqueProduto(Double quantidade) {
		this.quantidade = quantidade;
	}

	public void cadastrodeprodutos(String nome_produto, double preco) {
		this.nome_produto = nome_produto;
		this.preco = preco;

	}
	public void setvalor(double valor) {
		this.valor = valor;
	}
	public double getvalor() {
		return this.valor;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public String getnome() {
		return this.nome;
	}
	
}
