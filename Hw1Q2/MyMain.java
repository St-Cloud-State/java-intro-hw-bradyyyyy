import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class MyMain {

    public static void store(Reader inputStream, LinkedList<Person> list) {
        Scanner scan = new Scanner(inputStream);
        while (scan.hasNextLine()) {
            String[] person = scan.nextLine().split(",");
            list.add(new Person(person[0], person[1], person[2]));
        }
        scan.close();
    }

    public static void display(PrintStream outputStream, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            outputStream.println(list.get(i));
        }
    }

    public static int find(String sid, LinkedList<Person> list) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        LinkedList<Person> listOfPersons= new LinkedList<>();

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
            store(readData, listOfPersons);
        } 
        
        catch (FileNotFoundException e) {
            System.out.println("File not found.");
        }

        display(System.out, listOfPersons);

        System.out.println("Person with id 001 is located at index: " + find("001", listOfPersons));
        System.out.println("Person with id 003 is located at index: " + find("003", listOfPersons));
        System.out.println("Person with id 005 is located at index: " + find("005", listOfPersons));
    }
}
