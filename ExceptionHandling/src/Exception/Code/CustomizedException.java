package Exception.Code;

import java.util.Scanner;

public class CustomizedException extends Exception {
	
	
	
	 String p_age;

	public CustomizedException(String p_age) {
		// TODO Auto-generated constructor stub
		this.p_age=p_age;
	}
public	String toString() {
	return p_age;
}
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your age");
		int age=sc.nextInt();
		try {
			if(age<0) {
				throw new CustomizedException("Age is Negative");
				
			}
		}catch(Exception e) {
			System.out.println(e);
			e.printStackTrace();
		}
	}
	

}
