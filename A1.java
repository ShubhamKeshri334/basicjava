package inheritance;

public class A1 {
	static String name="a1 variable";
	int c=19;
	A1(int a){
	System.out.println("A1 Class constructor");
	
}
static void a1() {
	System.out.println("A1 class method");
}
}
class A2 extends A1{//A2 class inheriting A1 class is an example of single level inheritance 
	double d=1.4567;
	A2(String a){
		super(10);
		System.out.println("A2 Class constructor");
		System.out.println(name);
	}
	void a2() {
		System.out.println("A2 class method");
		System.out.println(name);
		System.out.println(c);
	}
}
class A3 extends A2{// A3 class inheriting A2 class is example of multi level inheritance as A2 class is already inheriting A1 class.
	A3(){
		super("A");
		System.out.println("A3 class constructor");
		System.out.println(c);
	}
	public static void main(String[] args) {
		A3 a1=new A3();
		a1.a2();
		a1();
		System.out.println(name);
		System.out.println(a1.d);
		System.out.println(a1.c);
	}
}