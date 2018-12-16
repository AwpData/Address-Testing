public class Birthday {
    private int month;
    private int day;
    private int year;
    
    public Birthday(int month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }
    
    public String toString() {
        return month + "/" + day + "/" + year;
    }
}
