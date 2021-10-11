package hashMap;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class SchoolManagementApp {

	public static void main(String[] args) throws NumberFormatException, IOException {
		System.out.println("START");
		Map <Integer,Student> l = new HashMap<Integer,Student>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter number of Records :");
		int no = Integer.parseInt(br.readLine());
		try {
			for(int i=0;i<no;i++) {
				System.out.println("Enter Roll No :");
				int rollNo = Integer.parseInt(br.readLine());
				System.out.println("Enter Name :");
				String name = br.readLine();
				Student s=new Student(rollNo,name);
				l.put(s.rollNo,s);
			}
		}
		catch(NumberFormatException | IOException e) {
			System.out.println("Error message :"+ e.getMessage());
		}
		System.out.println("Hash Map "+l.size());

		int userInputRollNo = 9;
		Student searchedStudent= l.get(userInputRollNo);
		System.out.println(searchedStudent);
		
//		l.remove(s4.rollNo);
		System.out.println("Hash Map "+l.size());
		System.out.println("Student Details");
		Process(l);
		System.out.println("END");
	}

	private static void Process(Map<Integer, Student> l) {
		SortedMap<Integer, Student> sortedMap = new TreeMap<Integer, Student>(l);
		Set<Integer> sk = sortedMap.keySet();
		Iterator<Integer> key = sk.iterator();
		while(key.hasNext()) {
			Student stu = l.get(key.next());
			System.out.println(stu);
		}
	}

}
