package vetror;

import java.util.Scanner;

public class maior {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int tam = 10;
		int i=0;
		int a[] , maior, menor;
		a = new int [tam];

		System.out.println("Digite o "+(i+1)+"o valor do vetor A");
		a[0] = ler.nextInt();
		maior = a[0];
		menor = a[0];
		for(i=1;i<tam;i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
			if(a[i]<menor) {
				menor = a[i];
			}else if(a[i]>maior) {
				maior = a[i];
			}
		}
		System.out.println("MAIOR EH:"+maior);
		System.out.println("MENOR EH:"+menor);
	}

}
