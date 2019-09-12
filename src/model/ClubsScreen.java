package model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Random;

public class ClubsScreen {

	List<Club> clubs;
	List<Ownerr> owners;
	List<Pet> pets;

	public ClubsScreen() {
		
		clubs = new ArrayList<Club>();
		owners = new ArrayList<Ownerr>();
		pets = new ArrayList<Pet>();
	}
	
	public ArrayList<Club> getClub(){
		return (ArrayList<Club>) clubs;
	}
	
	public ArrayList<Ownerr> getOwner(){
		return (ArrayList<Ownerr>) owners;
	}
	
	public ArrayList<Pet> getPet(){
		return (ArrayList<Pet>) pets;
	}
	
	public void loadClubs() throws IOException {
		
		File f  = new File("data/clubs.csv");
		FileReader fr = new FileReader(f.getAbsolutePath());
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line != null) {
			String[] p = line.split(",");
			
			String name = p[0];
			String id = p[1];
			String petType = p[2];
			String foundation = p[3];
			
			Club b = new Club(name, id, petType, foundation);
			clubs.add(b);
			line = br.readLine();			
		}
		br.close();
		fr.close();
	}
	
	public void loadOwners() throws IOException {
		
		File f = new File("");
		FileReader fr = new FileReader(f.getAbsolutePath());
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line != null) {
			String [] p = line.split(",");
			
			String name = p[0];
			String lastName = p[1];
			String id = p[2];
			String petType = p[3];
			String birthday = p[4];
			
			Ownerr o = new Ownerr(name, lastName, id, petType, birthday);
			owners.add(o);
			line = br.readLine();
		}
		br.close();
		fr.close();
	}
	
	public void loadPets() throws IOException  {
		
		File f = new File("");
		FileReader fr = new FileReader(f.getAbsolutePath());
		BufferedReader br = new BufferedReader(fr);
		
		String line = br.readLine();
		while(line != null) {
			String[] p = line.split("");
			
			String name = p[0];
			String id = p[1];
			String gender = p[2];
			String type = p[3];
			String date = p[4];
			
			Pet e = new Pet(name, id, gender, type, date);
			pets.add(e);
			line = br.readLine();
		}
		br.close();
		fr.close();
	}
	
	public String getRandomClub() {
		String este = "";
		Random rnd = new Random();
		int value = rnd.nextInt(1000);
		for(int i = 0; i<clubs.size(); i++) {
			if(value == i) {
				este = clubs.get(i).getName();
			}
		}
		return este;
	}
	
	public String getRandomOwner() {
		String este = "";
		Random rnd = new Random();
		int value = rnd.nextInt(1000);
		for(int i = 0; i<owners.size(); i++) {
			if(value == i) {
				este = owners.get(i).getName();
			}
		}
		return este;
	}
	
	public String getRandomPet() {
		String este = ""; 
		Random rnd = new Random();
		int value = rnd.nextInt(1000);
		for(int i = 0; i<pets.size(); i++) {
			if(value == i) {
				este = pets.get(i).getType();
			}
		}
		return este;
	}
	
	/*
	 * This method sorts the clubs 
	 */
	public void bubbleSort() {
		for(int i = 0; i<clubs.size()-1; i++) {
			for(int j = i-1; j<clubs.size(); j++) {
				String este = clubs.get(i).getId();
				String next = clubs.get(i+1).getId();
				if(este.compareTo(next)<0) {
					Club temp = clubs.get(i);
					clubs.set(i, clubs.get(i+1));
					clubs.set(i+1, temp);
				}
			}
		}
	}
	
	/*
	 * This method sorts the owners 
	 */
	public void insertionSort() {
		for(int i = 0; i<owners.size()-1; i++) {
			String minOwner = owners.get(i).getId();
			int minPos = i;
			for(int j = i+1; j<owners.size(); j++) {
				String currentOwner = owners.get(j).getId();
				if(currentOwner.compareTo(minOwner)<0) {
					minOwner = currentOwner;
					minPos = j;
				}
			}
			Ownerr temp = owners.get(minPos);
			owners.set(minPos, owners.get(i));
			owners.set(i, temp);
		}
	}
	
	/*
	 * This method sorts the pets 
	 */
	public void selectionSort() {
		for(int i = 0; i<pets.size()-1; i++) {
			int min = 1;
			for(int j = 0; j<pets.size(); j++) {
				min = j;
			}
			Pet aux = pets.get(i);
			pets.set(i, pets.get(min));
			pets.set(min, aux);
		}
	}
	
	
	
	/*
	 * this method sorts the clubs by the number of owners
	 */
	public void sortByNumberOfOwners() {
		Comparator<Club> ownerNumberComparator = new ClubOwnerrNumberComparator();
		Collections.sort(clubs,ownerNumberComparator);
	}
	
	/*
	 * This method sorts the clubs by id
	 */
	public void sortByIdClub() {
		Comparator<Club> idComparator = new ClubIdComparator();
		Collections.sort(clubs,idComparator);
	}
	
	/*
	 * This method sorts the club by name
	 */
	public void sortByNameClub() {
		Comparator<Club> nameComparator = new ClubNameComparator();
		Collections.sort(clubs,nameComparator);
	}
	
	/*
	 * this method sorts the club by pet type
	 */
	public void sortByPetTypeClub() {
		Comparator<Club> petTypeComparator = new ClubPetTypeComparator();
		Collections.sort(clubs,petTypeComparator);
	}
	
	/*
	 * this method sorts the owners by the number of pets they have
	 */
	public void sortByNumberOfPets() {
		Comparator<Ownerr> petNumberComparator = new OwnerrPetNumberComparator();
		Collections.sort(owners,petNumberComparator);
	}
	
	/*
	 * this method sorts the owners by full name
	 */
	public void sortByFullNameOwner() {
		Comparator<Ownerr> fullNameComparator = new OwnerrFullNameComparator();
		Collections.sort(owners,fullNameComparator);
	}
	
	/*
	 * This method sorts the owners by id
	 */
	public void sortByIdOwner() {
		Comparator<Ownerr> idComparator = new OwnerrIdComparator();
		Collections.sort(owners,idComparator);
	}
	
	public void sortByNameOwner() {
		Comparator<Ownerr> nameComparator = new OwnerNameComparator();
		Collections.sort(owners,nameComparator);
	}
	
	/*
	 * This method sorts the owners by pet type
	 */
	public void sortByPetTypeOwner() {
		Comparator<Ownerr> petTypeComparator = new OwnerrPetTypeComparator();
		Collections.sort(owners,petTypeComparator);
	}
	
	/*
	 * this method sorts the pets by pet type
	 */
	public void sortByPetTypePet() {
		Comparator<Pet> petTypeComparator = new PetTypeComparator();
		Collections.sort(pets,petTypeComparator);
	}
	
	/*
	 * this method sorts the pets by name
	 */
	public void sortByPetName() {
		Comparator<Pet> petNameComparator = new PetNameComparator();
		Collections.sort(pets,petNameComparator);
	}
	
	
	public Club binarySort(String parameter, String value) {
		int high = clubs.size()-1;
		int low = 0;
		int mid = -1;
		boolean out = false;
		Club c = null;
		switch(parameter) {
		
		case "Name":
			sortByNameClub();
			for(int i = 0; i < clubs.size() && out == false; i++) {
				mid = (low+high)/2;
				if(clubs.get(mid).getName().compareTo(value)>0) {
					high = mid-1;
				}else if(clubs.get(mid).getName().compareTo(value)<0) {
					low = mid+1;
				}else if(clubs.get(mid).getName().equalsIgnoreCase(value)) {
					out = true;
				}
			}
			break;
			
		case "Id":
			sortByIdClub();
			for(int i = 0; i < clubs.size() && out == false; i++) {
				mid = (low+high)/2;
				if(clubs.get(mid).getId().compareTo(value)>0) {
					high = mid-1;
				}else if(clubs.get(mid).getId().compareTo(value)<0) {
					low = mid+1;
				}else if(clubs.get(mid).getId().equalsIgnoreCase(value)) {
					out = true;
				}
			}
			break;
			
		case "PetTypes":
			sortByPetTypeClub();
			for(int i = 0; i < clubs.size() && out == false; i++) {
				mid = (low+high)/2;
				if(clubs.get(mid).getPetTypes().compareTo(value)>0) {
					high = mid-1;
				}else if(clubs.get(mid).getPetTypes().compareTo(value)<0) {
					low = mid+1;
				}else if(clubs.get(mid).getPetTypes().equalsIgnoreCase(value)) {
					out = true;
				}
			}
			break;
			
		default:
			mid = -1;
			break;
		}
		if(out == true) {
			c = clubs.get(mid);
		}
		
		return c;
	}
	
	public Ownerr binarySortOwner(String parameter, String value) {
		int high = owners.size()-1;
		int low = 0;
		int mid = -1;
		boolean out = false;
		Ownerr o = null;
		switch(parameter) {
		
		case "Name":
			sortByNameOwner();
			for(int i = 0; i < owners.size() && out == false; i++) {
				mid = (low+high)/2;
				if(owners.get(mid).getName().compareTo(value)>0) {
					high = mid-1;
				}else if(owners.get(mid).getName().compareTo(value)<0) {
					low = mid+1;
				}else if(owners.get(mid).getName().equalsIgnoreCase(value)) {
					out = true;
				}
			}
			break;
			
		case "Id":
			sortByIdOwner();
			for(int i = 0; i < owners.size() && out == false; i++) {
				mid = (low+high)/2;
				if(owners.get(mid).getId().compareTo(value)>0) {
					high = mid-1;
				}else if(owners.get(mid).getId().compareTo(value)<0) {
					low = mid+1;
				}else if(owners.get(mid).getId().equalsIgnoreCase(value)) {
					out = true;
				}
			}
			break;
			
		case "PetType":
			sortByPetTypeOwner();
			for(int i = 0; i < owners.size() && out == false; i++) {
				mid = (low+high)/2;
				if(owners.get(mid).getPetType().compareTo(value)>0) {
					high = mid-1;
				}else if(owners.get(mid).getPetType().compareTo(value)<0) {
					low = mid+1;
				}else if(owners.get(mid).getPetType().equalsIgnoreCase(value)) {
					out = true;
				}
			}
			break;
			
		default:
			mid = -1;
			break;
		}
		if(out == true) {
			o = owners.get(mid);
		}
		
		return o;
	}
	
	public Pet linealSort(String parameter, String value) {
		Pet p = null;
		switch(parameter) {
		
		case "PetType":
			sortByPetTypePet();
			for(int i = 0; i < pets.size(); i++) {
				String pe = pets.get(i).getType();
				if(pe.equalsIgnoreCase(value)) {
					p = pets.get(i);
				}
			}
			break;
			
		case "Name":
			sortByPetName();
			for(int i = 0; i < pets.size(); i++) {
				String pe = pets.get(i).getName();
				if(pe.equalsIgnoreCase(value)) {
					p = pets.get(i);
				}
			}
			break;
			
			default:
				break;
		}
		return p;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
