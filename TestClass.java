package sampleprojectpackage;

public class TestClass {
	static int  number;
	
	public void sampleMethod() {
		
	}
	
	public static void main(String[] args) {
		Calculator calculator1 = new Calculator(5);
		Calculator calculator2 = new Calculator(150);
		
		System.out.println("Two calculators created");
		System.out.println("=================================");
		int calc1ResultSum = calculator1.sum(4, 5);
		int calc1ResultFactor = calculator1.factor(3);
		
		System.out.println("The result of sum 4+5 is:" + calc1ResultSum);
		System.out.println("The factor result is:" + calc1ResultFactor);
		
		int calc2ResultSum = calculator2.sum(4, 5);
		int calc2ResultFactor = calculator2.factor(3);
		
		System.out.println("The result of sum 4+5 is:" + calc2ResultSum);
		System.out.println("The factor result is:" + calc2ResultFactor);
		
		System.out.println("Que si hombree");
	}
	
}

class Calculator{
	private int factor;
	
	public Calculator(int factor) {
		this.factor = factor;
	}
	
	public int sum(int a, int b) {
		int result = a+b;
		return result;
	}
	
	public int factor(int x) {
		int result = 1;
		
		for (int i= 0; i<factor; i++ ) {
			result *= x;
		}
		
		return result;
	}
}
