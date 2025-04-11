package predefinedClass;
public class Mathematics {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(Math.addExact(10, 20));//here addExtract is method of Math class 
System.out.println(Math.addExact(11, 12));//Math class is part of java.lang package all the methods of java.lang package is static 
                                          //Can be called by Classname.methodname 
										  //any class from java.lang package needs not be imported
System.out.println(Math.max(70, 100));
System.out.println(Math.min(1.34f, 2.67f));
double a =Math.PI;
System.out.println(a);
double b =Math.divideExact(10, 3);
System.out.println(b);
System.out.println((Math.PI));//PI here is global variable. Math is the class of java.lang package 
System.out.println((Math.multiplyExact(12, 34)));
System.out.println((Math.decrementExact(110)));
System.out.println((Math.incrementExact(110)));
	}

}
/* addExact
 * subtractExact
 * multiplyExact
 * divideExact
 * max
 * min
 * random
 * abs
 * decrementExact
 * incrementExact
 */