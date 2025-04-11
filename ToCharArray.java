package array;

public class ToCharArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shubham";
		char [] a=name.toCharArray();//toCharArray will store the string value in array format.
		for(int i=0;i<=name.length()-1;i++) {
		System.out.print(a[i]);
		}
	}

}
