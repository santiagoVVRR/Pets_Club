package model;

import java.util.Comparator;

public class PetNameComparator implements Comparator<Pet>{

	@Override
	public int compare(Pet o1, Pet o2) {
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
