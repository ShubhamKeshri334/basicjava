package collection;

import java.util.Vector;

public class VectorLegacyClass {
	/*some Classes like Vector,Stack,HashTable etc. was introduced in java 1.0 but when collection framework was introduced in JDK1.2
	 * these classes were modified so that they can be adjusted to the collection hierarchy, so these older classes are known as legacy class.
	 */
	void vector() {
		Vector v=new Vector();
		v.addElement("Shubham");
		v.addElement("Keshri");
		System.out.println(v);
		System.out.println(v.firstElement());//Returns the first element.
		System.out.println(v.lastElement());//returns the last element.
		//v.removeElement("Keshri");//Removes the provided element from the list
		System.out.println(v);
		System.out.println(v.capacity());//The capacity of the vector is the no. of elements it can hold before resizing 
		//By default the vector starts with a capacity of 10
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		VectorLegacyClass v=new VectorLegacyClass();
		v.vector();
	}

}
