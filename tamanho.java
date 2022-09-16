package exec03;
import java.util.Scanner;
public class tamanho {
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		double joao=1.34, i=1, pedro=1.45;
		
		while (joao<pedro) {
			joao = joao+0.025;
			pedro = pedro+0.020;
			i++;
		}
		System.out.println("joao fica mais alto que pedro depois de "+(String.format("%.0f",i)+" anos"));
		System.out.println("sendo que joao tem "+(String.format("%.3f",joao)+"m de altura e pedro tem "+(String.format("%.3f",pedro)+"m de altura")));
		ler.close();
	}

}
