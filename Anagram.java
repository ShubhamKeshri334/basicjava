package array;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {//Two words which are made of same words is called anagram.
	void checkAnagram() {
		Scanner s1=new Scanner(System.in);
		System.out.println("Enter the first word");
		String word1=s1.next();
		System.out.println("Enter the second word");
		String word2=s1.next();
			if(word1.length()!=word2.length()) {
				System.out.println("The given two words are not anagram");
		}
			else {
				char a []= word1.toCharArray();
				char b []=word2.toCharArray();
				System.out.println("before sorting "+Arrays.toString(a));
				System.out.println("before sorting "+Arrays.toString(b));
				Arrays.sort(a);
				Arrays.sort(b);
				System.out.println("After sorting "+Arrays.toString(a));
				System.out.println("After sorting "+Arrays.toString(b));
				boolean c=Arrays.equals(a, b);
					if(c==true) {
						System.out.println("Given two words are anagram");
					}
					else {
						System.out.println("Given two words are not anagram");
					}
					s1.close();
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Anagram a1=new Anagram();
		a1.checkAnagram();
	}

}
