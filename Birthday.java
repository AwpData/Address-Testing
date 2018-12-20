import java.util.Scanner;

public class Birthday {
	private String month;
	private String day;
	private String year;

	public Birthday() {
		System.out.println();
		System.out.println("Now logging birthday");
		this.month = setMonth();
		this.day = setDay();
		this.year = setYear();
	}

	public Birthday(String month, String day, String year) {
		this.month = month;
		this.day = day;
		this.year = year;
	}

	public String setMonth() {
		System.out.println("Enter Month");
		month = getInput();
		return month;
	}

	public String setDay() {
		System.out.println("Enter Day");
		day = getInput();
		return day;
	}

	public String setYear() {
		System.out.println("Enter Year");
		year = getInput();
		return year;
	}

	public String toString() {
		return month + "/" + day + "/" + year;
	}

	public String getInput() {
		Scanner input = new Scanner(System.in);
		String date = input.nextLine();
		return date;
	}
}

