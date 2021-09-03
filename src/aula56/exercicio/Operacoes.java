package aula56.exercicio;

public enum Operacoes {
	
	SOMAR('+') {
		@Override
		public double executarOperacao(double x, double y) {
			return x + y;
		}
	},
	SUBTRAIR('-') {
		@Override
		public double executarOperacao(double x, double y) {
			return x-y;
		}
	},
	MULTIPLICAR('*') {
		@Override
		public double executarOperacao(double x, double y) {
			return x * y;
		}
	},
	DIVIDIR('/') {
		@Override
		public double executarOperacao(double x, double y) {
			return x / y;
		}
	};
	
	private char simbolo;
	
	private Operacoes(char simbolo) {
		this.simbolo = simbolo;
	}
	
	public char getSimbolo() {
		return simbolo;
	}
	
	public abstract double executarOperacao(double x, double y);
	

}
