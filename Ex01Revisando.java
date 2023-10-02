package projetoVetores;

import java.util.Scanner;

public class Ex01Revisando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomes[] = new String[10];
		String nomeProcurado;

		Scanner entrada = new Scanner(System.in);

		for (int i = 0; i < 10; i++) {

			System.out.println("digite o " + (i + 1) + " nome :");
			nomes[i] = entrada.next();

		}

		System.out.println("digite o nome que deseja procurar :");

		nomeProcurado = entrada.next();

		for (int i = 0; i < 10; i++) {

			if (nomes[i].equalsIgnoreCase(nomeProcurado)) {

				System.out.println("achei na posição " + (i + 1));
			}

			else {

				System.out.println("n achei");
			}

			entrada.close();

		}

	}

}
