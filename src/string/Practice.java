package string;
import java.util.*;

public class Practice {
	
	public static String reversee(String s) {
		
		String s1="";
		for(int i=s.length()-1;i>=0;i--) {
			s1+=s.charAt(i);
		}
		return s1;
	}
	
	public static String vowelsconst(String s) {
		s=s.toLowerCase();
		String s1="aeiou";
		int v1=0,c1=0;
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				if(s1.indexOf(s.charAt(i)) == -1)	c1++;
				else	v1++;
			}
		}
		return "no.of vowels:"+v1+"\nno.of consonants:"+c1;
		
	}
	
	public static boolean goodmsg(String s) {
		return !(s.contains("bad") || s.contains("ugly") || s.contains("hate"));
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
//		System.out.println("enter string to reverse: ");
		
//		System.out.println("enter string to find the no.of vowels and consonants: ");
		String s1=scan.nextLine();
//		System.out.println(reversee(s1));
		
		
//		System.out.println(vowelsconst(s1));
		
		System.out.println(goodmsg(s1));
		


	}

}
