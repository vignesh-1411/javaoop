package string;
import java.util.*;

public class Vairam {
	
	public static int validEmail(String[] s) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].contains("@")) {
				String[] s1=s[i].split("@");
				if(s1.length==2) {
					int j=0;
					for(;j<s1[0].length();j++) {
						if((s1[0].charAt(j)>='a' && s1[0].charAt(j)<='z') || (s1[0].charAt(j)>='0' && s1[0].charAt(j)<='9')) {
							continue;
							
						}
						else	break;
						
					}
					if(j==s1[0].length() && (s1[1].endsWith("gmail.com")||s1[1].endsWith("yahoo.com"))) {
						count++;
					}
				}
				
				
			}
		}
		return count;
	}
	
	public static boolean mapString(String pattern,String s) {
		String[] s1=s.split(" ");
		
		for(int i=0;i<s1.length;i++) {
			char ch=pattern.charAt(i);
			String temp=s1[i];
			for(int j=i+1;j<pattern.length();j++) {
				if(ch==pattern.charAt(j)) {
					if(temp.equals(s1[j])) {
						continue;
					}
					else
						return false;
				}
			}
		}
		
		return true;
	}
	
	public static String reverseVowels(String s) {
		char[] ch=s.toCharArray();
//		StringBuilder ss=new StringBuilder("aeiouAEIOU");
		Set<Character> set=Set.of('a', 'e', 'i', 'o', 'u', 
                'A', 'E', 'I', 'O', 'U');
//		String ss="aeiouAEIOU";
		int st=0,en=ch.length-1;
		while(st<en) {
			if(set.contains(ch[st]) && set.contains(ch[en])) {
				char temp=ch[st];
				ch[st]=ch[en];
				ch[en]=temp;
				st++;
				en--;
			}else if(!(set.contains(ch[st]))) {
				st++;
			}
			else if(!(set.contains(ch[en]))) {
				en--;
			}
		}
		return new String(ch);
	}
	
//	public static boolean isomorphicString(String s) {
//		char[] ch=s.toCharArray();
//		for(int i=0;i<ch.length;i++) {
//			for(int j=i+1;j<s.length();j++) {
//				if()
//			}
//		}
//	}
	
	public static int changeEdomain(String[] s) {
		int count=0;
		for(int i=0;i<s.length;i++) {
			if(s[i].contains("@")) {
				String[] s1=s[i].split("@");
				if(s1[1].endsWith("gmail.com")) {
					s1[1]=s1[1].replaceAll("gmail.com","yahoo.com");
					count++;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Scanner sc=new Scanner(System.in);
//		System.out.println("enter: ");
		
//		String[] s=sc.next().split(",");
//		
//		
//		System.out.println(validEmail(s));
//		
//		System.out.println(changeEdomain(s));
		
//		String s="abbaa";
//		String s1="dog cat cat dog dog";
//		
//		System.out.println(mapString(s, s1));
		
		String s1="HellONavAnth";
		System.out.println(reverseVowels(s1));
		
	}

}
