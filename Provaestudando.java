package projetoVetores;

import java.util.Scanner;

public class Provaestudando {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		String[] estados = new String[] { "SP", "MG", "RJ" };

		int[] metas = new int[] { 6000, 6000, 8000 };

		String[] revistas = new String[] { "VEJA", "SUPERINTERESSANTE", "QUATRO RODAS", "VC S/A" };

		int vendas[][] = new int[4][3];

		int[] qtdRevista = new int[4];

		int[] qtdEstado = new int[3];

		int qtdTotal = 0;

		// Preencher a matriz com as quantidades de vendas por estado

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {

				System.out.println(	"Digite a quantidade de vendas da revista " + revistas[i] + " para o estado " + estados[j]);

				vendas[i][j] = entrada.nextInt();

				qtdTotal += vendas[i][j];

				// Guarda a quantidade de revista por título de revista.

				qtdRevista[i] += vendas[i][j];

				if (j == 0) {

					qtdEstado[0] += vendas[i][j];

				} else if (j == 1) {

					qtdEstado[1] += vendas[i][j];

				} else {

					qtdEstado[2] += vendas[i][j];

				}

			}

		}

		// Testando as somas

		for (int j = 0; j < 3; j++) {

			if (j == 0) {

				if (metas[0] >= 6000) {

					System.out.println(estados[j] + " OK");

				} else {

					System.out.println(estados[j] + " NÃO");

				}

			} else if (j == 1) {

				if (metas[1] >= 6000) {

					System.out.println(estados[j] + " OK");

				} else {

					System.out.println(estados[j] + " NÃO");

				}

			} else {

				if (metas[2] >= 8000) {

					System.out.println(estados[j] + " OK");

				} else {

					System.out.println(estados[j] + " NÃO");

				}

			}

			System.out.println("Estado " + estados[j] + ": " + qtdEstado[j]);

		}

		System.out.println("Percentual de vendas por revista no mês: " + qtdTotal);

		for (int i = 0; i < 4; i++) {

			System.out.println("Revista " + revistas[i] + ": " + ((double) qtdRevista[i] / qtdTotal) * 100);

		}

		int[] qtdPorEstado = new int[4];

		int maiorQtd = 0;

		// Estado com maior circulação

		for (int i = 0; i < 4; i++) {

			for (int j = 0; j < 3; j++) {

				if (j == 0 || vendas[i][j] > maiorQtd) {

					maiorQtd = vendas[i][j];

					qtdPorEstado[i] = j;

				} 

			}

			maiorQtd = 0;  

		}

		// Exibir revista com maior circulação por estado

		for (int j = 0; j < 4; j++) {

			System.out.println(revistas[j] + ": " + estados[qtdPorEstado[j]]);

		}

		entrada.close();

	}

}
