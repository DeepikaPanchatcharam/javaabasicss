package revision;
import java.util.HashMap;

public class Hashmapp {
	public static void main(String[]args) {
		HashMap <String,Integer> age =new HashMap <String,Integer>();
		age.put("aa", 21);
		age.put("cc",43);
		age.put("dd", 12);
		System.out.println(age);
		
		age.replace("aa", 21,31);
		System.out.println(age);
		
		
		System.out.println(age.get("cc"));
	}

}
