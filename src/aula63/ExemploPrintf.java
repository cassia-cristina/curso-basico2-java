package aula63;

public class ExemploPrintf {

	public static void main(String[] args) {
		
		String meuTexto = "Olá Mundo!";
		
		System.out.printf("Hello %s%n", "Olá, Mundo!");
		System.out.printf("%S", meuTexto);
		System.out.printf("%n");
		
		System.out.printf("%c", 'c');
		System.out.printf("%n");
		System.out.printf("%C", 'c');
		System.out.printf("%n");
		
		int valor = 123456789;
		System.out.printf("%d", valor);
		System.out.printf("%n");
		System.out.printf("%+d", valor);
		System.out.printf("%n");
		System.out.printf("% d", valor);
		System.out.printf("%n");
		
		double valor2 = 45.33456;
		System.out.printf("%f", valor2);
		System.out.printf("%n");
		System.out.printf("%.3f", valor2);
		System.out.printf("%n");
		System.out.printf("R$%10.2f", valor2);
		System.out.printf("%n");
		
		System.out.printf("%20s", meuTexto);
		System.out.printf("%n");
		System.out.printf("%-20s", meuTexto);
		System.out.printf("%n");
		
		System.out.printf("%015d", valor);
		System.out.printf("%n");
		System.out.printf("%,d", valor);
		System.out.printf("%n");
		
		testeItens();
		
	}
	
	static void testeItens() {
		double[] precos = {1000, 123.54, 7843.567, 1, 4.56789};
		
		for(int i=0; i<precos.length; i++) {
			System.out.printf("%s %02d: total de R$%,10.2f%n", "Item", i+1, precos[i]);		
		}
		
	}

}
