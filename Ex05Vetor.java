package projetoVetores;
import java.util.Scanner;
public class Ex05Vetor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
			 float valoresProd[] = new float[10];

			 int qtdsProd[] = new int[10];

			 int prodMaisVendido = 0;

			 float totalGeral = 0;

			 int posicao = 0;

			 for (int i = 0; i < 10; i++) {

			 System.out.println("-------- Produto " + (i + 1) + "---------");

			 System.out.println("Digite o valor do produto");

			 valoresProd[i] = entrada.nextFloat();

			 System.out.println("Digite a quantidade comprada");

			 qtdsProd[i] = entrada.nextInt();

			 if (i == 0 || qtdsProd[i] > prodMaisVendido) {

			 prodMaisVendido = qtdsProd[i];

			 posicao = i;

			 }


			 

			 }

			 System.out.println("------Relatório de Vendas------");

			 for (int i = 0; i < 10; i++) {

			 System.out.println(

			 "Qtd: " + qtdsProd[i] + " Preço: " + valoresProd[i] + " Total: " + qtdsProd[i] * valoresProd[i]);

			 totalGeral += qtdsProd[i] * valoresProd[i];

			 }

			 System.out.println("Total Geral : " + totalGeral);

			 System.out.println("Comissão : " + totalGeral * 0.05);

			 System.out.println("Preço da maior quantidade : " + valoresProd[posicao]);
			 
			 	entrada.close();


			 

			 }


			 

			}


