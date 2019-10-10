package charCount;

public class StringToArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			String str="1 + 1";
			int a=0,count=0;
			char[] c=str.toCharArray();
	for(int i=0;i<c.length;i++) {
		if(c[i]!=' ') {
			
			if(c[i]=='+') {
				break;
				
			}else {
				a+=Character.getNumericValue(c[i]);
				
			}
		}else if(c[i]==' ') {
			
		}else {
			
			throw new Exception("Exception");

		}

	}
System.out.println(a);
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println("exception");
		}
			}

}
