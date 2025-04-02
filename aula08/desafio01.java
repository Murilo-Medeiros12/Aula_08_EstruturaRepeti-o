package projeto_LPA.aula08;

import java.util.Scanner;

public class desafio01 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int fatorial = 1;

		System.out.println("informe um numero para ser fatorado:");
		int n = ler.nextInt();

		for (int i = 1; i <= n; i++) {
			fatorial *= i;
		}
		System.out.println("seu resultado é: " + fatorial);
		ler.close();
	}
}