package arithmetic_comparison_operatos;

public class LogicalOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int a=10;
        int b=20;
        if(a==b && b<a) {
        	System.out.println("print 1");
        }
        if (a==b &&(b>a && b==20))//we have multiple logical 
        {
        	System.out.println("print2");
        }
	}

}
