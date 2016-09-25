
public class Fibonacci {

	public final static int N0 = 0;
	public final static int N1 = 1;

	public static int suma(int num1, int num2) {
		return num1 + num2;
	}

	public static int fibonacci(int iteration) {
		if (iteration == 0) {
			return N0;
		} else if (iteration == 1) {
			return N1;
		}
		return iteration < 0 ? -1 : suma(fibonacci(iteration - 1), fibonacci(iteration - 2));

	}

}
