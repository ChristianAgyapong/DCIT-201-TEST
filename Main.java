public class Main {
     private String name;
    private String address;
    private String phone;
    private int age;

    public Main(String name, String address, String phone, int age) {
    this.name = name;
    this.address = address;
    this.phone = phone;
    this.age = age;
    }


public static void main(String[] args) {
    Main Data = new Main("John Doe", "123 Main St", "555-1234", 30);    

    System.out.println("Name: " + Data.name);
    System.out.println("Address: " + Data.address);
    System.out.println("Phone: " + Data.phone);
    System.out.println("Age: " + Data.age);
}

}