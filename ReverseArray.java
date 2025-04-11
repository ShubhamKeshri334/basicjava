package array;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
	static void reverse() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		double [] input=new double[s1.nextInt()];//declaration of input array 
		for(int i=0;i<=input.length-1;i++) {//logic to initilize the array 
			System.out.println("Enter the value at position "+i);
			input[i]=s1.nextDouble();
		}
		System.out.println("Input array is " +Arrays.toString(input));
		
		double output []=new double[input.length];//Declaration of output array 
		for(int i=0;i<=output.length-1;i++) {//logic to copy the array to the output array.
			output[i]=input[i];
		}
		System.out.println("output array is "+Arrays.toString(output));
		s1.close();
		
		double reverse[]=new double[input.length];
		for(int i=0,j=input.length-1;i<=input.length-1;i++,j--) {//logic to reverse the array
			reverse[j]=input[i];
		}
		System.out.println("Reversed array is "+Arrays.toString(reverse));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		reverse();
	}

}
