package code.javaeight;

public class Employee {
	int eno;
	String name;

	public Employee(int eno, String name) {
		//super();
		this.eno = eno;
		this.name = name;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return eno+":"+name;
	}
}
