package vetor;

import java.util.Scanner;

public class idade {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		double altura, alturaMenor, alturaMaior, alturaMedia;
		int i=1, id, idVelho, idNovo;
		
		System.out.println("Digite a "+i+"o idade");
		id = ler.nextInt();
		System.out.println("Digite a "+i+"o altura");
		altura = ler.nextDouble();
		idVelho = id;
		idNovo = id;
		alturaMaior = altura;
		alturaMenor = altura;
		alturaMedia = altura;
		
		for(i=2;i<=10;i++) {
			System.out.println("Digite a "+i+"o idade");
			id = ler.nextInt();
			System.out.println("Digite a "+i+"o altura");
			altura = ler.nextDouble();
			if(id<idNovo) {
				idNovo = id;
			}else if(id>idVelho) {
				idVelho = id;
			}
			if(altura<alturaMenor) {
				alturaMenor = altura;
			}else if(altura>alturaMaior) {
				alturaMaior = altura;
			}
			alturaMedia = alturaMedia+altura;
		}
		alturaMedia = alturaMedia/10;
		System.out.println("IDADE | ALTURA  ");
		System.out.println(idVelho+" | "+(String.format("%.2f",alturaMaior))+" | Maior/Velho");
		System.out.println(idNovo+"  | "+(String.format("%.2f",alturaMenor))+" | Menor/Novo ");
		System.out.println("MEDIA = "+(String.format("%.2f",alturaMedia)));
				
	}

}
