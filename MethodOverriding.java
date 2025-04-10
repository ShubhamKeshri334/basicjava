package methodOverriding;
class A1{
	void add() {
		System.out.println("parent class method");
	}
}
public class MethodOverriding extends A1 {//developing a method in child class with the same name and signature as in parent class but with different implementation is called as method overriding.
								// There should be the relationship between the child class and parent class.
								//can only override non static methods.
								//both methods in child class and parent class should have same name and signature(return type and parameters.
								//methods body should be different.		
	void add() {
		//super.add();//To call the parent class implementation.
		System.out.println("child class method");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MethodOverriding a1=new MethodOverriding();
		a1.add();
	}

}
