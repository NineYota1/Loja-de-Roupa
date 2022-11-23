package loja;
import java.util.Scanner;
public class loja {
	public static void main(String[] args) {
		Scanner len = new Scanner(System.in);
		funcionario f = new funcionario();
		produto p5 = new produto();
		
		f.atendimento();
		f.satisfação();

	}
}
