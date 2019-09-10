package model;

import java.util.Comparator;

public class ClubOwnerrNumberComparator implements Comparator<Club>{

	@Override
	public int compare(Club c1, Club c2) {
		
		int comp;
		String on1 = c1.getOwnerNumber()+"";
		String on2 = c2.getOwnerNumber()+"";
		
		if(on1.compareTo(on2)<0) {
			comp = -1;
		}else if(on1.compareTo(on2)>0) {
			comp = 1;
		}else {
			comp = 0;
		}
		
		return comp;
	}

}
