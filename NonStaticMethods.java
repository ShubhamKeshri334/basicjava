package methods;

public class NonStaticMethods {

	int add(int x) {
		int y=x+10;
		return y+5;
		//System.out.println(x + "The sum of the numbers is");
	}
	
	public static void main(String[] args) {
		NonStaticMethods myobj=new NonStaticMethods();
		System.out.println(myobj.add(10));
		System.out.println("nothing");
	}
}
