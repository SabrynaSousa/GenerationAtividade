package Atividades8;

import java.util.Scanner;
import java.util.Stack;

public class Atividade2 {

	public static void main(String[] args) {
		
		  Stack<String> pilhaLivros = new Stack<>();
	        Scanner scanner = new Scanner(System.in);
	        int opcao;

	        do {
	            System.out.println("\nMenu:");
	            System.out.println("1 - Adicionar livro na pilha");
	            System.out.println("2 - Listar todos os livros");
	            System.out.println("3 - Retirar livro da pilha");
	            System.out.println("0 - Sair");
	            System.out.print("Escolha uma opção: ");
	            opcao = scanner.nextInt();
	            scanner.nextLine(); 

	            switch (opcao) {
	                case 1:
	                    System.out.print("Digite o nome do livro: ");
	                    String livro = scanner.nextLine();
	                    pilhaLivros.push(livro);
	                    System.out.println(livro + " foi adicionado à pilha.");
	                    break;
	                case 2:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia.");
	                    } else {
	                        System.out.println("Livros na pilha: " + pilhaLivros);
	                    }
	                    break;
	                case 3:
	                    if (pilhaLivros.isEmpty()) {
	                        System.out.println("A pilha está vazia. Nenhum livro para retirar.");
	                    } else {
	                        String livroRemovido = pilhaLivros.pop();
	                        System.out.println("Retirando: " + livroRemovido);
	                    }
	                    break;
	                case 0:
	                    System.out.println("Encerrando o programa...");
	                    break;
	                default:
	                    System.out.println("Opção inválida. Tente novamente.");
	            }
	        } while (opcao != 0);

	        scanner.close();
	}

}
