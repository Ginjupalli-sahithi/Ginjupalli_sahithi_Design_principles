package calci;

public class operations {
	public void add (double a, double b) {
		System.out.println(a + " + " + b +"=" + (a+b));
	}
	public void sub (double a, double b) {
		System.out.println(a + " - " + b +"=" + (a-b));
	}
	public void mul (double a, double b) {
		System.out.println(a + " * " + b +"=" + (a*b));
	}
	public void div (double a, double b) {
		if(b==0) {
			System.out.println("Division by zero error!!..");
		}
		else {
		System.out.println(a + " / " + b +"=" + (a/b));
		}
	}

}
