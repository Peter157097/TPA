import java.util.*;
public class Quarto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner ler = new Scanner (System.in);
		
		final int TAM= 5;
		int a [] = new int [TAM];
		int maior, menor;
		
		System.out.println("1° valor: ");
		a[0]= ler.nextInt();
		maior = a[0];
		menor = a[0];
		
		for(int i=1; i<TAM;i++) {
			System.out.println((i+1)+ "° valor: ");
			a [i] = ler.nextInt();
			if (a[i]>maior) {
				maior = a[i];
			}else if (a[i]<menor) {
				menor = a[i];
			}
		}
		System.out.println("MAIOR VALOR: "+maior);
		System.out.println("MENOR VALOR: "+menor);
	}

}
