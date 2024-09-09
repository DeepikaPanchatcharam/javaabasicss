package revision;

public class Functionn {
	public static int addition(int a , int b) {
		return a+b;
		
	}
	public static int subtraction(int a, int b) {
		return a-b;
	}
	
	public static int multiplication(int a, int b) {
		return a*b;
	}
	
	public static int division(int a, int b) {
		return a/b;
	}
	public static void main (String[]args) {
		int add=addition(2,3);
		int sub=subtraction(5,2);
		int mul=multiplication(2,3);
		int div=division(9,3);
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		
	
	}
}
