package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayEqual {
	static void equal() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		String [] input=new String[s1.nextInt()];
		for(int i=0;i<=input.length-1;i++) {
			System.out.println("Enter the value at position " +i);
			input[i]=s1.next();
		}
		System.out.println("Input array is "+Arrays.toString(input));
		
		String [] input1=new String[input.length];
		for(int i=0;i<=input1.length-1;i++) {
			System.out.println("Enter the value at position " +i+ "for second array");
			input1[i]=s1.next();
		}
		System.out.println("Second array is "+Arrays.toString(input1));
				if (Arrays.equals(input, input1)) {//Methods to check if given two arrays are equal
					System.out.println("Given two arrays are equal");
				}
				else {
					System.out.println("Given two arrays are not equal");
				}
				s1.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		equal();
	}

}
