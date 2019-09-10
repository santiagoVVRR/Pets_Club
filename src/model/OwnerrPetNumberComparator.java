package model;

import java.util.Comparator;

public class OwnerrPetNumberComparator implements Comparator<Ownerr>{

	@Override
	public int compare(Ownerr o1, Ownerr o2) {
		
		int comp;
		String pet1 = o1.getPetNumber()+"";
		String pet2 = o2.getPetNumber()+"";
		
		if(pet1.compareTo(pet2)<0) {
			comp = -1;
		}else if(pet1.compareTo(pet2)>0) {
			comp = 1;
		}else {
			comp = 0;
		}
		
		return comp;
	}

	
	
}
