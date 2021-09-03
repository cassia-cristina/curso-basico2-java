package aula62;

public class ExemploVarargs {

	public static void main(String[] args) {
		
		System.out.println(soma(5,6));
		
		int[] vetor = {1,2,3,4,5};
		System.out.println(soma(vetor));
		
		System.out.println(soma(1,2,3,4,5));

	}
	
	static int soma(int a, int b) {
		return a+b;
	}
	
	static int soma(int[] vetor) {
		int total = 0;
		
		for(int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
		
	}
	
	static int soma(int a, Integer...vetor) {
		int total = 0;
		
		for(int i=0; i<vetor.length; i++) {
			total += vetor[i];
		}
		
		return total;
		
	}

}
