package aula56.exercicio;

public class Calculadora {
	
	private double numero1;
	private double numero2;
	private Operacoes operacao;
	private double resultado;
	
	public double getNumero1() {
		return numero1;
	}
	
	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}
	
	public double getNumero2() {
		return numero2;
	}
	
	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}
	
	public Operacoes getOperacao() {
		return operacao;
	}
	
	public void setOperacao(Operacoes operacao) {
		this.operacao = operacao;
	}

	public double getResultado() {
		return resultado;
	}

	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	@Override
	public String toString() {
		return "[" + numero1 + " " + operacao.getSimbolo() + " " + numero2 + " = " + resultado + "]";
	}


}
