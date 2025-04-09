package arithmetic_comparison_operatos;

public class Comparison {

	static void add(int a,int b )// static method declaration with parameter
	{
		if(a>18 && b>=10)//if comparison operator 
		{	
		System.out.println("elegible");
		}
		else//else comparison operator 
		{ 
        System.out.println("not elegible");			
		}
		
	}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        add(20,15);//calling the static method with argument
	}

}
