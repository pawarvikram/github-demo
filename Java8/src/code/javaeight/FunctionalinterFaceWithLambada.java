package code.javaeight;
//No dot class file is generated for lambada expression.
/* we can use lambada expression with only functional interface concept because we can't call multiple abstract methods
 
 
 For Example
 @FunctionalInterface
public interface A {
	 public void m1(int a,int b);
	 public void m2(String a,String b);
	
}
It will confuse which method should call.
Hence Functional interface is the specific concept not general concept.
 */


public class FunctionalinterFaceWithLambada {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//A a =new Lambada();
		//a.m1();
		
		//A a=()->System.out.println("Inside the lambada Expression");
		//a.m1();
		A a=(A,b)->System.out.println("Inside the lambada Expression"+(A+b));
		a.add(10,20);
		a.add(10,200);
		a.add(10,2000);
		a.add(10,20000);
	
		Square s=n->n*n;
		
		System.out.println("Square"+s.square(4));
	}

}
