package methodfeagturesAndConstructorReference;
//this is the method reference we are using for static method.
public class MethodReferenceStaticThread {
	public static void m1() {
		for (int i=0;i<10;i++) {
			System.out.println("childThrea"+i);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Runnable r=MethodReferenceStaticThread::m1;
Thread t =new Thread(r);
t.start();
for (int i=0;i<10;i++) {
	System.out.println("MainThread"+i);
}
	}

}
