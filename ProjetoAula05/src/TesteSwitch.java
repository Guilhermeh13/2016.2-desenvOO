
public class TesteSwitch {
	public static void main(String[] args) {
		int diaDaSemana = 2;

		switch (diaDaSemana) {
		case 0:
			System.out.println("Domingo");
			break;
		case 1:
			System.out.println("Segunda");
			break;
		case 2:
			System.out.println("Ter�a");
			break;

		case 3:
			System.out.println("Quarta");
			break;

		case 4:
			System.out.println("Quinta");
			break;
		case 5:
			System.out.println("Sexta");
			break;
		case 6:
			System.out.println("S�bado");
			break;
		default:
			System.out.println("N�o foi reconhecido dia da semana");
			break;
		}
	}
}
