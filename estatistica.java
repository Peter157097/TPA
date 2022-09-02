import java.util.Scanner;
public class estatistica {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int numAluno, numMB, numB, numR, numI, media, escolha;
		
		System.out.println("Digite o numero de alunos que tem na sua sala");
		numAluno = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram MB");
		numMB = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram B");
		numB = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram R");
		numR = ler.nextInt();
		System.out.println("Digite o numero de alunos que tiraram I");
		numI = ler.nextInt();
		System.out.println("1 - Estatistica dos MB 2 - Estatistica dos B");
		System.out.println("3 - Estatistica dos R  4 - Estatistica dos I");
		escolha = ler.nextInt();
		switch (escolha) {
			case 1:
				media = (numMB*100)/numAluno;
				System.out.println(media+"% dos seus alunos tiram MB");
				break;
			case 2:
				media = (numB*100)/numAluno;
				System.out.println(media+"% dos seus alunos tiram B");
				break;
			case 3:
				media = (numR*100)/numAluno;
				System.out.println(media+"% dos seus alunos tiram R");
				break;
			case 4:
				media = (numI*100)/numAluno;
				System.out.println(media+"% dos seus alunos tiram I");
				break;
			default:
				System.out.println("Nota Invalida");
			}
		ler.close();
	}

}
