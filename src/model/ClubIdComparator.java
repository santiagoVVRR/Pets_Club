package model;

import java.util.Comparator;

public class ClubIdComparator implements Comparator<Club>{

	@Override
	public int compare(Club o1, Club o2) {
		int compare;
		String id1 = o1.getId();
		String id2 = o2.getId();
		
		if(id1.compareTo(id2)>0) {
			compare = 1;
		}else if(id1.compareTo(id2)<0) {
			compare = -1;
		}else {
			compare = 0;
		}
		return compare;
	}

}
