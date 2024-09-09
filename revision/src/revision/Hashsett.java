package revision;
import java.util.HashSet;
public class Hashsett {
	public static void main (String[]args) {
		HashSet <String> country=new HashSet<String>();
		country.add("india");
		country.add("paki");
		country.add("russia");
		System.out.println(country.contains("india"));
		System.out.println(country.contains("aus"));
	}

}
