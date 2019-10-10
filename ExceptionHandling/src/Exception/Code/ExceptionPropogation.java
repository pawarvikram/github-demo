package Exception.Code;
//if exception is not handled by its exception mechanism then its propogates to next excepgtion mechanism
public class ExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         try {
        	new ExceptionPropogation().m1();
			
		} catch (Exception e) {
			// TODO: handle exception
			System.out.println("statement in main");
		}
	}
	
	public void m1() {
		try {
			int i=Integer.parseInt("abc");
		} catch (NullPointerException e) {
			// TODO: handle exception
			System.out.println("this staement");
		}
	}

}
