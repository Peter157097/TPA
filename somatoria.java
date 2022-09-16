package exec03;
import java.util.Scanner;
public class somatoria {
	public static void main(String[] args) {
		Scanner ler =  new Scanner(System.in);
		
		int i=1, soma=0;
		
		while (i<100) {	
			soma= i+soma;
			i++;
		}
		System.out.println(i);
		ler.close();
	}
}	