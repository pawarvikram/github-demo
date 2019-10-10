package Exception.Code;

public class ExceptionUsingThrows {
	
public static void m3()throws NumberFormatException,ClassCastException {
	int i=Integer.parseInt("abc");
}
public static void m2() {
	m3();
}

public static void m1() {
	m2();
}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

try {
	m1();
}catch (ClassCastException | NumberFormatException e) {
	// TODO: handle exception
	System.out.println("abc");
}
	}
 
}
