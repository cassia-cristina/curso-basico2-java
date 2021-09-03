package aula56.exercicio;

import java.util.Scanner;

public class Teste {

	private static Scanner scan;

	public static void main(String[] args) {
		scan = new Scanner(System.in);
		Calculadora calc = new Calculadora();
		
		System.out.println("Informe um número: ");
		calc.setNumero1(scan.nextDouble());
		
		System.out.println("Informe outro número: ");
		calc.setNumero2(scan.nextDouble());
		
		for (Operacoes operacao : Operacoes.values()){
			calc.setOperacao(operacao);
			calc.setResultado(calc.getOperacao().executarOperacao(calc.getNumero1(), calc.getNumero2()));
			System.out.println(calc);
		}
		
				
	}

}
