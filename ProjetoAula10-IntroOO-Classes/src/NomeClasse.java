
public class NomeClasse {

	//defini��o dos atributos
	int atributo1;
	int atributo2;
	String atributo3;
	
	
	//Defini��o dos m�todos da classe
	public void metodo1(){
		System.out.println(atributo1);
	}
	
	private int metodo2(int parametro){
		return parametro;
	}
	
	public void metodo3(int parametro) {
		metodo2(parametro);
	}
}
