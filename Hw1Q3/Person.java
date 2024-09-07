public class Person {
    private String firstName;
    private String lastName;
    private String id;

    public Person (String firstName, String lastName, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getId() {
        return id;
    }

    public String toString() {
        return "firstName: " +firstName +" lastName: " +lastName +" ID: " +id;
    }

    public static void main(String[] args) {
        Person person = new Person("John", "Doe", "123");
        System.out.println(person);
        System.out.println("First Name: " + person.getFirstName());
        System.out.println("Last Name: " + person.getLastName());
        System.out.println("ID: " + person.getId());
    }
}