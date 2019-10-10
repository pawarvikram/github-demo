package Exception.Code;

public class ExceptionNotExecuteTryStament {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			
			int i=10/0;
System.out.println("hi this staement will not execute");
	}
		catch (Exception e) {
			// TODO: handle exception
		//	System.out.println(e);
			e.printStackTrace();
			System.out.println("hi this staement will  execute");
		} 
		finally {
			System.out.println("statement will execute always");
		}
	}

}
