package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Set;

public class Iteration {//Iteration refers to the process of repeatedly executing a block of code until a certain conditions is met.
	static void iteration() {
		Collection a= new HashSet();
		a.add(123);
		a.add('d');
		a.add("Shubham");
		a.add(true);
		a.add(99.89);
		Iterator b=a.iterator();//with iterator you can only do forward iteration.
								//Iterator is applicable for the entire collection.
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		Collection<String>c=new LinkedList<String>();
		c.add("Mouse");
		c.add("Keyboard");
		c.add("CPU");
		c.add("Laptop");
		Iterator d=c.iterator();
		while(d.hasNext()) {
			System.out.println(d.next());
		}
	}
	static void setIteration() {
		Set a=new LinkedHashSet();//Set can only store unique values
		a.add(10);
		a.add('S');
		a.add("Shubham");
		a.add(false);
		Iterator b=a.iterator();//the return type of iterator is Iterator
		while(b.hasNext()) {//hasNext will check if the next element is present.
			System.out.println(b.next());//next will print the next element.
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//iteration();
		setIteration();
	}

}