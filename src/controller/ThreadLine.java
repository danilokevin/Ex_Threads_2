package controller;

public class ThreadLine extends Thread {
	
	int vetor[];
	int soma = 0;
	int linha;
	
	public ThreadLine(int vetor[], int linha){
		this.vetor = vetor;
		this.linha = linha;
	}
	
	@Override
	public void run() {
		for (int i = 0; i < 5; i++){
			this.soma += this.vetor[i];
		}
		
		System.out.println("Vetor da linha " + this.linha + " ==> Soma = " + this.soma);
	}
	

}
