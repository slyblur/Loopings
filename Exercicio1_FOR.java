package Loops;

import java.util.Scanner;

public class Exercicio1_FOR {

	public static void main(String[] args) {
		
		
		Scanner leia = new Scanner (System.in);
		
		int n1, n2, i=0;
		
		System.out.println("Digite o primeiro número do intervalo: ");
		n1 = leia.nextInt();
		
		System.out.println ("Digite o último número do intervalo: ");
		n2 = leia.nextInt();
		
		if (n1<n2) {
			
			System.out.println("\nNúmeros múltiplos de 3 e 5: ");
			
			for (i=n1; i<=n2; i++) {
				if(i % 3 ==0 && i%5==0) {
					System.out.println (i);
				}											
			}
			
		} else {
			System.out.println("Intervalo inválido.");
		}

	}
	
	/* fim do programa */

}
