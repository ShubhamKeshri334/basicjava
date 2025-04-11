package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class LIst_Iterator {//ListIterator is only applicable for List Interface.
	static void listIterator() {//With ListIterator both forward and backward iteration is possible. 
		List<Character>a=new ArrayList<Character>();
		a.add('A');
		a.add('B');
		a.add('C');
		a.add('D');
		a.add('E');
		System.out.println("forward iteration");
		ListIterator<Character> b=a.listIterator();//creating a list Iterator
		while(b.hasNext()) {
			System.out.println(b.next());
		}
		System.out.println("Backward iteration");
		while(b.hasPrevious()) {
			System.out.println(b.previous());
		}
		System.out.println("Replace an element of the list");
		while(b.hasNext()) {
			char element=b.next();
			if(element=='A') {
				b.set('B');
			}
					
		}
		System.out.println();
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		listIterator();
	}

}
