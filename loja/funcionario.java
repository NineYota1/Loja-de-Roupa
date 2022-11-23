package loja;
import java.util.Scanner;
public class funcionario {
	int rating;
	double priece;
    String nome;
	
	Scanner len = new Scanner(System.in);
	produto p5 = new produto();
	venda v = new venda();

	public void satisfação() {
	System.out.println("Digite sua satisfação dentro da escala de 1 a 5.");
	int rat1 = len.nextInt();
	if (rat1 == 1||rat1 == 2||rat1 == 3||rat1 == 4||rat1 == 5) {
		System.out.println("Obrigado por comprar!");
	}
	else {
		int i;
		int rat2;
		for(i=0;i<10;i++) {
			System.out.println("Sua classificação foi invalida.");
			System.out.print("Digite sua classificação novamente: ");
			rat2 = len.nextInt();
			if (rat2 == 1||rat2 == 2||rat2 == 3||rat2 == 4||rat2 == 5) {
				System.out.println("Obrigado por comprar!");
				break;
			}
		}
	}
}


public void atendimento() {
	
	System.out.println("Bom Dia! Gostaria de fazer o cartão da loja?");
	System.out.println("Não, Obrigadx!");
	int x =0;
	int y= 1;
	System.out.println("Caixa Iniciado!");
	int h;
	for(h=0;x!=y; h++) {
		System.out.print("Digite o Nome do Produto: ");
		String nm1 = len.next();
		p5.setnome(nm1);
		System.out.print("Digite o Valor do Produto: ");
		double price = len.nextDouble();
		p5.cadastrodeprodutos(nm1, price);
		p5.setvalor(price);
		System.out.print("Digite a Quantidade do Produto: ");
		double qt1 = len.nextDouble();
		p5.estoqueProduto(qt1);
		
		System.out.print("Digite sua forma de pagamento (credito/debito): ");
		String pg1 = len.next();
		v.formasdepagamento(pg1,price,qt1);
		v.nota(nm1,price,qt1);
		System.out.print("Nome do Vendedor: ");
		String nom2 = len.next();
		v.trabalhador(nom2,price,qt1);
		
		System.out.print("Gostaria de iniciar uma nova compra? (Y/N): ");
		String ini = len.next();
		if(ini == "Y"||ini == "y") {
			
		}
		break;
		}
	}
}
