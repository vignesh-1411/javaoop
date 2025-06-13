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
		Scanner sc=new Scanner(System.in);
		System.out.println("enter: ");
		
		String[] s=sc.next().split(",");
		
		
		System.out.println(validEmail(s));
		
		System.out.println(changeEdomain(s));
		
	}

}
