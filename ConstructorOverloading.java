package constructors;

public class ConstructorOverloading {//Developing multiple constructor with different variations of argument is called constructor overloading
	ConstructorOverloading(){
		System.out.println("1st constructor");
	}
	ConstructorOverloading(int a){//when you declare the variable inside the method is called argument 
		System.out.println("2nd constructor:-" +a);
	}
	ConstructorOverloading(int a,int b){
		System.out.println("3rd constructor:-" +(a+b));
	}
	ConstructorOverloading(String name){
		System.out.println("4th constructor:-"+ name);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ConstructorOverloading();
		new ConstructorOverloading("Shubham");//when you pass the value to the argument it is called parameter
		ConstructorOverloading c1 =new ConstructorOverloading(10,20);
		new ConstructorOverloading(10);

	}

}
