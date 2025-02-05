package AtvLista01Ex02;

import java.util.Scanner;

public class Lista2ex03 {

	public static void main(String[] args) {
	   
	        Scanner scanner = new Scanner(System.in);
	        int menor21 = 0, maior50 = 0;
	        
	        System.out.println("Digite as idades (digite um número negativo para encerrar):");
	        
	        while (true) {
	            System.out.print("Idade: ");
	            int idade = scanner.nextInt();
	            
	            if (idade < 0) {
	                System.out.println("Idade inválida! Digite uma idade válida.");
	                continue; 
	            }

	            if (idade == 0) {
	                break; 
	            }
	            
	            if (idade < 21) {
	                menor21++;
	            } else if (idade > 50) {
	                maior50++;
	            }
	        }
	        
	        scanner.close();

	        System.out.println("\nTotal de pessoas com menos de 21 anos: " + menor21);
	        System.out.println("Total de pessoas com mais de 50 anos: " + maior50);

	}

}
