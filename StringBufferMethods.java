package stringBuffer;

public class StringBufferMethods {
	static void legth_Capacity() {//length will return the length of the string and capacity will return the capacity of the string buffer it is by default 16.
		StringBuffer a=new StringBuffer();
		System.out.println(a.length());
		System.out.println(a.capacity());//by default the capacity is 16
		
		StringBuffer b=new StringBuffer("Shubham");
		System.out.println(b.length());//it will return the length of the string
		System.out.println(b.capacity());//length of the string will be added up to the default capacity. so in this case the capacity will become 10+16=26
		
		StringBuffer c=new StringBuffer(1);
		System.out.println(c.length());
		System.out.println(c.capacity());//capacity will become 1 as we are defining the capacity of the string buffer by passing the capacity to the constructor.
		System.out.println(c.append("shubham"));//here the capacity will be changed to 7 as the length of the string is more than the capacity defined to the string buffer.
		System.out.println(c.capacity());
	}
	static void aPpend() {//append method is same as concat method it is used to add up the strings.
		StringBuffer a=new StringBuffer("Shubham");
		a.append('K');//this will update the variable a 
		System.out.println(a);
		a.append(false);//this will further update the string a which is already been updated. 
		System.out.println(a);
		
	}
	static void replace() {//replace method is used to replace the string from specified startIndex and endIndex. replace(startInd,endIndex,String to replace)
		StringBuffer a=new StringBuffer("Keshri");
		a.replace(0, 2, "s");
		System.out.println(a);
		
	}
	static void delete() {//delete method is used to delete from startIndex and endIndex from a string. delete(startIndex,endIndex)
		StringBuffer a=new StringBuffer("Keshri");
		a.delete(1, 5);//delete method is not available in string method as strings can't be modified.
		System.out.println(a);
	}
	static void reverse() {//reverse method is used to reverse the stringbuffer.
		StringBuffer a=new StringBuffer("keshri");
		a.reverse();
		String b=a.substring(2);//substring will return the part of the string.Its return type is String.
		System.out.println(b);
		System.out.println(a);
	}
	static void insert() {
		StringBuffer a=new StringBuffer("Shubham");
		a.insert(7, "UH");
		System.out.println(a);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//legth_Capacity();
		aPpend();
		//replace();
		//delete();
		//reverse();
		//insert();
	}

}
