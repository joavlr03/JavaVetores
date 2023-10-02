package projetoVetores;
import java.util.Scanner;
public class Ex02SegndRes {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nomes[] = new String[10];

		 String nomeProcurado;

		 Scanner entrada = new Scanner(System.in);

		 for (int i = 0; i < 10; i++) {

		 System.out.println("Digite o " + (i + 1) + " nome");

		 nomes[i] = entrada.next();

		 }

		 System.out.println("Digite o nome que deseja procurar:");

		 nomeProcurado = entrada.next();

		 for (int i = 0; i < 10; i++) {


		 

		 if (nomes[i].equals(nomeProcurado)) {

		 // Achei

		 System.out.println("Achei na posição " + (i+1));

		 } else {

		 // Não achei

		 System.out.println("Não achei");

		 }
		 entrada.close();
		 
		 }

		 }

	}


