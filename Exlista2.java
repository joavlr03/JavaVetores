package projetoVetores;
import java.util.Scanner;
public class Exlista2 {

	
		public static void main(String[] args) {

			 Scanner entrada = new Scanner(System.in);


			 

			 int[][] milhasCliente = new int[4][5];

			 String[] vetFrases = new String[5];


			 

			 vetFrases[0] = "Código Cliente";

			 vetFrases[1] = "Qtd Milhagem";

			 vetFrases[2] = "Categoria";

			 vetFrases[3] = "Bonus";

			 vetFrases[4] = "Milhagem atual";


			 

			 for (int i = 0; i < 4; i++) {


			 

			 for (int j = 0; j < 5; j++) {


			 

			 if (j == 2) {

			 do {

			 System.out.println("Digite " + vetFrases[j]);

			 milhasCliente[i][j] = entrada.nextInt();

			 } while (milhasCliente[i][0] < 1 && milhasCliente[i][j] > 3);


			 

			 } else if (j == 3) {


			 

			 if (milhasCliente[i][2] == 1) {

			 milhasCliente[i][j] = 10000;

			 } else if (milhasCliente[i][2] == 2) {

			 milhasCliente[i][j] = 5000;

			 } else {

			 milhasCliente[i][j] = 0;

			 }


			 

			 } else if (j == 4) {

			 milhasCliente[i][j] = (milhasCliente[i][3] + milhasCliente[i][1]);

			 } else {

			 System.out.println("Digite " + vetFrases[j]);

			 milhasCliente[i][j] = entrada.nextInt();

			 }

			 }

			 }


			 

			 for (int i = 0; i < 4; i++) {

			 System.out.println(vetFrases[0] + " " + milhasCliente[i][0] + " " +

			 vetFrases[1] + " " + milhasCliente[i][1] + " " +vetFrases[2] +

			 " " + milhasCliente[i][2] + " " +vetFrases[3] + 

			 " " + milhasCliente[i][3] + " " +

			 vetFrases[4] + " " + milhasCliente[i][4]);


			 }
			entrada.close();


	}

}
