package apostila;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n,i=1,r;
		
		System.out.println("Digite o valor");
		n = ler.nextInt();
		while(i<=10) {
			r = n*i;
			System.out.println(n+" x "+i+" = "+r);
			i++;
		}
		ler.close();
	}

}
