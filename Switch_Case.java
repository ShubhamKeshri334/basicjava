package switch_;

import java.util.Scanner;

public class Switch_Case {
	static void switch_case(int a) {
		
	switch(a)
	{
		case 1:System.out.println("Print 1");
		break;//break keyword will stop the execution 
				//if break is not provided all the cases will be executed 
		case 2:System.out.println("print 2");
		break;
		case 3:System.out.println("Print 3");
		break;
		default:System.out.println("wrong selection");//break and default keywords are optional 
	}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s1=new Scanner(System.in);
		System.out.println("enter the value");
		int a =s1.nextInt();
		switch_case(a);
		s1.close();
	}

}
