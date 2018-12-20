import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Address {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String choice = "HI";
		System.out.println("This program prints multiple addresses, along with their birthdays for reference");
		List<newAddress> Addresses = new ArrayList<newAddress>();
		while (!choice.equals("3")) {
			System.out.println("What do you want to do?");
			System.out.println("1. Add an address");
			System.out.println("2. Print out all address entries");
			System.out.println("3. Quit");
			choice = input.nextLine();
			if (choice.equals("1")) {
				newAddress Address = new newAddress();
				Addresses.add(Address);
				System.out.println("Address added to records...");
				System.out.println();
			}
			if (choice.equals("2")) {
				for (int i = 0; i < Addresses.size(); i++) {
					Addresses.get(i).printFullAddress();
				}
				System.out.println("Total Entries: " + newAddress.getEntries());
				System.out.println();
			}
		}
		System.out.println("Quitting");
	}
}

