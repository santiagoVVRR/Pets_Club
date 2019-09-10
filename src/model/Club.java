package model;

public class Club implements Comparable<Club>{

	private String name;
	private String id;
	private String petTypes;
	private String foundation;
	
	private int ownerNumber;
	
	
	private Ownerr owner;

	

	public Club() {
		
	}

	public Club(String name, String id, String petTypes, String foundation) {
		
		this.name = name;
		this.id = id;
		this.petTypes = petTypes;
		this.foundation = foundation;
	}

	public Club(String name, String id, String petTypes, int ownerNumber, String foundation, Ownerr owner) {
		
		this.name = name;
		this.id = id;
		this.petTypes = petTypes;
		this.ownerNumber = ownerNumber;
		this.foundation = foundation;
		this.owner = owner;
	}

	
	
	public Ownerr getOwner() {
		return owner;
	}

	public void setOwner(Ownerr owner) {
		this.owner = owner;
	}

	public int getOwnerNumber() {
		return ownerNumber;
	}

	public void setOwnerNumber(int ownerNumber) {
		this.ownerNumber = ownerNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPetTypes() {
		return petTypes;
	}

	public void setPetTypes(String petTypes) {
		this.petTypes = petTypes;
	}

	public String getFoundation() {
		return foundation;
	}

	public void setFoundation(String foundation) {
		this.foundation = foundation;
	}

	

	@Override
	public String toString() {
		return "Club [name=" + name + ", id=" + id + ", petTypes=" + petTypes + ", foundation=" + foundation + "]";
	}

	@Override
	public int compareTo(Club o) {
		
		int comp;
		if(id.compareTo(o.id)<0) {
			comp = -1;
		}else if(id.compareTo(o.id)>0) {
			comp = 1;
		}else {
			comp = 0;
		}
		
		return comp;
	}

	
	
	
	
}
