package Exception.Code;

public class TryCatchReturnValue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         System.out.println(m1());
	}
static int m1(){
	
	try {
	int	i= Integer.parseInt("abc");
	return i;
		
	} catch (Exception e) {
		System.out.println(e);
		return 20;
	}finally {
		return 21;
	}
}

}
