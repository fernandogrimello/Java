package menuApp;

import java.util.Scanner;

public class MenuApp {

	public static void main(String[] args) {
	
		
		Scanner scanner = new Scanner(System.in);
		
		UsuarioService usuarioService = new UsuarioService();
		
		int opcao;
		
		do {
			System.out.println("=====MENU=====");
			System.out.println("1. Cadastrar Usuário");
			System.out.println("2. Listar Usuários");
			System.out.println("3. Sair");
			System.out.println("Ëscolha uma opção: ");
			
			opcao = scanner.nextInt();
			scanner.nextLine();
			
			switch (opcao) {
			
			case 1: 
				System.out.println("Digite o nome do usuário: ");
			String nome = scanner.nextLine();
			usuarioService.cadastrarUsuario(nome);
			break;
			case 2:
				usuarioService.listarUsuarios();
				break;
			case 3:
				System.out.println("Encerrando o programa...");
				break;
			default:
				System.out.println("Opção inválida!Tente novamente.");
			}
			System.out.println();
		} while (opcao != 3);
		
		 	scanner.close();


	}

}
