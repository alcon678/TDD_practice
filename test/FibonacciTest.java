import static org.junit.Assert.*;


public class FibonacciTest {

	
	@org.junit.Test
	public void N0ShouldBeCero(){
		assertEquals(0, Fibonacci.N0);
	}
	
	@org.junit.Test
	public void N1ShouldBeOne(){
		assertEquals(1, Fibonacci.N1);
	}
	
	@org.junit.Test
	public void N0plusN1shouldBeOne(){
		assertEquals(1,Fibonacci.suma(Fibonacci.N0, Fibonacci.N1));
	}	
	
	@org.junit.Test
	public void calculateFibonacciOfThree(){
		int n=3;
		
		assertEquals(2,Fibonacci.fibonacci(n));
	}
	
	@org.junit.Test
	public void calculateFibonacciOfCero(){
		int n=0;
		
		assertEquals(0,Fibonacci.fibonacci(n));
	}
	
	@org.junit.Test
	public void calculateFibonacciOfOne(){
		int n=1;
		
		assertEquals(1,Fibonacci.fibonacci(n));
	}

	@org.junit.Test
	public void calculateFibonacciOfTwelve() {
		int n = 12;
		
		assertEquals(144, Fibonacci.fibonacci(n));
	}

	@org.junit.Test
	public void calculateFibonacciOfFive() {
		int n = 5;
		
		assertEquals(5, Fibonacci.fibonacci(n));
	}
	
	@org.junit.Test
	public void calculateFibonacciOfNegative() {
		int n = -10;
		
		assertEquals(-1, Fibonacci.fibonacci(n));
	}

}
