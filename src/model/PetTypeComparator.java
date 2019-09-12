package model;

import java.util.Comparator;

public class PetTypeComparator implements Comparator<Pet>{

	@Override
	public int compare(Pet o1, Pet o2) {
		int compare;
		String t1 = o1.getType();
		String t2 = o2.getType();
		
		if(t1.compareTo(t2)>0) {
			compare = 1;
		}else if(t1.compareTo(t2)<0) {
			compare = -1;
		}else {
			compare = 0;
		}
		return compare;
	}

}
