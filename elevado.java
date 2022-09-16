package exec03;
import java.util.Scanner;
public class elevado {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int n, n2, i, result = 0;
		
		System.out.println("Digite o numero que sera a base");
		n = ler.nextInt();
		System.out.println("Digite o numero que sera o expoente");
		n2 = ler.nextInt();
		i = n2;
		while (i>=1) {
			result = n*n;
			i=i-1;
		}
		System.out.println(result);
		ler.close();
	}

}
