package atividade.array;

import java.util.Scanner;

public class CadastroNotas {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] nomes = new String[5];
		double[] nota1 = new double[5];
		double[] nota2 = new double[5];
		double[] medias = new double[5];
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Digite o nome do aluno " + (i + 1) + ": ");
			nomes[i] = input.nextLine();
			
			System.out.println("Nota 1: ");
			nota1[i] = input.nextDouble();
			
			System.out.println("Nota 2: ");
			nota2[i] = input.nextDouble();
			input.nextLine();
			
			medias[i] = (nota1[i] + nota2[i]) / 2;
			System.out.println();
		}
		
		System.out.println("Resultado Final:");
		for (int i = 0; i < 5; i++) {
			System.out.println(nomes[i] + " - Média: " + medias[i]);
		}
		
		input.close();
	}

}
