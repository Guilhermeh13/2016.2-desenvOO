
public class TesteIfElse {

	public static void main(String[] args) {
		int diaDaSemana = 5;
		
		if(diaDaSemana == 0){
			System.out.println("Domingo");
		} else if(diaDaSemana == 1){
			System.out.println("Segunda");
		} else if(diaDaSemana == 2){
			System.out.println("Ter�a");
		} else if(diaDaSemana == 3){
			System.out.println("Quarta");
		} else if(diaDaSemana == 4){
			System.out.println("Quinta");
		} else if(diaDaSemana == 5){
			System.out.println("Sexta");
		} else if(diaDaSemana == 6){
			System.out.println("S�bado");
		}
		else {
			System.out.println("N�o foi reconhecido dia da semana");
		}
	}
}
