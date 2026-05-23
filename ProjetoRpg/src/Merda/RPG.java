package Merda;

import java.util.Scanner;

public class RPG {
	static Scanner leia = new Scanner(System.in);

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
				System.out.println("Tente Novamente");
				System.out.println("\n");
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

		System.out.println("\nVc ta na floresta");
		System.out.println("\n  INSTRUCOES");
		System.out.println("\nExplore para ganhar pontos de XP");
		System.out.println("\nDescanse para recuperar seu HP");
		System.out.println("\nCaso seu HP chegar a 0 o personagem MORRERA e sera o fim do jogo");

		int subOpcao;
		int hp = 100;
		int bandagens = 2;
		do {
			System.out.println("1 -         Explorar");
			System.out.println("2 - Voltar ao menu principal");
			System.out.print("         Escolha uma opcao: ");
			subOpcao = leia.nextInt();

			switch (subOpcao) {
			case 1:
				// Sorteio pra ou entrar em combate, ou encontrar um item
				double sorteio = Math.random();
				if (sorteio < 0.85) {
					System.out.println("\nVocê encontrou um inimigo!");
					System.out.println("\nEntrando em combate!!");
					//Lógica do combate junto de um menu de combate
					int hpInimigo = 100;
					int opcaoCombate;
					do {
						//Loop no Menu de combate
					    System.out.println("\nHP: " + hp + " | Bandagens: " + bandagens);

						System.out.println("1 - Ataque");
						System.out.println("2 - Defesa");
						System.out.println("3 - Curar");
						System.out.println("Faça sua escolha");
						opcaoCombate = leia.nextInt();
						switch (opcaoCombate) {
						case 1:
							double chanceDano = Math.random();
							int dano;
							if (chanceDano < 0.70) {
								dano = 10;
								System.out.println("Ataque normal! Dano: " + dano);
							} else {
								dano = 20;
								System.out.println("Dano CRITICO! Dano: " + dano);	
							}
							hpInimigo -= dano;
							System.out.println("HP do inimigo: " +hpInimigo);
							
							//Contra atque do inimigo
							double chanceContraInimigo = Math.random();
							if (chanceContraInimigo < 0.25) {
								hp -= 10;
								System.out.println("O inimigo contra-atacaou! você perdeu 10 de HP ");
								System.out.println("\n HP restante: " +hp);
							}
							break;
						case 2:
							System.out.println("Você se denfendeu!");
							break;
						case 3:
							System.out.println("Você se curou");
							break;
							default:
								System.out.println("Opção invalida");
								System.out.println("Tente Novamente");
						}
							
					}while (hp > 0 && hpInimigo > 0);
					if (hp <= 0) {
					    System.out.println("\nVocê morreu. Game Over.");
					} else {
					    System.out.println("\nVocê venceu!");
					    
					}
					
				}else {
					bandagens++;
					System.out.println("\nVocê achou uma bandagem!:" + bandagens );
					System.out.println("\nVocê tem "  +bandagens+  " bandagens disponiveis");
				}
				break;
			case 2:
				exibirMenu();
				break;
			default:
				System.out.println("\nOpção Invalida");
				System.out.println("Tente Novamente");
				System.out.println("\n");

			}
		} while (subOpcao != 2);

	}

	static void creditos() {
		// Vai mostrar os creditos, mostrando o nome dos envolvidos no projeto
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