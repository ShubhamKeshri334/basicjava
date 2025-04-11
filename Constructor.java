package constructors;

public class Constructor {
Constructor(char a){//constructor is a special method, which is always non static, does not have a return type and name is same as class name.
	System.out.println(a);
}
Constructor(int a){
	System.out.println(a);
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Constructor obj =new Constructor('S');// Constructor will be called automatically when object of the class in created
new Constructor(20);// syntax to create the instance of the class but in this case we don't have any reference variable
	}

}
