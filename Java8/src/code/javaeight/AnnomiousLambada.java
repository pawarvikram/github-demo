package code.javaeight;
/*in anomious class we can use lambada expression if given class is functional interface.otherwise we cant use Lambada Expression */
public class AnnomiousLambada {
A a =new A() {

	@Override
	public void add(int a, int b) {
		// TODO Auto-generated method stub
		
	}
};
//in this scenario we cant use lambada expression with inner class
AnnomiousInterface ai=new AnnomiousInterface() {
	public void m1() {}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
};
}
//Anonymous Inner class vs Lambada Expression
/*
 Anonymous Inner class can extends normal class.
 Anonymous Inner class can extends abstract class.
 Anonymous Inner class can implements interface with n number of abstract methods.

 Lambda expression can implement interface with single abstracr method.
 
  */
