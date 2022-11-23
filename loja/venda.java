package loja;

import java.util.Date;
import java.util.Scanner;

public class venda {
	String nomev;
	String forma_pagamento;
	Scanner len = new Scanner(System.in);
	produto p5 = new produto();
	Double vv;
	Date data_venda = new Date();
	String equipamento;
	String nome;
	Double estoque;

    public void formasdepagamento(String forma_pagamento,Double vv,Double estoque) {
    this.estoque = estoque;
	this.forma_pagamento = forma_pagamento;
	this.vv = vv;
	if(forma_pagamento == "Credito"||forma_pagamento == "CREDITO"||forma_pagamento == "credito") {
		double venda = vv*estoque*0.4;
		System.out.println("No Modo Credito acrescentará 40% de taxa!");
	}
	else if(forma_pagamento == "Debito"||forma_pagamento == "DEBITO"||forma_pagamento == "debito") {
		double venda = vv*estoque;
		System.out.println("No Modo Debito a taxa e anulada!");
	}
	else {
		int i;
		for(i=0;i<10;i++) {
			System.out.print("Por Favor, digite sua forma de pagamento novamente: ");
			forma_pagamento = len.next();
			if (forma_pagamento == "Debito"||forma_pagamento == "DEBITO"||forma_pagamento == "debito"||forma_pagamento == "Credito"||forma_pagamento == "CREDITO"||forma_pagamento == "credito") {
				break;
			}
			break; 
		}
	}
}

public void nota(String nomev,Double vv,Double estoque) {
	this.estoque = estoque;
	this.nomev = nomev;
	this.vv = vv;
	System.out.println("-----------------------------------");
	System.out.println(" nome do produto: "+ nomev);
	System.out.println(" Valor do Produto: "+ vv*estoque);
	System.out.println(" Forma de Pagamento: "+forma_pagamento);
	System.out.println(" Data da compra: "+ data_venda);
	System.out.println("-----------------------------------");
}

public void trabalhador(String nome,Double vv,Double estoque) {
	this.nome = nome;
	this.vv = vv;
	this.estoque = estoque;
	double comissao= vv*estoque*0.3; 
	System.out.println("Sua comissão foi: "+comissao);
}
}
