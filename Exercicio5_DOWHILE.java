package Loops;


import java.util.Scanner;

public class Exercicio5_DOWHILE {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int numero=0; int soma = 0;
		
		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			
			if (numero> 0) {
			soma = soma +numero;
			}
			
		}while (numero!=0);
		
		
		System.out.println ("\nA soma dos números é: "+soma);
		}
		
		/* fim do programa */
	} 

