import java.io.*;

public class MyMain {

    public static void main(String[] args) {
        PersonList personList = new PersonList();

        try {
            FileWriter writeData = new FileWriter("persons.txt");
            writeData.write("John,Doe,001\n");
            writeData.write("Jane,Doe,002\n");
            writeData.write("Alice,Smith,003\n");
            writeData.close();
        } 
        
        catch (IOException e) {
            System.out.println("File not found.");
        }

        try {
            FileReader readData = new FileReader("persons.txt");
            personList.store(readData);
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        personList.display(System.out);

        // Testing the find method
        System.out.println("Person with id 001 is located at index: " + personList.find("001"));
        System.out.println("Person with id 003 is located at index: " + personList.find("003"));
        System.out.println("Person with id 005 is located at index: " + personList.find("005"));
    }
}
