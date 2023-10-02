package projetoVetores;
import	java.util.Scanner;
public class Ex08Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			int [] vetComiss = new int [3];
			int [] vetVendas = new int [3]; 
			String[] vetNome = new String[3];
			String[] vetEstado = new String [3];
			
			Scanner entrada = new Scanner(System.in);
		
		
		 for (int i = 0; i < 3; i++) {
			 System.out.println("digite o nome do vendedor");
			 vetNome[i] = entrada.next();
			 
			 System.out.println("digite o total das vendas");
			 vetVendas[i] = entrada.nextInt();
			 
			 System.out.println("digite o percentual das comissoes");
			 vetComiss[i] = entrada.nextInt();
			 
			 System.out.println("digite o estado");
			 vetEstado[i] = entrada.next();
			 
		 }
		 
		 entrada.close();
	}

}
