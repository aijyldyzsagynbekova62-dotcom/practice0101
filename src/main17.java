import java.util.ArrayList;

public class main17 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>();
        students.add("Anna");
        students.add(null);
        students.add("Bob");
        students.add("Alya");

        students.removeIf(s -> s == null);

        System.out.println(students);
    }
}