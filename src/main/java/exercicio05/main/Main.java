package exercicio05.main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Main app = new Main();

		app.start();
	}

	private void start() {

		Scanner scan = new Scanner(System.in);

		System.out.print("Digite uma opção: ");
		int valorDigitado = scan.nextInt();

		do {

			switch (valorDigitado) {
			case 1:
				System.out.println("Você digitou o Número 1!\n");
				break;

			case 2:
				System.out.println("\n");
				break;

			case 3:
				System.out.println("\n");
				break;

			case 4:
				System.out.println("Você digitou o Número 4!\n");
				break;

			default:
				System.out.println("Valor digitado fora do escopo definido!\n");
				break;
			}

			System.out.print("Digite uma opção: ");
			valorDigitado = scan.nextInt();

		} while (valorDigitado != 0);

		System.out.println("\nAcabou...");
	}
}
