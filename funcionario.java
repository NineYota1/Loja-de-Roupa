package loja;
import java.util.Scanner;
public class funcionario {
	String matricula;
	String nome;
	String Endere�o;
	String cidade;
	String data_Admissao;
	
	Scanner len = new Scanner(System.in);
	produto p5 = new produto();
	venda v = new venda();
public void comiss�o() {
	
}

public void atendimento() {
	System.out.println("----------------------------------------------");
	System.out.println("        Bem Vindo!       ");
	System.out.println(" Escolha uma das op��es  digitando seu numero");
	System.out.println(" Op��o 1: Cadastrar novo produto.");
	System.out.println(" Op��o 2: Realizar uma venda.");
	System.out.println(" Op��o 3: metodos de pagamento.");
	System.out.println(" Op��o 4: Verificar estoque de produto.");
	System.out.print(" Digite a op��o escolhida: ");
	int op = len.nextInt();
	switch (op) {
	case 1:
		System.out.print("Digite o nome: ");
		String l1 = len.next();
		System.out.println("Digite o preco: ");
		Double l2 = len.nextDouble();

		p5.cadastrodeprodutos(l1, l2);
		System.out.println("O nome do produto � "+ p5.nome_produto + " e o seu valor � "+ p5.preco);
		break;
	case 2:
		System.out.print("Digite a forma de Pagamento: ");
		String l4 = len.next();
		v.formasdepagamento(l4);
		v.nota();
		break;
	case 3:
		
	case 4:
		
	default:
		System.out.println("A op��o selecionada n�o existe!");
	}	
}
}
