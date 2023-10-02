package projetoVetores;
import	java.util.Scanner;
public class Ex07Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int vet1[] = new int[10];

		 int vet2[] = new int[10];

		 int result[] = new int[20];

		 Scanner entrada = new Scanner(System.in);

		 // preencher

		 for (int i = 0; i < 10; i++) {

		 System.out.println("Digite valor do primeiro vetor posição " + (i + 1));

		 vet1[i] = entrada.nextInt();

		 System.out.println("Digite valor do segundo vetor posição " + (i + 1));

		 vet2[i] = entrada.nextInt();

		 }

		 // alimentar vetor intercalado

		 for (int j = 0; j < 20; j++) {

		 for (int i = 0; i < 10; i++) {

		 result[j] = vet1[i];

		 result[j + 1] = vet2[i];

		 j += 2;

		 }

		 }

		 System.out.println("Resultado");

		 for (int i = 0; i < 20; i++) {

		 System.out.println(result[i]);
		 
		 entrada.close();


		 

		 }
	}

}
