package inheritance;

public class ParentClass extends SuperClass {//parentClass inheriting super-most class, it is example of multiple level inheritance.
	static void add(int a,int b) {
		System.out.println(Math.addExact(a, b));
	}
	static String name ="Shubham";
	ParentClass(){
		System.out.println("Constructor from parent class");
	}
}
