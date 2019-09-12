package model;

import java.util.Comparator;

public class OwnerNameComparator implements Comparator<Ownerr>{

	@Override
	public int compare(Ownerr o1, Ownerr o2) {
		int compare;
		String n1 = o1.getName();
		String n2 = o2.getName();
		
		if(n1.compareTo(n2)>0) {
			compare = 1;
		}else if(n1.compareTo(n2)<0) {
			compare = -1;
		}else {
			compare = 0;
		}
		return compare;
	}

}
