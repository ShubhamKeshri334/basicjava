package stringBuffer;

public class String_Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name="Shubham99";
		name.concat("Keshri");//Strings are immutable by nature it means it value cannot be changed after it is created.
		System.out.println(name);

		StringBuffer name1=new StringBuffer("Shubham ");//String Buffer are mutable by nature meaning it value can be changed after it is been created.
		name1.append("Keshri");//This action modified the string name1.
		System.out.println(name1);
		System.out.println(name1.length());
		StringBuffer name2=new StringBuffer();
		//name2="asfdsgdfgdfsgdfsgdfsgdfsgdfsgdfsgdfsgdfsgdfsgdfsgdfsgdfsgsdfgsdf";
		System.out.println(name2.capacity());
		for(int i=0;i<=name.length()-1;i++) {
			System.out.println(name.charAt(i));
		}
		System.out.println(name.substring(1));
		System.out.println(name.substring(1, 4));
		System.out.println(name.matches("Shubham"));
		System.out.println(name.replace('a', 'f'));
		System.out.println(name.replace("hu", "uh"));
		System.out.println(name.replaceAll("[0-9]", ""));
		System.out.println(name.contains(" "));
		System.out.println(name.indexOf('s'));
		String str="abc";
		String str1="abc";
		str=str+"def";
		//str.concat("def");
		System.out.println(str==str1);
		
		
		
	}

}
