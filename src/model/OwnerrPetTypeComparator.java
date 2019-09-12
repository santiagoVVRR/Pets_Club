package model;

import java.util.Comparator;

public class OwnerrPetTypeComparator implements Comparator<Ownerr>{

	@Override
	public int compare(Ownerr o1, Ownerr o2) {
		int compare;
		String p1 = o1.getPetType();
		String p2 = o2.getPetType();
		
		if(p1.compareTo(p2)>0) {
			compare = 1;
		}else if(p1.compareTo(p2)<0) {
			compare = -1;
		}else {
			compare = 0;
		}
		return compare;
	}

}
