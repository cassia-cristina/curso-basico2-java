package aula61;

public class Teste {

	public static void main(String[] args) {
		
		Contato contato = new Contato("Contato 1", "62998788080", "cristina@gmail.com");
		int valor = 10;
		System.out.println(contato);
		System.out.println(valor);
		
		/*
		 * passagemPorReferencia(valor, contato); System.out.println(contato);
		 * System.out.println(valor);
		 */
		
		passagemPorReferencia2(valor, contato);
		System.out.println(contato);
		System.out.println(valor);
		

	}
	
	public static void passagemPorReferencia(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato = new Contato("Contato 2", "62992454545", "cassia@gmail.com");
	
	}
	
	public static void passagemPorReferencia2(int valor, Contato contato) {
		int novoValor = valor + 10;
		valor = novoValor;
		
		contato.setNome("Contato " + valor);
	
	}

}
