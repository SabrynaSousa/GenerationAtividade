package AtvListas;

import java.util.Scanner;

public class Lista03ex05 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);
	        int soma = 0;

	        System.out.println("Digite números inteiros (digite 0 para encerrar):");

	        while (true) {
	            System.out.print("Número: ");
	            int numero = scanner.nextInt();

	            if (numero == 0) {
	                break; 
	            }

	            if (numero > 0) {
	                soma += numero; 
	            }
	        }

	        scanner.close();

	        System.out.println("\nA soma dos números positivos digitados é: " + soma);
	}

}
