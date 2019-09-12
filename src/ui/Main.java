package ui;

import java.io.IOException;
import java.util.Scanner;

import model.*;

public class Main {

	private ClubsScreen cs;
	private Scanner input;
	
	public Main() {
		cs = new ClubsScreen();
		input = new Scanner(System.in);
	}
	
	
	public static void main(String[] args) throws IOException {
		Main m = new Main();
		m.menu();

	}

	public void menu() throws IOException {
		System.out.println("\n-------------------------------------------------------------------------- \n");
		System.out.println("\n<--------------------------------->MENU<---------------------------------> \n");
		System.out.println("\n-------------------------------------------------------------------------- \n");
		System.out.println("1- Sort clubs list");
		System.out.println("2- Sort owners list ");
		System.out.println("3- Sort pets list");
		System.out.println("4- Search club");
		System.out.println("5- Search owner");
		System.out.println("6- Search pet");
		System.out.println("7- Add new club");
		System.out.println("8- EXIT");
		System.out.println("\n-------------------------------------------------------------------------- \n");
		
		int op = input.nextInt();
		input.nextLine();
		
		if(op == 1) {
			op1();
		}else if(op == 2) {
			op2();
		}else if(op == 3) {
			op3();
		}else if(op == 4) {
			op4();
		}else if(op == 5) {
			op5();
		}else if(op == 6) {
			op6();
		}else if(op == 7) {
			op7();
		}else if(op == 8) {
			System.out.println("\n--------------------------------------------------------------------------- ");
			System.out.println("<----------------------THANKS----------------------->");
			System.out.println("--------------------------------------------------------------------------- ");
			System.exit(0);
		}
	}
	
	public void op1() throws IOException {
		System.out.println("Please write the type of sort you want to do");
		System.out.println("Options:\n-name\n-id\npetType\n");
		String choice = input.nextLine();
		
		if(choice.equals("name")) {
			cs.loadClubs("data/clubs.csv", ",");
			cs.sortByNameClub();
			System.out.println(cs.getClubReport());
		}else if(choice.equals("id")) {
			cs.loadClubs("data/clubs.csv", ",");
			cs.sortByIdClub();
			System.out.println(cs.getClubReport());
		}else if(choice.equals("petType")) {
			cs.loadClubs("data/clubs.csv", ",");
			cs.sortByPetTypeClub();
			System.out.println(cs.getClubReport());
		}
		toContinue();
	}
	
	public void op2() throws IOException {
		System.out.println("Please write the type of sort you want to do");
		System.out.println("Options:\n-FullName\n-id\n-petType\n");
		String choice = input.nextLine();
		
		if(choice.equals("FullName")) {
			cs.loadOwners("data/owners.csv", ",");
			cs.sortByFullNameOwner();
			System.out.println(cs.getOwnersReport());
		}else if(choice.equals("id")) {
			cs.loadOwners("data/owners.csv", ",");
			cs.sortByIdOwner();
			System.out.println(cs.getOwnersReport());
		}else if(choice.equals("petType")) {
			cs.loadOwners("data/owners.csv", ",");
			cs.sortByPetTypeOwner();;
			System.out.println(cs.getOwnersReport());
		}
		toContinue();
	}
	
	public void op3() throws IOException {
		System.out.println("Please write the type of sort you want to do");
		System.out.println("Options:\n-name\ntype\n");
		String choice = input.nextLine();
		
		if(choice.equals("name")) {
			cs.loadPets("data/pets.csv", ",");
			cs.sortByPetName();
			System.out.println(cs.getPetsReport());
		}else if(choice.equals("id")) {
			cs.loadPets("data/pets.csv", ",");
			cs.sortByPetTypePet();
			System.out.println(cs.getPetsReport());
		}
		toContinue();
	}
	
	public void op4() throws IOException {
		System.out.println("Search by:\n-Name\n-Id\n-PetTypes\n");
		String choice = input.nextLine();
		System.out.println("Please enter what you are looking for");
		String c = input.nextLine();
		Club b = cs.binarySort(choice, c);
		if(b != null) {
			System.out.println(b.toString());
		}else {
			System.out.println("the value does not exist");
		}
		toContinue();
	}
	
	public void op5() throws IOException {
		System.out.println("Search by:\n-Name\n-Id\n-PetType\n");
		String choice = input.nextLine();
		System.out.println("Please enter what you are looking for");
		String c = input.nextLine();
		Ownerr b = cs.binarySortOwner(choice, c);
		if(b != null) {
			System.out.println(b.toString());
		}else {
			System.out.println("the value does not exist");
		}
		toContinue();
	}
	
	public void op6() throws IOException {
		System.out.println("Search by:\n-Name\n-PetType");
		String choice = input.nextLine();
		System.out.println("Please enter what you are looking for");
		String c = input.nextLine();
		Pet b = cs.linealSort(choice, c);
		if(b != null) {
			System.out.println(b.toString());
		}else {
			System.out.println("the value does not exist");
		}
		toContinue();
	}
	
	public void op7() throws IOException {
		System.out.println("Please type the name of the club");
		String name = input.nextLine();
		System.out.println("Please type the id of the club");
		String id = input.nextLine();
		System.out.println("Please type the PetType of the club");
		String pt = input.nextLine();
		System.out.println("Please type the Foundation date (dd/mm/yyyy) of the club");
		String date = input.nextLine();
		
		cs.addClub(name, id, pt, date);
		
		toContinue();
	}

	public void toContinue() throws IOException {
		System.out.println("\n--------------------------------------------------------------------------- ");
		System.out.println("1. MENU \n 2. EXIT");
		
		int what = input.nextInt();
		input.nextLine();
			if(what == 1){
				menu();
			}else{
				System.out.println("\n--------------------------------------------------------------------------- ");
				System.out.println("<----------------------THANKS----------------------->");
				System.out.println("--------------------------------------------------------------------------- ");
				System.exit(0);
				
			}
	}


}


