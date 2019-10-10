package Exception.Code;

public class NestedTry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s[]= {"a","b","c","d",null,"1"};
for (int i=0;i<s.length;i++) {
	try {
		int j=s[i].length();
		try {
			j=Integer.parseInt(s[i]);
		}catch(NumberFormatException e) {
			System.out.println("Number format exception");
		}
	}
	catch(NullPointerException e) {
		System.out.println("Null pointer exception");
	}
	
}
	}

}
