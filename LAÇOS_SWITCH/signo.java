import java.util.Scanner;
public class signo {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int dia, mes;
		
		System.out.println("Digite o numero correspondente ao mes que voce nasceu");
		mes = ler.nextInt();
		System.out.println("Digite o dia que vc nasceu");
		dia = ler.nextInt();
		switch(mes) {
			case 1:
				if (dia>0 && dia<=20) {
					System.out.println("Capricornio");
				} else if (dia>=21 && dia<=31) {
					System.out.println("Aquario");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 2:
				if (dia>0 && dia<=18) {
					System.out.println("Aquario");
				} else if (dia>=19 && dia<=28) {
					System.out.println("Peixes");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 3:
				if (dia>0 && dia<=20) {
					System.out.println("Peixes");
				} else if (dia>=21 && dia<=31) {
					System.out.println("Aries");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 4:
				if (dia>0 && dia<=20) {
					System.out.println("Aries");
				} else if (dia>=21 && dia<=30) {
					System.out.println("Touro");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 5:
				if (dia>0 && dia<=20) {
					System.out.println("Touro");
				} else if (dia>=21 && dia<=31) {
					System.out.println("Gemeos");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 6:
				if (dia>0 && dia<=20) {
					System.out.println("Gemeos");
				} else if (dia>=21 && dia<=30) {
					System.out.println("Cancer");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 7:
				if (dia>0 && dia<=22) {
					System.out.println("Cancer");
				} else if (dia>=23 && dia<=31) {
					System.out.println("Leao");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 8:
				if (dia>0 && dia<=22) {
					System.out.println("Leao");
				} else if (dia>=23 && dia<=31) {
					System.out.println("Virgim");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 9:
				if (dia>0 && dia<=22) {
					System.out.println("Virgim");
				} else if (dia>=23 && dia<=30) {
					System.out.println("Libra");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 10:
				if (dia>0 && dia<=22) {
					System.out.println("Libra");
				} else if (dia>=23 && dia<=31) {
					System.out.println("Escorpiao");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 11:
				if (dia>0 && dia<=21) {
					System.out.println("Escorpiao");
				} else if (dia>=22 && dia<=30) {
					System.out.println("Sagitario");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			case 12:
				if (dia>0 && dia<=21) {
					System.out.println("Sagitario");
				} else if (dia>=22 && dia<=31) {
					System.out.println("Capricornio");
				} else {
					System.out.println("Dia invalido");
				}
				break;
			default:
				System.out.println("Mes Invalido");
			}
		ler.close();
	}

}
