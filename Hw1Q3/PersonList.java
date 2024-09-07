import java.util.LinkedList;
import java.util.Scanner;
import java.io.*;

public class PersonList {
    private LinkedList<Person> list;

    public PersonList() {
        list = new LinkedList<>();
    }

    public void store(Reader inputStream) {
        Scanner scan = new Scanner(inputStream);
        while (scan.hasNextLine()) {
            String[] person = scan.nextLine().split(",");
            list.add(new Person(person[0], person[1], person[2]));
        }
        scan.close();
    }

    public void display(PrintStream outputStream) {
        for (int i = 0; i < list.size(); i++) {
            outputStream.println(list.get(i));
        }
    }

    public int find(String sid) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getId().equals(sid)) {
                return i;
            }
        }
        return -1;
    }
}