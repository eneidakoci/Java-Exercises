package skedaret;
public class prove {
public static void main(String[] args) {
I1 i1 = new C1();
i1.meth1();
I2 i2 = new C2();
i2.meth1();
C1 c1 = new C2();
c1.meth1();
}
}

interface I2 { 
	public void meth1();
	}
interface I1 extends I2 {
	public void meth1();
	}

class C1 implements I1 {
	public void meth1() {
System.out.println("2");
	}
}

class C2 extends C1 implements I2 {
public void meth1() {
System.out.println("1"); }
}