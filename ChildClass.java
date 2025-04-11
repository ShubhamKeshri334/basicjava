package inheritance;

import java.util.Scanner;

public class ChildClass extends ParentClass{// Multi level inheritance 
	ChildClass(){
		
	}

	public static void main(String[] args) {//only child class can have the main method 
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the numbers");
		int a=s1.nextInt();
		int b=s1.nextInt();
		add(a,b);
		s1.close();
		ChildClass c1=new ChildClass();//by default calling the constructor
		c1.sub(a, b);// just create the object of the child class to access the non static methods and variables of the parent class and supermost class.
		System.out.println(name);
		System.out.println(c1.a);
		
	}

}
