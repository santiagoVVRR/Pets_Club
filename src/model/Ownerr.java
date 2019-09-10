package model;



public class Ownerr implements Comparable<Ownerr>{

	private String name;
	private String lastName;
	private String id;
	private String petType;
	
	private int petNumber;
	
	private String birthday;
	private Pet pet;
	
	public Ownerr() {
		
	}
	
	
	
	public Ownerr(String name, String lastName, String id, String petType, String birthday) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.petType = petType;
		this.birthday = birthday;
	}



	public Ownerr(String name, String lastName, String id, String petType, String birthday, int petNumber, Pet pet) {
		
		this.name = name;
		this.lastName = lastName;
		this.id = id;
		this.petType = petType;
		this.petNumber = petNumber;
		this.birthday = birthday;
		this.pet = pet;
	}
	

	public int getPetNumber() {
		return petNumber;
	}

	public void setPetNumber(int petNumber) {
		this.petNumber = petNumber;
	}

	public Pet getPet() {
		return pet;
	}

	public void setPet(Pet pet) {
		this.pet = pet;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPetType() {
		return petType;
	}

	public void setPetType(String petType) {
		this.petType = petType;
	}

	public String getBirthday() {
		return birthday;
	}

	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}

	@Override
	public String toString() {
		return "Owner [name=" + name + ", lastName=" + lastName + ", id=" + id + ", petType=" + petType + ", petNumber="
				+ petNumber + ", birthday=" + birthday + ", pet=" + pet + "]";
	}

	@Override
	public int compareTo(Ownerr o) {
		
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
