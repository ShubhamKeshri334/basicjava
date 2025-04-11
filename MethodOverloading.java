package methods;

public class MethodOverloading {//Developing multiple methods with the same name but with different variations of argument is called method overloading
static void add() {
	System.out.println("1st method");
}
static void add(int a) {
	System.out.println("2nd method:-" +a);
}
void add(int a,int b) {
	System.out.println("3rd method non static:");
}
public static void main(String[] args) {
		// TODO Auto-generated method stub
add();
add(10);
MethodOverloading m1 =new MethodOverloading();
m1.add(10,20);

	}

}
