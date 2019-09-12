package model;

import java.util.Comparator;

public class ClubPetTypeComparator implements Comparator<Club>{

	@Override
	public int compare(Club o1, Club o2) {
		int compare;
		String p1 = o1.getPetTypes();
		String p2 = o2.getPetTypes();
		
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
