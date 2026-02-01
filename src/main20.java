import java.util.ArrayList;

public class main20 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>();
        it.add("Alice");
        it.add("Bob");

        ArrayList<String> hr = new ArrayList<>();
        hr.add("John");
        hr.add("Emma");

        departments.add(it);
        departments.add(hr);

        System.out.println(departments);
    }
}