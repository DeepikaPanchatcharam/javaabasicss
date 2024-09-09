package revision;

public class Daughter extends Father {
	public void makeup() {
		System.out.println("makeup");
	}
	public static void main(String[]args) {
		Daughter obj=new Daughter();
		obj.business();
		obj.makeup();
	}

}
