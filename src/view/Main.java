package view;

import java.util.Random;

import controller.ThreadLine;

public class Main {

	public static void main(String[] args) {
		// Atribuir numeros aleatórios em uma Matriz 3x5
		// Chamar 3 Threads onde cada uma vai calcular a soma dos números de cada linha
		// Enviar como parâmetro um vetor com os números de cada linha
		// Imprimir com o resultado da soma e número identificador da linha
		
	Random numbers = new Random();
	Thread somaVetor;
	int [][] matriz = new int[3][5];
	int[] vetor1 = new int[5];
	int[] vetor2 = new int[5];
	int[] vetor3 = new int[5];
	
	for(int i = 0; i < 3; i++){
		for (int j = 0; j < 5; j++){
			matriz[i][j] = numbers.nextInt(10) + 1;
			
			if (i == 0){
				vetor1[j] = matriz[i][j];
			} else if (i == 1){
				vetor2[j] = matriz[i][j];
			} else {
				vetor3[j] = matriz[i][j];
			}
		}
	}
	
	for (int i = 0; i < 3; i++){
		if (i == 0){
			somaVetor = new ThreadLine(vetor1, 1);
		} else if (i == 1){
			somaVetor = new ThreadLine(vetor2, 2);
		} else {
			somaVetor = new ThreadLine(vetor3, 3);
		}
		
		somaVetor.start();
	}
	

	}

}
