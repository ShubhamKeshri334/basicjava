package string_class;

import java.util.Arrays;

public class StringMethods {
	static void contains() {//Contains will check if sequences of the string is available in the string or not the return type is boolean
		String name="Shubham";
		System.out.println(name.contains("h"));
		System.out.println(name.contains("ma"));
	}
	static void matches() {//Matches will check if the complete string is matching with the input the return type is boolean
		String name="Shubham";
		System.out.println(name.matches("hu"));//this will return false
		System.out.println(name.matches("Shubham"));//this will return true as the whole string is matching with the provided.
		
		//check if the string has exact 7 characters
		boolean b=name.matches(".......");//this is a regex method 
		System.out.println(b);
		
		//check if the string ends with m
		boolean c=name.matches("(.*)m");
		System.out.println(c);
		
		//check if the string start with S
		boolean d=name.matches("S(.*)");
		System.out.println(d);
		
		
	}
	void substring() {//Returns the substring of the string
		String name="Shubham";
		System.out.println(name.substring(3));//This will return the output from the provided index position
		System.out.println(name.substring(3, 6));//This will return the output from start index position to end index position
	}
	void replace() {//Replaces the char, Substring, or complete uppercase lowercase or numeric values from the string
		String name="Shubham";
		String name2=name.replace("hu", "");
		String name3=name.replaceAll("[a-z]", "s");
		System.out.println(name2);
		System.out.println(name3);
	}
	void charAt() {//This will return the character at the given index position
		String name="Shubham";
		for(int i=0;i<=name.length()-1;i++) {
			System.out.print(name.charAt(i));
		}
	}
	void toCharArray() {//This will convert the string to Arrays format.
		String name="Shubham";
		char[]name1=name.toCharArray();
		System.out.println(Arrays.toString(name1));//Arrays.toString() method will print the arrays in string format
	}
	static void concat() {//concat is used to add two strings 
		String name="Shubham";
		String surname=name.concat(" Keshri");
		System.out.println(surname);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//contains();
		//matches();
		//StringMethods a=new StringMethods();
		//a.substring();
		//a.replace();
		//a.charAt();
		//a.toCharArray();
		concat();
	}

}
