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
	public void cadastro_vendedor() {
		
	}

	public void atendimento() {
		System.out.println("----------------------------------------------");
		System.out.println("        Bem Vindo!       ");
		int i;
		int x=1;
		for(i=0;i!=x;i++) {
			System.out.println(" Escolha uma das op��es  digitando seu numero");
			System.out.println(" Op��o 1: Cadastrar novo produto.");
			System.out.println(" Op��o 2: Realizar uma venda.");
			System.out.println(" Op��o 3: Cadastrar vendedor.");
			System.out.println(" Op��o 4: Verificar estoque de produto.");
			System.out.print(" Digite a op��o escolhida: ");
			int op = len.nextInt();
			if (op==1||op==3||op==4) {
				System.out.print("Digite o nome: ");
				String l1 = len.next();
				System.out.println("Digite o preco: ");
				Double l2 = len.nextDouble();
				p5.cadastrodeprodutos(l1, l2);
				System.out.println("O nome do produto � "+ p5.nome_produto + " e o seu valor � "+ p5.preco);
				continue;
			}
			else if (op==2) {
				System.out.print("Digite a forma de Pagamento: ");
				String l4 = len.next();
				v.formasdepagamento(l4);
				v.nota();
				continue;
		}
			else if (op==3) {}
				
			else if (op==4) {}
				
			else {
				while(op==1||op==2||op==3||op==4) {
					System.out.println("A op��o selecionada n�o existe!");
					System.out.print(" Digite a op��o escolhida: ");
					op = len.nextInt();
				}
			}
			}
		}
	
	}

