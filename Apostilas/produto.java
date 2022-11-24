package apostila;
import java.util.Scanner;
public class produto {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String escolha;
		double precoP,margen,precoV;
		do {
			System.out.println("Digite o preco do produto");
			precoP = ler.nextDouble();
			System.out.println("Digite a mergen de lucro(em porcentagem)");
			margen = ler.nextDouble();
			margen = (precoP*margen)/100;
			precoV = precoP+margen;
			System.out.println("O preço da venda vai ser: "+(String.format("%.2f",precoV)));
			System.out.println("Deseja continuar a execucao? (S/N)");
			escolha = ler.next();
		}while(escolha.equals("S"));
		ler.close();
	}

}
