package arrayListPackage;

public abstract class Eagle extends Flying{
	@Override
	public void fly() {
		System.out.println("Eagle can fly at an altitude of 37000 feet.");
	}
    public abstract void hunt();
}
