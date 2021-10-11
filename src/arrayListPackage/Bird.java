package arrayListPackage;

public abstract class Bird {
	
	@Override
	public String toString() {
		return "Bird \ngetClass()=" + getClass() + "\ntoString()=" + super.toString() + "]";
	}

	public void eat() {
        System.out.println("All birds eat");
    }
}
