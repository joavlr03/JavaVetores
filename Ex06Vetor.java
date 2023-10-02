package projetoVetores;
import 	java.util.Scanner;
public class Ex06Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

			 Scanner entrada = new Scanner(System.in);

			 

			 String gabarito[] = new String [8]; 

			 String alunos[] = new String[10];

			 int notas[] =new int [10];

			 int acerto =0;

			 

			 for (int i =0; i < 8; i++) {

			 System.out.println("Digite a resposta da questão " + (i+1));

			 gabarito[i] = entrada.next(); 

			 }

			 //Alunos

			 for (int i=0; i<10 ; i++) {

			 System.out.println("----------Aluno " + (i+1) + "------------");

			 System.out.println("Digite o número do aluno ");

			 alunos[i] = entrada.next();

			 //Questões

			 for (int j =0; j<8; j++) {

			 System.out.println("Digite a resp dada pelo a aluno " 

			 + alunos[i] + " a questão " + (j+1));

			 String resp = entrada.next();

			 if (resp.equals(gabarito[j])) {

			 acerto ++;

			 } 

			 }

			 notas[i] = acerto;

			 acerto = 0;

			 }

			 

			 // for do resultado. 
			 int aprov = 0;

			 for (int i = 0; i < 10; i++) {

			 System.out.println("Nota do aluno " + alunos[i] + " : " + notas[i]);


			 

			 if (notas[i] >= 6) {

			 aprov++;

			 }

			 }

			 System.out.println("A porcentagem de aprovação é " 

			 + (aprov/10) * 100 + "%");
			 
			 entrada.close();
			 

			 

	  }

	}

