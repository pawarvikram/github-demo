package methodfeagturesAndConstructorReference;

public class MethodReferenceInstanceThread {
public void m1() {
	for (int i=0;i<10;i++) {
		System.out.println("childThreavik"+i);
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//Runnable r=MethodReferenceInstanceThread::m1;
		MethodReferenceInstanceThread t1=new MethodReferenceInstanceThread();
		Runnable r=t1::m1;
Thread t =new Thread(r);
t.start();
for (int i=0;i<10;i++) {
	System.out.println("MainThread"+i);
}
	}

}
