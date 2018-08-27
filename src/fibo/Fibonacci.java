package fibo;

public class Fibonacci {

	static long fiboIterativo(int n) {
		int F = 0; // atual
		int ant = 0; // anterior

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

		// teste do programa. Imprime os 30 primeiros termos
		System.out.println("RECURSIVO:");
		for (int i = 0; i < 30; i++) {
			System.out.println("(" + i + "):" + Fibonacci.fiboRecursivo(i));
		}

		// teste do programa. Imprime os 30 primeiros termos
		System.out.println("\nITERATIVO:");
		for (int i = 0; i < 30; i++) {
			System.out.println("(" + i + "):" + Fibonacci.fiboIterativo(i));
		}
	}
}
