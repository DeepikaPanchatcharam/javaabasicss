package revision;

public class Banking implements Interfacee {
	public void savings() {
		System.out.println("savings");
		
	}
	public void current() {
		System.out.println("current");
	}
	public static void main(String[]args) {
		Banking obj=new Banking();
		obj.current();
		obj.savings();
		
	}

}
