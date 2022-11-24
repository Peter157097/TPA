package vetor;

import java.util.Scanner;

public class fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i = 1, atual = 1, anterior = 0, exibir = 1;
		
		System.out.println("Digite o valor");
		n = ler.nextInt();
		
		do{
		    System.out.println(exibir+" ");
		    exibir = atual + anterior;

		    anterior = atual;
		    atual = exibir;

		    i++;

		}while(i<=n);
	}

}
