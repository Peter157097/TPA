package tabuada;
import java.util.Scanner;
public class tabuada {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, result, i=1;
		
		System.out.println("Digite o numero da tabuada");
		n = ler.nextInt();
		System.out.println("a tabuada de "+n+" sera");
		while(i<=10) {
			result = n*i;
			System.out.println(n+"x"+i+"="+result);
			i++;
		}
		ler.close();
	}

}
