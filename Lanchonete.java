package atividadesLanchonetes;

import java.util.Scanner;

public class Lanchonete {

	public static void main(String[] args) {
		 Scanner input = new Scanner(System.in);
		 
		 String[] produtos = {"Hamburguer", "Cheeseburguer", "Refrigerante", "Suco Natural", "Batata Frita"};
	        double[] precos = {12.00, 14.00, 6.00, 8.00, 10.00};
	        int[] quantidades = new int[produtos.length];

	        System.out.println("Bem-vindo à Lanchonete Java!");
	        System.out.println("Aqui está o nosso cardápio:\n");

	        
	        for (int i = 0; i < produtos.length; i++) {
	            System.out.printf("%d - %-15s R$ %.2f%n", i + 1, produtos[i], precos[i]);
	        }

	        System.out.println("\nDigite a quantidade desejada para cada item:");
	        for (int i = 0; i < produtos.length; i++) {
	            
	            System.out.printf("Quantidade de %s: ", produtos[i]);
	            quantidades[i] = input.nextInt();
	        }

	        double totalPedido = 0.0;

	        System.out.println("\nRelatório do Pedido:");
	        System.out.println("----------------------------");

	        for (int i = 0; i < produtos.length; i++) {
	            if (quantidades[i] > 0) {
	                double subtotal = precos[i] * quantidades[i];
	                totalPedido += subtotal;

	                System.out.printf("%-15s x%d - R$ %.2f%n", produtos[i], quantidades[i], subtotal);
	            }
	        }

	        System.out.println("----------------------------");
	        System.out.printf("Total a pagar: R$ %.2f%n", totalPedido);
	        System.out.println("\nObrigado por comprar conosco!");

	        input.close();

	}

}
