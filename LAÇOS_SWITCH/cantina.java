import java.util.Scanner;
public class cantina {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int cod;
		
		System.out.println("Digite o codigo do lanche");
		cod = ler.nextInt();
		switch (cod) {
			case 1:
				System.out.println("Descrição:Cachorro quente  Valor:R$ 8,00 ");
				break;
			case 2:
				System.out.println("Descrição:Cheeseburger  Valor:R$ 12,00 ");
				break;
			case 3:
				System.out.println("Descrição:X-Salada  Valor:R$ 15,00 ");
				break;
			case 4:
				System.out.println("Descrição:Misto Quente  Valor:R$ 11,00 ");
				break;
			case 5:
				System.out.println("Descrição:Pão na chapa  Valor:R$ 6,00 ");
				break;
			default:
				System.out.println("Codigo invalido");
			}
		ler.close();
	}

}
