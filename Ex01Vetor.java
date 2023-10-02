package projetoVetores;
import java.util.Scanner;
public class Ex01Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vetorMeses = new String [] {"jan","fev","mar","abr","mai","jun","jul","ago","set","out","nov","dez"};
		int [] vetorTemp = new int [12];
		int mesMaior = 0, mesMenor = 0, mesMaisFrio = 0, mesMaisQuente = 0;
		
		Scanner entrada = new Scanner(System.in);
		
		 for (int i = 0; i < 12; i++) {
			 
			 System.out.println("digite a temp do mes de " + vetorMeses[i]);
			 vetorTemp[i] = entrada.nextInt();
			 
			 if (vetorTemp[i] < mesMenor  ) {

				 mesMenor = vetorTemp[i];

				 mesMaisFrio = i;
			 }
			
			 if (vetorTemp[i] > mesMaior) {

				 mesMaior = vetorTemp[i];

				 mesMaisQuente = i;

				 }
			 
		 }
		

 System.out.println("A menor temperatura é " + vetorTemp[mesMenor] + " no mês de " + 
 vetorMeses[mesMaisFrio] );

 System.out.println("A maior temperatura é " + vetorTemp[mesMaior] + " no mês de " + 
 vetorMeses[mesMaisQuente] );
 
 entrada.close();
 
		
	}

}
