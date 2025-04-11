package collection;

import java.util.ArrayList;
import java.util.Collection;

public class collection_concept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Collection<Integer> c=new ArrayList<Integer>();//upcasting:-Converting the child class object into super class type is called upcasting.
		c.add(20);
		c.add(40);
		c.add(1000);
		System.out.println(c);
		Collection<Integer> d=new ArrayList<Integer>();
		d.add(1299);
		d.add(134);
		d.addAll(c);
		System.out.println(d);
		//d.clear();
		//System.out.println(d);
		//removeAll(c);
		System.out.println(d);
		boolean a=d.contains(134);
		System.out.println(a);
		System.out.println(d.equals(c));
		System.out.println(d.isEmpty());
		//d.
	}

}
