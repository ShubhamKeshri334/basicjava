package collection;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;

public class CollectionMethods {//Collection is an framework which can be used to add,remove,update or delete the data.
								//Collection is an interface which has a lot of classes and interfaces in it.
								//Collection framework started in java version 1.2
								//All the classes and interfaces present in the collection are from java.util package.
								//Collection framework allows to 
									//Add homogeneous as well as heterogeneous values to it 
									//Collection has dynamic size[unlike Arrays which has fixed size]
								//Collection framework is divided into two packages 
									//java.util.Collection
									//java.util.Maps
								//Collection stores values in form of objects. 
	//Upcasting //Converting child class object into super class type is called upcasting.
	//With upcasting we can only access parent class properties.
	//Upcasting is done both implicitly as well as explicitly.
	
	static void addHetrogenous() {//Add method will add the value to the collection.
		Collection a=new ArrayList();//As collection is an interface to utlize it properties we have to do upcasting 
									//It will accept heterogeneous values.
		a.add("Shubham");
		a.add(10);
		a.add('K');
		a.add(true);
		System.out.println(a);
	}
	static void addHomgenous() {
		Collection<String> b=new LinkedList<String>();//This will only accept homogeneous value as DataType is defined while Upcasting.
		b.add("Shubham");
		b.add("Keshri");
		b.add("Bangalore");
		System.out.println(b);
	}
	static void addAll() {
		Collection<Integer>c=new LinkedList<Integer>();
		c.add(10);
		c.add(24);
		c.add(56);
		Collection<Integer>d=new ArrayList<Integer>();
		d.add(34);
		d.add(43);
		d.add(343);
		d.addAll(c);//addAll method will add the entire collection to the existing collection.                                                                                                                                                                                                                                                                                                                    
		System.out.println(d);
		d.remove(34);//remove method will remove a particular object from the collection.
		System.out.println(d);
		d.removeAll(c);//removeAll method will remove the complete collection from a collection.
		System.out.println(d);
		//d.clear();//this will clear the whole collection.
		//System.out.println(d);
		System.out.println(d.contains(43));//contains method will check if the provided object is available in the collection or not, the return type of the contains method is boolean
		System.out.println(d.containsAll(c));//containsAll method will check if an entire collection is added to the collection or not, the return type is boolean.
		System.out.println(d.equals(c));//This method will check if collection is equal to another collection or not 
		System.out.println(d.isEmpty());//This method will check if the collection is empty or not.
		System.out.println(d.size());
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//addHetrogenous();
		//addHomgenous();
		addAll();
		
		
	}

}
