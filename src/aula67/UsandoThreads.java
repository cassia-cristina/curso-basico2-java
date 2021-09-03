package aula67;

public class UsandoThreads extends Thread {
	
	private String nome;
	private int tempo;
	
	public UsandoThreads(String nome, int tempo) {
		this.nome = nome;
		this.tempo = tempo;
		start();
	}
	
	public void run() {
		
		try {
			
			for(int i=0; i<6; i++) {
				System.out.println(nome + " contador: " + i);
				Thread.sleep(this.tempo);
			}
			
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		System.out.println("Fim da execução da " + this.nome);
		
	}
	

}
