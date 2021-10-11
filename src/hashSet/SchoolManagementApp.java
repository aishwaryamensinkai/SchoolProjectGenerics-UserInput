package hashSet;
import java.util.*;

public class SchoolManagementApp {

	private static String item;

	public static void main(String[] args) {
		System.out.println("START");
		Set <String> set = new HashSet<String>();
		set.add("z");
		set.add("A");
		set.add("Q");
		set.add("B");
		set.add("A");
		System.out.println("Set Size "+set.size());
		System.out.println("Hash Set");
		Iterator<String> i = set.iterator();
		while(i.hasNext()) {
			item=i.next();
			System.out.println(item.toLowerCase());
			if(item.equalsIgnoreCase("z"))
				i.remove();
			
		}
		System.out.println("Set Size "+set.size());
		i=set.iterator();
		while(i.hasNext()) {
			item=i.next();
			System.out.println(item.toUpperCase());
		}
		System.out.println("END");
	}

}
