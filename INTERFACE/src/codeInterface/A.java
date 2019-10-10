package codeInterface;

public class A implements I1, I2 {

	@Override
	public void m1() {
		// TODO Auto-generated method stub
System.out.println("a");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
new A().m1();
	}

}
