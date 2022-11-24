import java.util.Scanner;
public class futebol {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int idade;
		
		System.out.println("Digite a idade do Aluno");
		idade = ler.nextInt();
		System.out.println("Essa sera a sua classe");
		switch (idade) {
			case 6:
				System.out.println("Dente de Leite");
				break;
			case 7:
				System.out.println("Júnior");
				break;
			case 8:
				System.out.println("Júnior Max");
				break;
			case 9:
				System.out.println("“Júnior Master");
				break;
			case 10:
				System.out.println("Master");
				break;
			default:
				System.out.println("A escola não da aula pra essa idade");
			}
		ler.close();
	}

}
