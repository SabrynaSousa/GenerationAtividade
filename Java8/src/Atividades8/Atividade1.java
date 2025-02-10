package Atividades8;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;


public class Atividade1 {

	public static void main(String[] args) {
		   
		        Queue<String> filaClientes = new LinkedList<>();
		        Scanner scanner = new Scanner(System.in);
		        int opcao;

		        do {
		            System.out.println("\nMenu:");
		            System.out.println("1 - Adicionar cliente na fila");
		            System.out.println("2 - Listar todos os clientes");
		            System.out.println("3 - Retirar cliente da fila");
		            System.out.println("0 - Sair");
		            System.out.print("Escolha uma opção: ");
		            opcao = scanner.nextInt();
		            scanner.nextLine(); 

		            switch (opcao) {
		                case 1:
		                    System.out.print("Digite o nome do cliente: ");
		                    String nome = scanner.nextLine();
		                    filaClientes.add(nome);
		                    System.out.println(nome + " foi adicionado à fila.");
		                    break;
		                case 2:
		                    if (filaClientes.isEmpty()) {
		                        System.out.println("A fila está vazia.");
		                    } else {
		                        System.out.println("Clientes na fila: " + filaClientes);
		                    }
		                    break;
		                case 3:
		                    if (filaClientes.isEmpty()) {
		                        System.out.println("A fila está vazia. Nenhum cliente para chamar.");
		                    } else {
		                        String clienteAtendido = filaClientes.poll();
		                        System.out.println("Chamando: " + clienteAtendido);
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


