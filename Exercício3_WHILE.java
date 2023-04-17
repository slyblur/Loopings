package Loops;

import java.util.Scanner;

public class Exercício3_WHILE {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		int idade = 0, menor21 = 0, maior50 = 0;
		
		while (idade >= 0){
			
			System.out.println ("Digite a idade: ");
			idade = leia.nextInt();
			
			if (idade >=1 && idade < 21) {
				menor21++;
			} else if (idade>50) {
				maior50++;
			}
		}
		
		System.out.println("\nTotal de pessoas com menos de 21: "+menor21);
		System.out.println("Total de pessoas maior de 50: "+maior50);
				
			
			} /* fim do programa... uff. */
			}
			
		

