
public class TesteFor {

	public static void main(String[] args) {
		int contador = 0;
		int soma = 0;
		for (; contador < 3; contador++){
			System.out.println("N�mero : " + contador);
			soma = soma + contador;
		}
		System.out.println("Soma dos n�meros: " + soma);
	}

}
