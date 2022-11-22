package loja;

import java.util.Date;
import java.util.Scanner;

public class venda {
	int codigo_venda;
	String forma_pagamento;
	double valor_venda;
	Date data_venda = new Date();
	String equipamento;

	Scanner len = new Scanner(System.in);
	produto p5 = new produto();
	
    public void formasdepagamento(String forma_pagamento) {
	this.forma_pagamento = forma_pagamento;
	
	if(forma_pagamento == "Credito"||forma_pagamento == "CREDITO"||forma_pagamento == "credito") {
		double venda = p5.preco%0.8;
		System.out.println("No Modo Credito acrescentará 8% de taxa!");
	}
	else if(forma_pagamento == "Debito"||forma_pagamento == "DEBITO"||forma_pagamento == "debito") {
		double venda = p5.preco;
		System.out.println("No Modo Debito a taxa e anulada!");
	}
	else {
		System.out.println("Esse metodo de pagamento não existe!");
	}
}
public void nota() {
	System.out.println("-----------------------------------");
	System.out.println(" nome do produto: "+ p5.nome_produto);
	System.out.println(" Valor do Produto: "+ p5.preco);
	System.out.println(" Forma de Pagamento: "+forma_pagamento);
	System.out.println(" Data da compra: "+ data_venda);
	System.out.println("-----------------------------------");
}

}