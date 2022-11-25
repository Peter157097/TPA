package vetror;

import java.util.Scanner;

public class par {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		final int tam = 10;
		int i;
		int a[];
		a = new int [tam];
		
		for(i=0;i<tam;i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
		}
		for(i=0;i<tam;i++) {
			if(a[i]%2==0) {
				System.out.println(a[i]+" eh par");
			}else {
				System.out.println(a[i]+" eh impar");
			}
		}
	}

}
