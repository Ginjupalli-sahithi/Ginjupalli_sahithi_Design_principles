package calci;

import java.util.*;


public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Enter operation(+ || - || * || /):");
		Scanner s=new Scanner(System.in);
		char op = s.next().charAt(0);
		if (op != '+' && op != '-' && op!= '*' && op!= '/')
		{
			System.out.println("Invalid operator!!..");
			System.exit(0);
		}
		System.out.print("Enter operand 1 : ");
		Double a=s.nextDouble();
		System.out.print("Enter operand 2 : ");
		Double b=s.nextDouble();
		operations ob = new operations();
		if(op == '+') {
			ob.add(a, b);
		}
		else if (op == '-') {
			ob.sub(a, b);
		}
		else if (op == '*') {
			ob.mul(a, b);
		}
		else if(op == '/') {
			ob.div(a, b);
		}
		s.close();

	}

}
