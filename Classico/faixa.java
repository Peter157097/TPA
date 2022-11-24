package vetor;

import java.util.Scanner;

public class faixa {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int i, id, id1=0, id2=0, id3=0, id4=0, id5=0, faixa1=0, faixa2=0, faixa3=0, faixa4=0 , faixa5=0;
		
		for(i=1;i<=15;i++) {
			System.out.println("Digite a "+i+"o idade");
			id = ler.nextInt();
			if(id<=15) {
				id1 = id1+1;
			}else if(id<=30) {
				id2 = id2+1;
			}else if(id<=45) {
				id3 = id3+1;
			}else if(id<=60) {
				id4 = id4+1;
			}else {
				id5 = id5+1;
			}
			
		}
		faixa1 = (id1*100)/15;
		faixa2 = (id2*100)/15;
		faixa3 = (id3*100)/15;
		faixa4 = (id4*100)/15;
		faixa5 = (id5*100)/15;
		System.out.println("FAIXA ETARIA| QUANTIDADE| IDADES");
		System.out.println("1o "+faixa1+"%  | "+id1+" | Até 15 anos");
		System.out.println("2o "+faixa2+"%  | "+id2+" | De 16 a 30 anos");
		System.out.println("3o "+faixa3+"%  | "+id3+" | De 31 a 45 anos");
		System.out.println("4o "+faixa4+"%  | "+id4+" | De 46 a 60 anos");
		System.out.println("5o "+faixa5+"%  | "+id5+" | Acima de 61 anos");
	}

}
