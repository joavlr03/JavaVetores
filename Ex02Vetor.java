package projetoVetores;
import  java.util.Scanner;
public class Ex02Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] vetorNomes = new String[10];
        
		Scanner entrada = new Scanner (System.in);
		
		 for (int i = 0; i < 10; i++) {
			 
			 System.out.println("digite o nome :");
			 vetorNomes[i]=entrada.next();
			 
			 
			 if(vetorNomes[i] == vetorNomes[i]) {
				 
				 System.out.println("ACHEI");
			 }
				
			 
             if(vetorNomes[i] != vetorNomes[i]) {
				 
				 System.out.println(" N ACHEI");
			 }
             entrada.close();
		 }
	}

}
