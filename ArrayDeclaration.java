package array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayDeclaration {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] a=new int[2];//Array declaration: - in this example its an int datatype array with size 2 and variable 'a'.
							//it can only store 2 values in it.
		String s[]=new String[2];//Array declaration- 
		//array index begins with 0
		a[0]=34;//array initialization.
		a[1]=33;
		//a[2]=45;
		//System.out.println(a[1]); 
		String name="shubham";
		char [] c1=name.toCharArray();//the return type of toCharArray is char[] aka char array.
		System.out.println(c1);
		
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the size of the array");
		int size=s1.nextInt();
		int [] c2=new int[size];{
			for(int i=0;i<=size-1;i++) {
				System.out.println("enter the value at position" +i);
				c2[i]=s1.nextInt();
				
			}
			s1.close();
			System.out.println(Arrays.toString(c2));
			//System.out.println();
		}
	}

}
