package vetror;

import java.util.Scanner;

public class raiz {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		final int tam = 10;
		int i;
		double a[] , b[];
		a = new double [tam];
		b = new double [tam];
		
		for(i=0;i<tam;i++) {
			System.out.println("Digite o "+(i+1)+"o valor do vetor A");
			a[i] = ler.nextDouble();
			b[i] = Math.sqrt(a[i]);
		}
		System.out.println("RAIZ QUADRADA");
		for(i=0;i<tam;i++) {
			System.out.println(a[i]+" = "+b[i]);
		}
	}

}
