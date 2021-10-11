package hashSet;

public class Student implements Comparable<Student>{
	int rollNo;
	String name;
	public Student() {}
	public Student(int rollNo) {
		this.rollNo = rollNo;
	}
	public Student(String name) {
		this.name = name;
	}
	public Student(int rollNo, String name) {
		this.rollNo = rollNo;
		this.name = name;
	}
	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + "]";
	}
	@Override
	public int compareTo(Student s) {
		return name.compareTo(s.name);
//		if(rollNo > s.rollNo)
//			return 1;
//		else
//			return -1;
	}
	public void get(int i) {
		// TODO Auto-generated method stub
		
	}

}
