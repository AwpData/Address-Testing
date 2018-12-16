public class Address {
    public static void main(String[] args) {
        System.out.println("This program prints your address and now your birthday!");
        Birthday birthday = new Birthday(11, 13, 1998);
        newAddress AddressFull = new newAddress("Trevor", "Beach St", "Los Angeles", "California", birthday);
        newAddress AddressFull2 = new newAddress("Who", "What St", "Where City", "Why State", birthday);
        newAddress AddressFull3 = new newAddress("Yo", "Hello St", "Hola City", "Bonjour State", birthday);
        System.out.println("Total Records: " + newAddress.getRecords());
 
    }
}
