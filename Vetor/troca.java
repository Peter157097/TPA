package vetror;

import java.util.Scanner;

public class troca {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int tam = 10;
		int i;
		int a[] , b[];
		a = new int [tam];
		b = new int [tam];
		
		for(i=0;i<tam;i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextInt();
			b[i] = a[i];
		}
		for(i=0;i<tam;i++) {
			if(i==0) {
				System.out.print("[");
			}
			System.out.print(" "+b[i]+" ");
			if(i==9) {
				System.out.print("]");
			}
		}
		System.out.println("");
		for(i=9;i>0;i=i-1) {
			if(i==9) {
				System.out.print("[");
			}
			System.out.print(" "+b[i]+" ");
			if(i==0) {
				System.out.print("]");
			}
		}
	}

}
