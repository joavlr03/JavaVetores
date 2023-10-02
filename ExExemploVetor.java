package projetoVetores;
import java.util.Scanner;
public class ExExemploVetor {
	public static void main(String[] args) {


		 

		 String[] vetorNomes = new String[3];

		 int[] vetorIdades = new int[3];

		 Scanner entrada = new Scanner(System.in);


		 

		 for (int i = 0; i < 3; i++) {

		 System.out.println("Digite o nome do atleta :");

		 vetorNomes[i] = entrada.next();

		 System.out.println("Digite a idade do atleta: ");

		 vetorIdades[i] = entrada.nextInt();

		 }


		 

		 for (int i = 0; i < 3; i++) {

		 if (vetorIdades[i] >= 21) {

		 System.out.println(vetorNomes[i] + " idade: " + vetorIdades[i]);

		 }
		 
		 entrada.close();


		 

		 }

	}

}
