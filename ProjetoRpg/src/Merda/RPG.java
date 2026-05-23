package Merda;

import java.util.Scanner;

public class RPG {static Scanner leia = new Scanner(System.in);

public static void main(String[] args) {

    System.out.println("    ________________________");
    System.out.println("   |                        |");
    System.out.println("   |   COSTURA DE NAÇÕES    |");
    System.out.println("   |________________________|");

    exibirMenu(); // chama o menu

    leia.close();
}

static void exibirMenu() {
    int opcao;

    do {
        System.out.println("\n=== MENU PRINCIPAL ===");
        System.out.println("\n1 -     JOGAR");
        System.out.println("\n2 -    CREDITOS");
        System.out.println("\n3 -  SAIR DO GAME");
        System.out.println("\n  ESCOLHA SUA OPCAO: ");
        opcao = leia.nextInt();
   
        switch (opcao) {
        case 1:
            jogar();
            break;
        case 2:
            creditos();
            break;
        case 3:
            System.out.println("Saindo...");
            System.out.println("\nAté breve");
            break;
        default:
            System.out.println("Opção inválida.");
    }

} while (opcao != 3);
}

static void jogar() {
System.out.println("\nVamos jogar!!");
System.out.println("\nBem vindo ao mundo de: Nome do mundo e lore blablabla");
System.out.println("\nAcompanhe a história de Amity");

System.out.println(" __________________");
System.out.println("|                  |");
System.out.println("|    CAPITULO 1    |");
System.out.println("|__________________|");



}


static void creditos() {
	//Vai mostrar os creditos, mostrando o nome dos envolvidos no projeto
	System.out.println("CRÉDITOS");
	System.out.println("\nOtavio");
	System.out.println("\nIuri");
	System.out.println("\nLucas");
	System.out.println("\nJuliana");
	System.out.println("\nVinicius");
	System.out.println("\nGabriel");
	leia.nextLine();
	leia.nextLine();
}
}