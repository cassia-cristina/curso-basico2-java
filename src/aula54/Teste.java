package aula54;

public class Teste {

	public static void main(String[] args) {
		
		DiaSemana dia = DiaSemana.QUINTA;
		
		System.out.println(dia.toString() + " - " + dia.getValor());
		
		Data data = new Data(19, 8, 2021, DiaSemana.QUINTA);
		
		System.out.println(data.toString());

	}

}
