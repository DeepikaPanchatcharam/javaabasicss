package revision;

public class Son extends Father{
	public void school() {
		System.out.println("study");
	}
	public static void main(String[]args) {
		Son obj=new Son();
		obj.business();
		obj.school();
		obj.aged();
		
	}

}
