package Exception.Code;

public class TryCatchFinalReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(m1());
	}
static int m1(){
	int i=0;
	try {
		i= 20;
		return i;
	//	System.out.println("try statement");
	} catch (Exception e) {
		// TODO: handle exception
		i= 21;
		System.exit(-2);
		//return 20;
	
		//System.out.println("catch statement");
	}finally {
		i=1;
		//return 20;
		//return 20;
	//	System.out.println("finally statement");
		
	}
	return i;
	//System.out.println("finally statement");
}

}
