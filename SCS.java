package superCallingStatement;

import java.util.Scanner;

class A1{
	A1(){
		System.out.println("A1 class constructor");
	}
}
class A2 extends A1{
	A2(int a){
		//super(); this is operational as parent class constructor is not parameterized so super calling constructor is implicitly added.
		System.out.println(Math.addExact(a, a));
	}
}
public class SCS extends A2 {//Super calling statement is use to call parent class constructor to child class constructor.
							//It is always the first line in every constructor. 
	SCS(int a){
		super(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1= new Scanner(System.in);
System.out.println("enter the number to add");
int a =s1.nextInt();
new SCS(a);
s1.close();

	}

}
