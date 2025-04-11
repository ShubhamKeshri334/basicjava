package thisCallingStatement;

class A2{
	A2(int a){
		System.out.println("A2 class constructor");
	}
}

class A1 extends A2{
	A1(){
		super(10);
		//this("shubham");
		System.out.println("A1 class constructor");
	}
	A1(int a,int b){
		this();
		System.out.println(Math.subtractExact(a, b));
	}
	A1(String name){
		this(20,10);
		System.out.println(name);
	}
}

public class TCS extends A1{//This calling statement is use to call one constructor from another constructor within the same class.
					//It should always be first line of the constructor.
					//It is also called as constructor chaining.
					//It is always explicit in nature.
					//Any constructor should not be the combination of this() and super().
TCS(){
	super("Shubham");
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
new TCS();		
	

	}

}