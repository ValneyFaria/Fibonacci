package fibo;

public class FibonacciI {
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
}
