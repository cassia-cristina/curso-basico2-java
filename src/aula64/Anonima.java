package aula64;

public class Anonima {
	
	public void ImprimeTexto() {
		System.out.println("Imprime texto");
	}

	public static void main(String[] args) {
		
		Anonima anonima = new Anonima() {
			public void ImprimeTexto() {
				System.out.println("Sobrescrevendo o texto");
			}
		};
		
		anonima.ImprimeTexto();

	}

}
