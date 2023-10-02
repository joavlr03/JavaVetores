package aaaaa;

import java.util.Scanner;

public class SprintVetores {

	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);
		int notaDesign = 0;
		int equipeQtd = 0;
		int numero = 0;
		int vitoria = 0;
		int empate = 0;
		int derrota = 0;
		int batalhas = 0;

		System.out.println("--------REGISTRO-DE-EQUIPES----------");
		System.out.println("digite a quantidade de equipes: ");
		equipeQtd = entrada.nextInt();

		int notaDoDesign[] = new int[equipeQtd];
		int desempate[] = new int[equipeQtd];
		int pontos[] = new int[equipeQtd];

		int pontTime[] = new int[equipeQtd];

		int[] numeroIdentif = new int[equipeQtd];

		for (int i = 0; i < equipeQtd; i++) {
			System.out.println("Digite um numero para a equipe entre 11 e 99 :");
			numero = entrada.nextInt();

			if (numero < 11 || numero > 99) {
				System.out.println("Numero inválido, digite outro...");
			} else {
				numeroIdentif[i] = numero;
			}

		}

		for (int j = 0; j < equipeQtd; j++) {

			System.out.println("------" + "Equipe " + numeroIdentif[j] + "---------");

			System.out.println("digite o numero de batalhas: ");
			batalhas = entrada.nextInt();
			System.out.println("quantidade de vitorias: ");
			vitoria = entrada.nextInt();
			System.out.println("quantidade de empates: ");
			empate = entrada.nextInt();
			System.out.println("quantidade de derrotas: ");
			derrota = entrada.nextInt();
			System.out.println("qual a nota do seu design? :");
			notaDesign = entrada.nextInt();

			// calculo das pontuações individuais

			int pontuacaoTotal = (vitoria * 5 + empate * 3 + derrota * 0);

			System.out.println("Pontuação total da equipe:" + (pontuacaoTotal));

			pontTime[j] = pontuacaoTotal;

		}

		// saida de dados

		System.out.println("-----TABELA-GERAL-----");

		for (int i = 0; i < equipeQtd; i++) {
			for (int j = 0; j < equipeQtd - i - 1; j++) {
				if (pontTime[j] < pontTime[j + 1]) {
					int temp = pontTime[j];
					pontTime[j] = pontTime[j + 1];
					pontTime[j + 1] = temp;
				}

			}
			
			System.out.println((i + 1) + "° Lugar Equipe " + numeroIdentif[i] + " pontuação: " + pontTime[i]);
		}

		int maiorNota = notaDesign;
		for (int i = 0; i < equipeQtd; i++) {
			if (notaDoDesign[i] > maiorNota) {
				maiorNota = notaDoDesign[i];
			}
			  for (int j = 0; j < equipeQtd; i++) {
		            if (notaDoDesign[j] == maiorNota) {
		              
		            }
			  }
			  
			  System.out.println("Campeão nos critérios em caso de empate, Equipe " + numeroIdentif[i] + " pont design: " + maiorNota);
		}
		
		
	}
}

	

