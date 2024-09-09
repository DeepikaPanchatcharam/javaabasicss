package revision;

public class Methodload {
	public void details(String name) {
		System.out.println(name);
	}
	public void details(int age) {
		System.out.println(age);
	}
	
	public void details(char bgroup) {
		System.out.println(bgroup);
	}
	public static void main(String[]args) {
		Methodload obj=new Methodload();
		obj.details("deep");
		obj.details(21);
		obj.details('a');
		
	}

}
