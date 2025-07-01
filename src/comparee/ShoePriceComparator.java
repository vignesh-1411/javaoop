package comparee;

import java.util.Comparator;

public class ShoePriceComparator implements Comparator {

	
//	overriding compare method which is in Comparator , its going to take two objects 
//	and will compare the price. for this to perform we have overloaded sort* method which takes another
//	ShoePriceComaparator object and this compare* method will get called implicitly and not compareTo
	
	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Shoe s1=(Shoe)o1;
		Shoe s2=(Shoe)o2;
		if(s1.getPrice()==s2.getPrice())	return 0;
		if(s1.getPrice()>s2.getPrice())		return 1;
		return -1;
	}

	private ShoePriceComparator() {
		super();
	}
	
//	this is the factory method which creates ShoePriceComparator object whenever the user 
//	clicks for sorting based on ShoePrice...
	public static ShoePriceComparator getshoePriceComparator() {
		// TODO Auto-generated method stub
		ShoePriceComparator s1=new ShoePriceComparator();
		return s1;
		
	}
	
}
