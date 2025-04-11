package methods;

public class StaticMethods {

	static void name(String x)//Declaration of the static method
	{
		System.out.println(x);
		
	}
	void divide()//Declaration of non static methods
	{
		System.out.println("Divide");
	}
	/*int multiplication(int x)
	{
		//int y=x*x;
		return x;
		
	}
	*/
	public static void main(String[] args) {
		System.out.println("Main method");
		//System.out.println(add(10,20));
		name("shubham");//When parameter is passed inside an method it is called arguments 
		subtract();// Static methods can be called directly just with the method name without creating the object of the class
		StaticMethods myobj =new StaticMethods();//Non static methods will be called after creating the object of the class
		myobj.divide();
		//myobj.multiplication(10);
	}
	static void subtract()//Declaration of static method 
	{
		//add();// we can call the static method to the another method as well 
		//myobj.divide();
		System.out.println("substraction");
		System.out.println("substraction");
		System.out.println("substraction");
	
	}
}
