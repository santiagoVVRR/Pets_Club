package model;



public class Pet implements Comparable<Pet>{

	private String name;
	private String id;
	private String gender;
	private String type;
	
	private String date;
	
	public Pet() {

	}

	public Pet(String name, String id, String gender, String type, String date) {
		
		this.name = name;
		this.id = id;
		this.gender = gender;
		this.type = type;
		this.date = date;
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

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", id=" + id + ", gender=" + gender + ", type=" + type + ", date=" + date + "]";
	}

	@Override
	public int compareTo(Pet p) {
		
		int comp;
		if(id.compareTo(p.id)<0) {
			comp = -1;
		}else if(id.compareTo(p.id)>0) {
			comp = 1;
		}else {
			comp = 0;
		}
		
		return comp;
	}

	
	
	
	
	
}
