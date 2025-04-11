package variables;

public class Variables {
	static int a=10;//global static variable 
	static int b=10;
	int c;
	final static String name ="shubham";//Final variable value can't be changed.
	final boolean value=true;
	static void add() {
		Variables v1=new Variables();
		System.out.println(Math.multiplyExact(v1.c, a));
		System.out.println(b);
		System.out.println(v1.c);//non static variables can be called to the static methods using reference variables.
	}
	void sub() {
		b=20;
		System.out.println(b);
		//name="Keshri";//Since it's a final variable the value can't be changed
		System.out.println(c);//non static variables can be called to non static methods directly without the reference variables.
		System.out.println(b);//static variables can be called directly.
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//b=23;
		add();
		Variables v1=new Variables();
		b=23;
		v1.c=31;//non static variables can be updated with the reference variables
		System.out.println(v1.c);
		 //v1.sub();
		 System.out.println(b);
		 System.out.println(v1.value);
		 //v1.value=false;//Since it's a final variable the value can't be changed.
		 //we use final keyword for the variables for which we don't want to change the value throughout the programm.
	}

}
