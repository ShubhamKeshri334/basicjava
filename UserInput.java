package predefinedClass;

import java.util.Scanner;

public class UserInput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s1=new Scanner(System.in);//Here Scanner is a class of java.util package and all the methods in Scanner class are non static, so to use
								  //the methods have to create the object of the class with the reference variable
								  //System.in is the parameter to invoke the Scanner Constructor.
int a=s1.nextInt();
System.out.println(a);
String name=s1.next();
System.out.println(name);
s1.close();
	}

}
