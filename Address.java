import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class newAddress {
	private String name = "";
	private String address = "";
	private String city = "";
	private String state = "";
	private String zipcode = "";
	private Birthday birthday;
	private static int entries = 0;
	private int TempRecord;

	public newAddress() {
		this.name = setName();
		this.address = setAddress();
		this.city = setCity();
		this.state = setState();
		this.zipcode = setZipCode();
		this.birthday = new Birthday();
		entries++;
		this.TempRecord = entries;
	}

	public newAddress(String name, String address, String city, String state, String zipcode, Birthday birthday,
			int TempRecord) { // Test Method
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.birthday = birthday;
		entries++;
		this.TempRecord = entries;
	}

	public static int getEntries() {
		return entries;
	}

	private String getDateTime() {
		DateFormat dateFormat = new SimpleDateFormat("HH:mm MM/dd/yyyy");
		Date date = new Date();
		return dateFormat.format(date);
	}

	public String setName() {
		System.out.println("Enter name");
		name = getInput();
		return name;
	}

	public String setAddress() {
		System.out.println("Enter address (House number and Street Only)");
		address = getInput();
		return address;
	}

	public String setCity() {
		System.out.println("Enter city");
		city = getInput();
		return city;
	}

	public String setState() {
		System.out.println("Enter state");
		state = getInput();
		return state;
	}

	public String setZipCode() {
		System.out.println("Enter zip code");
		zipcode = getInput();
		return zipcode;
	}

	public String toString() { // Test Method
		return String.format(getDateTime() + "\nEntry %s:\n\n%s\n%s\n%s, %s %s\nBirthday: %s\n\n", TempRecord, name,
				address, city, state, zipcode, birthday);
	}

	public void printFullAddress() {
		System.out.printf(getDateTime() + "\nEntry %s:\n%s\n%s\n%s, %s %s\nBirthday: %s\n\n", TempRecord, name,
				address, city, state, zipcode, birthday);
	}

	public String getInput() {
		Scanner input = new Scanner(System.in);
		String word = input.nextLine();
		return word;
	}
}
