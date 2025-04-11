package string_class;

import java.util.Scanner;
	
public class ReverseTheString {
	static String output="";
	static void reverseString(String name) //Program to reverse a string.
	{
		
		for(int i=name.length()-1;i>=0;i--) {
			output=output+name.charAt(i);
	}
		System.out.println(output);
		
	}
	static void palindome(String name){//program to check if given word is palindome or not.
		if(name.equals(output)) {
			System.out.println("provided word is palindome");
		}
		else {
			System.out.println("given word is not palindome");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("Please enter the string to reverse");
		String name=s1.next();
		reverseString(name);
		palindome(name);
		s1.close();

	}

}
