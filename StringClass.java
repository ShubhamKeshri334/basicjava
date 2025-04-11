package string_class;

import java.util.Scanner;

public class StringClass {//String class is part of java.lang package which has multiple predefined methods to it.
	
	static void reverseTheString(String name) {
		//String name="Shubham";
		for(int a=(name.length()-1);a>=0;a--) {
			System.out.print(name.charAt(a));
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shubham";
		String name1="SHUBHAM";
		String name3=" KesHRi ";
		System.out.println(name.toUpperCase());//toUpperCase will turns string values to the upper case.
		System.out.println(name1.toLowerCase());//toLowercase will turns the string value to lower case.
		System.out.println(name3.trim());//trim method will remove the spaces from the start and end of the string. not from the middle of the string.
		System.out.println(name.equals(name1));//equals will check if two strings are matching, it is case sensitive. RETURN type is boolean
		System.out.println(name.equalsIgnoreCase(name1));//equalIgnoreCase will check if two strings are matching and it is not case sensitive. RETURN type is boolean
		System.out.println(name.charAt(0));//charAt returns the value at the position at the index value.
		System.out.println(name.length());
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the string to reverse");
		String a=s1.next();
		reverseTheString(a);
		s1.close();
	}

}
