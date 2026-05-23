package Menu;

import java.util.Scanner;

public class Menu_RPG {

	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("    ________________________");
		System.out.println("   |                        |");
		System.out.println("   |   COSTURA DE NAÇÕES    |");
		System.out.println("   |________________________|");
		
		int opcao;
		
		do {
            System.out.println("\n=== MENU PRINCIPAL ===");
            System.out.println("\n1 -     JOGAR");
            System.out.println("\n2 -    CREDITOS");
            System.out.println("\n3 -  SAIR DO GAME");
            System.out.println("\n  ESCOLHA SUA OPCAO: ");
            opcao = leia.nextInt();
            
	}

}
