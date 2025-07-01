package comparee;

import java.util.Comparator;

public class ShoeTypeComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		// TODO Auto-generated method stub
		Shoe s1=(Shoe)o1;
		Shoe s2=(Shoe)o2;
		return s1.getType().compareTo(s2.getType());
	}

	private ShoeTypeComparator() {
		super();
	}
	
	public static ShoeTypeComparator getShoeTypeComparator() {
		ShoeTypeComparator s1=new ShoeTypeComparator();
		return s1;
	}

}
