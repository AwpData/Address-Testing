import java.util.Scanner;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
 
public class newAddress {
    private String name = "";
    private String address = "";
    private String city = "";
    private String state = "";
    private Birthday birthday;
    private static int records = 0;
 
    /*
     * public newAddress() { this("Trevor","101","Bellevue","Washington"); }
     */
 
    /*
     * public newAddress() { // USER INPUT this.name = setName(); this.address =
     * setAddress(); this.city = setCity(); this.state = setState(); }
     */
 
    /*
     * public newAddress(String name) { // TEST METHOD this(name, "Unknown",
     * "Unknown", "Unknown", null); }
     */
 
    public newAddress(String name, String address, String city, String state, Birthday birthday) {
        this.name = name;
        this.address = address;
        this.city = city;
        this.state = state;
        this.birthday = birthday;
        records++;
 
        System.out.println(
                getDateTime() + " Record #" + records + ": " + name + ", " + address + " " + city + ", " + state + " " + birthday);
 
    }
 
    public static int getRecords() {
        return records;
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
 
    public String getName() {
        return name;
    }
 
    public String setAddress() {
        System.out.println("Enter address");
        address = getInput();
        return address;
    }
 
    public String getAddress() {
        return address;
    }
 
    public String setCity() {
        System.out.println("Enter city");
        city = getInput();
        return city;
    }
 
    public String getCity() {
        return city;
    }
 
    public String setState() {
        System.out.println("Enter state");
        state = getInput();
        return state;
    }
 
    public String getState() {
        return state;
    }
 
    public String toString() { // prints address with birthday and timestamp 
        return String.format(getDateTime() + " Record %s: %s, %s %s, %s, %s", records, getName(), getAddress(), getCity(), getState(),
                birthday);
    }
 
    public String getInput() {
        Scanner input = new Scanner(System.in);
        String word = input.nextLine();
        return word;
    }
 
}
