package array;

import java.util.Arrays;

public class CountCharacters {
	static int character;
	static int numeric;
	static int spaces;
	
	static void count() {//fixed String input.
		String name= "S hubh am3";
		char[]input= name.toCharArray();//stored the string input to array. Its an string method.
		System.out.println("The input String is "+Arrays.toString(input));//Its an Arrays method.
		for(int i=0;i<=input.length-1;i++) {//logic to check if the character at the positions are alphabets, numeric or spaces.
			boolean chara= Character.isAlphabetic(input[i]);//isAlphabetic is the method of the character class to check if the provided character is alphabetic in nature or not.
			if(chara==true) {
				character++;
			}
			boolean space=Character.isWhitespace(input[i]);//isWhitespace is the method of the character class to check if the provided character is space or not.
			if(space==true) {
				spaces++;
			}
			boolean num=Character.isDigit(input[i]);//isDigit is the method of the character class to check if the character is a numeric in nature or not.
			if(num==true) {
				numeric++;
			}
		}
		System.out.println("Character present in the string "+character);
		System.out.println("Spaces present in the string "+spaces);
		System.out.println("numbers present in the string " + numeric);
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		count();
	}

}
