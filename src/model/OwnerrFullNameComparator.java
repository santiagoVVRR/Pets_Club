package model;

import java.util.Comparator;

public class OwnerrFullNameComparator implements Comparator<Ownerr>{

	@Override
	public int compare(Ownerr o1, Ownerr o2) {
		
		int comp;
		String name1 = o1.getName();
		String name2 = o2.getName();
		String lName1 = o1.getLastName();
		String lName2 = o2.getLastName();
		
		if(lName1.compareTo(lName2)<0) {
			comp = -1;
		}else if(lName1.compareTo(lName2)>0) {
			comp = 1;
		}else {
			if(name1.compareTo(name2)<0) {
				comp = -1;
			}else if(name1.compareTo(name2)>0) {
				comp = 1;
			}else {
				comp = 0;
			}
		}
		
		return comp;
	}

}
