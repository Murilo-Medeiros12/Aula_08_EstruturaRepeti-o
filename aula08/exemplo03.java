package projeto_LPA.aula08;

import java.util.Scanner;

public class exemplo03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int n, resultado;

		System.out.println("informe um numero para a tabuada: ");
		n = ler.nextInt();

		for (int i = 0; i <= 10; i++) {
			resultado = n * i;
			System.out.println(n + " x " + i + " = " + resultado);
		}
		ler.close();
	}

}
