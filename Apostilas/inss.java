package apostila;
import java.util.Scanner;
public class inss {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i=1;
		double salario;
		
		do {
			System.out.println("Digite o salario do "+i+"o funcionario");
			salario = ler.nextDouble();
			if(salario<2000.00) {
				salario = salario*0.915;
			}else if(salario>2000.00) {
				salario = salario*0.89;
			}
			System.out.println("O salario com desconto sera: "+(String.format("%.2f",salario)));
			i++;
		}while(i<=4);
		ler.close();
	}

}
