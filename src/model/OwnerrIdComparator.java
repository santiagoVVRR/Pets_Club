package model;

import java.util.Comparator;

public class OwnerrIdComparator implements Comparator<Ownerr>{

	@Override
	public int compare(Ownerr o1, Ownerr o2) {
		int compare;
		String i1 = o1.getId();
		String i2 = o2.getId();
		
		if(i1.compareTo(i2)>0) {
			compare = 1;
		}else if(i1.compareTo(i2)<0) {
			compare = -1;
		}else {
			compare = 0;
		}
		return compare;
	}

}
