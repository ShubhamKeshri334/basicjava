package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListMethods {//List is a interface which inherit from collection interface.

	static void list() {
		List a=new ArrayList();// This will accept Heterogeneous value.
		a.add(24);
		a.add('a');
		a.add("Shubham");
		System.out.println(a);
		List<Double>b=new LinkedList<Double>();//This will accept only homogeneous values as we have declared the list for only double data type.
		b.add(24.43);
		b.add(45.45);
		//b.addAll(a);
		System.out.println(b);
		b.add(1, 243.4545);
		System.out.println(b);
		b.addFirst(5345.45);//AddFirst will add the the value to the beginning of the list.
		System.out.println(b);
		b.addLast(66.5);//AddLast will add the object to the ending of the list.
		System.out.println(b);
		System.out.println("Get "+b.get(1));//returns the object at the provided index.
		b.set(1, 56.67);//set will replace the element at the given index position.
		System.out.println(b);
		b.add(1, 99.0);//Add will add the element at the given index position.
		System.out.println(b);
		System.out.println(b.indexOf(66.5));//Returns the index position of the element.
		System.out.println(b.lastIndexOf(676.89));
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		list();
	}

}
