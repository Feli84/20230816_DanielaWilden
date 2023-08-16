public class Hello {
    private String firstName;
    private String lastName;
    private int age;

    public Hello(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("Name: " + firstName + " " + lastName);
        System.out.println("Alter: " + age);
    }

    public static void main(String[] args) {
        Hello hello = new Hello("Daniela", "Wilden", 38);
        hello.printDetails();
    }
}