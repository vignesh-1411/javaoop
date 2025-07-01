package comparee;

import java.util.Comparator;

public class ShoeSizeComparator implements Comparator {
	
	//i've added details of this method in ShoePriceComparator
	//see that class once..

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		
		Shoe s1=(Shoe)o1;
		Shoe s2=(Shoe)o2;
		if(s1.getSize()==s2.getSize())	return 0;
		if(s1.getSize()>s2.getSize())	return 1;
		return -1;
	}

	private ShoeSizeComparator() {
		super();
	}
	
//	this is the factory method where ShoeSizeComparator object is created whenever user wants to sort based on size
	
	public static ShoeSizeComparator getShoeSizeComparator() {
		ShoeSizeComparator s1=new ShoeSizeComparator();
		return s1;
	}

}
