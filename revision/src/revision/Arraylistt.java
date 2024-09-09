package revision;
import java.util.ArrayList;

public class Arraylistt {
	public static void main (String[]args) {
		ArrayList <Integer> age=new ArrayList<Integer>();
		age.add(21);
		age.add(31);
		age.add(41);
		System.out.println(age);
		age.set(0,20);
		age.remove(2);
		System.out.println(age);
		System.out.println(age.get(1));
		}

}
