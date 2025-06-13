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
	public static String reverseWords(String s) {
		s=s.trim();
		String res="";
		for(String s2:s.split("\\s+")) {
			res=" "+s2+res;
		}
		return res.trim();
	}
	
	public static String longestWord(String s) {
		String[] s1=s.split("\\s+");
		int max=0;
		String m="";
		for(int i=0;i<s1.length;i++) {
			int len=s1[i].length();
			if(max<len) {
				max=len;
				m=s1[i];
			}
		}
		return m;
	}
	
	
	
	public static void startingletters(String[] s,char a) {
		int c=0;
		for(int i=0;i<s.length;i++) {
			if(a==s[i].toLowerCase().charAt(0)) {
				System.out.println(s[i]);
				c++;
			}
		}
		if(c==0)	System.out.println("match not found");
	}
	public static String rotateStringby1(String s) {
		char[] ch=s.toCharArray();
		char temp=ch[0];
		for(int i=0;i<ch.length-1;i++) {
			ch[i]=ch[i+1];
		}
		ch[ch.length-1]=temp;
		
		String s1=String.valueOf(ch);
	
		return s1;
		
	}
	public static boolean isRotated(String s1,String s2) {
		for(int i=0;i<s1.length();i++) {
			s1=rotateStringby1(s1);
			if(s1.equals(s2)) {
				return true;
			}
		}
		return false;
	}
	
	public static boolean isRotate(String s1,String s2) {
		char ch=s1.charAt(0);
		int ind=s2.indexOf(ch);
		String s="";
		for(int i=ind;i<s2.length();i++) {
			s+=s2.charAt(i);
		}
		for(int i=0;i<ind;i++) {
			s+=s2.charAt(i);
		}
		if(s1.equals(s))	return true;
		return false;
//		
//		String temp=s2+s2;
//		if(temp.contains(s1))	return true;
//		return false;
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
		s=s.toLowerCase();
		return !(s.contains("bad") || s.contains("ugly") || s.contains("hate"));
	}
	
	public static boolean palindrome(String s) {
		s=s.toLowerCase();
		String s1="",s2="";
		
//		now im trying to check only with alphabets, and removing the alphanumeric characters....
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				s1+=s.charAt(i);
			}
		}
		
//		palindrome checker..
		
		s2=reversee(s1);
		if(s2.equals(s1))	return true;
		return false;
	}
	
	public static boolean isValidNo(String s) {
		
		
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)>='0' && s.charAt(i)<='9')	continue;
			else return false;
		}
		return true;
	}
	
	public static void balancedSym(String s) {
		int cas=0,chash=0;
		for(int i=0;i<s.length();i++) {
			char ch=s.charAt(i);
			if(ch=='*')		cas++;
			else if(ch=='#')	chash++;
		}
		if(cas==chash)	System.out.println("balanced");
		else if(cas>chash)	System.out.println(cas-chash+" # should be added");
		else	System.out.println(chash-cas+" * should be added");
	}
	
	public static String longCommonPrefix(String[] s) {
		int i=0;
		String s1=s[0];
		String s2=s[s.length-1];
		while(i<s1.length() && i<s2.length() && s1.charAt(i)==s2.charAt(i)) {
			i++;
		}
		return s1.substring(0, i);
		
	}
	
	public static void printStrings(String[] s)
	{
		Arrays.sort(s);
		int maxlen=0;
		for(int i=0;i<s.length;i++) {
			maxlen=Math.max(maxlen, s[i].length());
		}
		int len=1;
		while(len<=maxlen) {
			for(String i:s) {
				if(i.length()==len) {
					System.out.println(i+" ");
					
				}
			}

			len++;
		}

	}
	
	public static void removeDuplicates(String[] s) {
		Set<String> set=new LinkedHashSet<>(Arrays.asList(s));
		
		String [] res=set.toArray(new String[0]);
		
		for(String ss:res) {
			System.out.println(ss);
		}
		
	}

	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter the message: ");
//		System.out.println("enter string to reverse: ");
		
//		System.out.println("enter string to find the no.of vowels and consonants: ");
//		String d=scan.next();
//		scan.nextLine();
//		System.out.println("next");
		//String[] s1=scan.nextLine().toLowerCase().split("\\s+");
		int size=scan.nextInt();
		scan.nextLine();
		String[] s1=new String[size];
		for(int i=0;i<s1.length;i++) {
			s1[i]=scan.nextLine();
		}
		
		
//		String s2=scan.nextLine().toLowerCase();
		
//		System.out.println(reversee(s1));
		
		
//		System.out.println(vowelsconst(s1));
		
//		System.out.println(goodmsg(s1));
		
//		System.out.println(palindrome(s1));
		
//		System.out.println(isValidNo(s1));
		
//		String[] s=scan.nextLine().split("\\s+");
//		char a=scan.next().toLowerCase().charAt(0);
//		startingletters(s,a);
		
//		System.out.println(isRotated(s1,s2));
		
//		alternate for the above is..
//		System.out.println(isRotate(s1,s2));
		
//		balancedSym(s1);
		
//		System.out.println(longestWord(s1));
		
//		System.out.println(longCommonPrefix(s1));
		
//		printStrings(s1);
		
//		removeDuplicates(s1);
		

	}

}
