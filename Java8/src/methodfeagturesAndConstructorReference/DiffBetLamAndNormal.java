package methodfeagturesAndConstructorReference;
/*whenever implementation is not available we should go for lambada expression.If implementation is available then we should go for method refrence.
 In below example */
public class DiffBetLamAndNormal {
public static void sum(int a,int b) {
	System.out.println("sum of the two numbers"+(a+b));
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
interf f=(a,b)->System.out.println("sum of the two nubers"+(a+b));
f.m1(10,20);
interf f1=DiffBetLamAndNormal::sum;
f1.m1(100,200);
	}

}
