//package collection;

import java.util.Enumeration;
import java.util.Stack;

public class CursorsEnumeration {//A java cursor is an iterator which is used to iterate a collection element one by one.
	
	static void enumeration() {//enumeration cursor can only be used in legacy class.
		Stack a=new Stack();
		a.addElement("Shubham");
		a.addElement("Keshri");
		a.addElement("CGI");
		System.out.println(a);
		Enumeration b=a.elements();//only forward iteration is possible with enumeration.
		while(b.hasMoreElements()) {
			System.out.println(b.nextElement());
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		enumeration();
	}

}
