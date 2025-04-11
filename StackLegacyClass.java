package collection;
import java.util.*;

public class StackLegacyClass {
	//Stack is the subclass of vector Class It implements firstIn lastOut structure. i.e Stack 
	
	static void stack() {
		Stack<Float> a=new Stack<Float>();
		a.push(13f);//push is the method of stack class it is similar to add method of list interface
		a.push(24f);
		a.push(245f);
		System.out.println(a);
		a.pop();//pop removes the last element of the stack
		System.out.println(a);
		System.out.println(a.peek());//It returns the object at the top of the stack without removing it.
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		stack();
	}

}
