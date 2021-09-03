package aula64;

public class Externa2 {

	public void metodoExemplo() {

		class ClasseLocal {
			private String texto = "texto classe local";

			public void imprimeTexto() {
				System.out.println(texto);
			}
		}

		ClasseLocal local = new ClasseLocal();
		local.imprimeTexto();

	}

	public static void main(String[] args) {
		Externa2 teste = new Externa2();
		teste.metodoExemplo();

	}
}
