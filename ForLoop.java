package loop;

import java.util.Scanner;

public class ForLoop {
	static int c =9;
void loop(int a) 
	{
	for(int b=a;b<=5;b++) {/*Decalaration and initialization;condition;incremental/decremental*/
		if(b==4) {
			continue;//continue keyword is used to skip any particular iteration 
		}
		System.out.println("shubham");
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
ForLoop l1=new ForLoop();
Scanner s1=new Scanner(System.in);
System.out.println("Enter the number");
int a=s1.nextInt();
l1.loop(a);
s1.close();
	}

}
