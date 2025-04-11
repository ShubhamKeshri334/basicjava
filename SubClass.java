package inheritance;
class SuperMostClass{
	SuperMostClass(int a,int b){
		System.out.println("constructor from the super most class");
	}
	
}
	/*final*/ class SuperClass1 extends SuperMostClass{//with the final keyword class won't be inherited 
		SuperClass1(String name){
			super(10,20);// this is super calling statement it is use to call constructor from parent class 
			System.out.println("constructor from super class");
		}
		
		
}
public class SubClass extends SuperClass1 {
SubClass(){
	super("shubham");
	//even though we have not used super calling statement it is implicitly adding it.
	//but for the parameterized constructor we have to explicitly add the super calling statement.
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SubClass();
	}

}
//this type of inheritance is called as multi level inheritance where subclass is inheritaning super class and super class is inheriting supermost class.