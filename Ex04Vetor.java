package projetoVetores;
import java.util.Scanner;
public class Ex04Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner entrada = new Scanner(System.in);

		 String funcionarios[] = new String[5];

		 int temposDeServico [] = new int [5];

		 float salarios[] = new float [5];

		 

		 for (int i =0; i<1; i++) {

		 System.out.println("Digite o nome do funcionário:");

		 funcionarios[i] = entrada.next();

		 System.out.println("Digite o tempo de serviço");

		 temposDeServico[i] = entrada.nextInt();

		 System.out.println("Digite o salário do funcionário");

		 salarios[i] = entrada.nextFloat();

		 }

		 

		 //item A 

		 System.out.println("Os funcionários que não terão aumento: ");

		 for (int i=0; i<5; i++) { 

		 if (temposDeServico[i] < 5 && salarios[i] > 780) {

		 System.out.println(funcionarios[i]);

		 }

		 }

		 //item B 

		 //Demonstrar novos salários 

		 for (int i=0; i<5; i++) { 

		 if (salarios[i] < 780 && temposDeServico[i] <5) {

		 System.out.println("Funcionário " + funcionarios[i] 

		 + "novo salário " + salarios[i] *1.35);

		 }else if (temposDeServico[i] > 5) {

		 System.out.println("Funcionário " + funcionarios[i] 

		 + "novo salário " + salarios[i] *1.25); 

		 }

		 else if (salarios[i] < 780) { 

		 System.out.println("Funcionário " + funcionarios[i] 

		 + "novo salário " + salarios[i] *1.15);

		 } 

		 entrada.close();
		 

		 } 

		 

		 }

	}

