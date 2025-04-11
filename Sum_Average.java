package array;

import java.util.Arrays;
import java.util.Scanner;

public class Sum_Average {
	static double sum;
	static double average;
	
	static void sumAverage() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the size of the array");
		double [] input=new double[s1.nextInt()];
		for(int i=0;i<=input.length-1;i++) {
			System.out.println("Enter the value at position " +i);
			input[i]=s1.nextInt();
			sum=sum+input[i];
		}
		System.out.println("Input array is "+Arrays.toString(input));
		System.out.println("Sum of the array is "+sum);
		System.out.println("Average of the array is "+(sum/input.length));
		s1.close();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sumAverage();
	}

}
