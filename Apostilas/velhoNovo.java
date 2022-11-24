package apostila;
import java.util.Scanner;
public class velhoNovo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, nomeVelho, nomeNovo;
		int i, id, idVelho, idNovo;
		
		System.out.println("Digite o 1o nome");
		nome = ler.next();
		System.out.println("Digite a 1o idade");
		id = ler.nextInt();
		nomeVelho = nome;
		nomeNovo = nome;
		idVelho = id;
		idNovo = id;
		for(i=2;i<=10;i++) {
			System.out.println("Digite o "+i+"o nome");
			nome = ler.next();
			System.out.println("Digite a "+i+" idade");
			id = ler.nextInt();
			if(id < idNovo) {
				idNovo = id;
				nomeNovo = nome;
			}else if(id > idVelho) {
				idVelho = id;
				nomeVelho = nome;
			}
		}
		System.out.println("O mais velho e o "+nomeVelho+" com "+idVelho+" anos");
		System.out.println("O mais novo e o "+nomeNovo+" com "+idNovo+" anos");
		ler.close();
	}

}
