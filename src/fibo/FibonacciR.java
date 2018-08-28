package fibo;

public class FibonacciR {

	static long fiboRecursivo(int n) {
		if (n < 2) {
			return n;
		} else {
			return fiboRecursivo(n - 1) + fiboRecursivo(n - 2);
		}
	}
}