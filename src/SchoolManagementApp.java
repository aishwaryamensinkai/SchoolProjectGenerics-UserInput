import java.util.*;

public class SchoolManagementApp {

	public static void main(String[] args) {
		System.out.println("START");
		List <Student> l = new ArrayList<Student>();
		l.add(new Student(99,"Daisy"));
		l.add(new Student(89,"Sonu"));
		l.add(new Student(9,"Ali"));
		l.add(new Student(19,"Zyed"));
		System.out.println("Before Sorting");
		for(Student stu:l)
			System.out.println(stu);
		Collections.sort(l);
		System.out.println("\nAfter Sorting");
		for(Student stu:l)
			System.out.println(stu);
		System.out.println("END");
	}

}
