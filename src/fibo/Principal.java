package fibo;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		int valor;
		Scanner le = new Scanner(System.in);

		System.out.println("Insira o tanto de termos desejados:");
		valor = le.nextInt();

		long tempoInicio = System.currentTimeMillis();

		// Imprime os primeiros termos de forma iterativa
		System.out.println("ITERATIVO:");
		for (int i = 0; i < valor; i++) {
			System.out.printf("[%d]: %d\n", i + 1, FibonacciI.fiboIterativo(i));
		}

		System.out.println("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
		// O código acima irá te retornar o tempo gasto em milisegundos...

		tempoInicio = System.currentTimeMillis();
		// Imprime os primeiros termos de forma recursiva
		System.out.println("\nRECURSIVO:");
		for (int i = 0; i < valor; i++) {
			System.out.printf("[%d]: %d\n", i + 1, FibonacciR.fiboRecursivo(i));
		}

		System.out.println("Tempo Total: " + (System.currentTimeMillis() - tempoInicio));
		// O código acima irá te retornar o tempo gasto em milisegundos...
		le.close();
	}
}