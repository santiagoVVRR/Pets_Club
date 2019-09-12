package model;

import java.util.Comparator;

public class ClubNameComparator implements Comparator<Club>{

	@Override
	public int compare(Club c1, Club c2) {
		int comp;
		String n1 = c1.getName();
		String n2 = c2.getName();
		
		if(n1.compareTo(n2)<0) {
			comp = -1;
		}else if(n1.compareTo(n2)>0) {
			comp = 1;
		}else {
			comp = 0;
		}
		return comp;
	}

}
