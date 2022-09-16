package exec03;
import java.util.Scanner;
public class fatorial {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		int fat=0, n, i, result = 0, l;
		
		System.out.println("Digite o numero que sera fatorado ");
		n = ler.nextInt();
		i = n;
		l = i-1;
		fat = i-1;
		result = (i*fat);
		i =i-1;
		while (i>=1) {
			result = result*i; 
			i=i-1;
		}
		result = result/l;
		System.out.println("Esse sera o resultado "+result);
		ler.close();
	}
}