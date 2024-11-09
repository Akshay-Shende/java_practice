package java_practice;

public class Methods {
	public void displayFunction(String name) {
		System.out.println("my name is: "+name);
	}
	
	public int addition(int x, int y) {
		return x+y;
	}
	public String addition(float x, int y) {
		return "sum of x and y is " + (x+y);
	}

	public static void main(String[] args) {
		System.out.println("methods learning...");
		Methods method = new Methods();
		method.displayFunction("Akshay");
		int sum = method.addition(21, 11);
		System.out.println("sum is :"+sum);
		
		System.out.println(method.addition(10.2f,21));
		
		
	}

}
