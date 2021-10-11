package arrayListPackage;
import java.util.*;

public class birdsCategory {
	public static void main(String[] args) {
		List<Object> l = new ArrayList<Object>();
		
		l.add(new GoldenEagle());
		l.add(new MountianEagle());
		l.add("Rufus");
		l.add(10);//AutoBoxing
		
		System.out.println("Size of ArrayList is "+l.size()+"\n");
		System.out.println("---Contents Of ArrayList---");
		for(int i=0;i<l.size();i++) {
			Object obj=l.get(i);
			if(obj instanceof GoldenEagle) {
				
				((GoldenEagle)(obj)).fly();
				((GoldenEagle)(obj)).hunt();
			}
			else if(obj instanceof MountianEagle) {
				((MountianEagle)(obj)).fly();
				((MountianEagle)(obj)).hunt();
			}
			else
				System.out.println(obj);
		}
		System.out.printf("\n",l.get(0));
		System.out.println("Modify an element from");
		l.set(3,100);
		for(Object obj1:l) {
			System.out.println(obj1);
		}
		l.remove(2);
		System.out.println("\nSize after removing is "+l.size());
		
		System.out.println("\n---------------String ArrayList-----------");
		List<String> l1= new ArrayList<String>();
		l1.add("Tom");
		l1.add("Jack");
		l1.add("Rufus");
		l1.add("A");
		l1.add("K");
		l1.add("F");
//		l1.add(10); 
//		will show a compile time error as list contains only strings its called generic in <>
		Collections.sort(l1);
		System.out.println("Length of List "+l1.size());
		for(String obj2:l1) {
			System.out.println(obj2+" is of length "+(obj2).length());
		}
		
		System.out.println("\n---------------Integer ArrayList-----------");
		List<Integer> l2= new ArrayList<Integer>();
		l2.add(100);
		l2.add(500);
		l2.add(300);
		l2.add(400);
//		l1.add("Rufus"); 
//		will show a compile time error as list contains only strings its called generic in <>
		Collections.sort(l2); //collections is a utility class
		System.out.println("Length of List "+l2.size());
		for(Integer obj2:l2) {
			System.out.println("Length of string "+ obj2.intValue());
		}
	}
}
/*		Difference between array and vector 
1. Array is not synchronized where as its synchronized in vector
2. Overhead is more in vector and will slow down the application when vector is used. Multi threading
*/ 