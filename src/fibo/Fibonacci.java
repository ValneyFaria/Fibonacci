package fibo;

import java.util.Scanner;

public class Fibonacci {

	static long fiboIterativo(int n) {
		long F = 0; // Atual
		long ant = 0; // Anterior

		for (int i = 1; i <= n; i++) {
			if (i == 1) {
				F = 1;
				ant = 0;
			} else {
				F += ant;
				ant = F - ant;
			}
		}
		return F;
	}

	static long fiboRecursivo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
		}
	}

	public static void main(String[] args) {
		int valor;
		Scanner le = new Scanner(System.in);

		System.out.println("Insira o tanto de termos desejados:");
		valor = le.nextInt();

		// Imprime os 30 primeiros termos de forma iterativa
		System.out.println("ITERATIVO:");
		for (int i = 0; i < valor; i++) {
			System.out.printf("[%d]: %d\n", i + 1, Fibonacci.fiboIterativo(i));
		}

		// Imprime os 30 primeiros termos de forma recursiva
		System.out.println("\nRECURSIVO:");
		for (int i = 0; i < valor; i++) {
			System.out.printf("[%d]: %d\n", i + 1, Fibonacci.fiboRecursivo(i));
		}
		le.close();
	}
}
