package projeto_LPA.aula08;

import java.util.Scanner;

public class exemplo02 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n;

		System.out.println("digite um numero maior que zero: ");
		n = ler.nextInt();

		for (int i = 0; i <= n; i++)
			System.out.println("Numero " + i);
		ler.close();
	}

}






