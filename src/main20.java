import java.util.ArrayList;

public class main20 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> departments = new ArrayList<>();

        ArrayList<String> it = new ArrayList<>();
        it.add("Aidana");
        it.add("Temirlan");

        ArrayList<String> hr = new ArrayList<>();
        hr.add("Anara");
        hr.add("Bolot");

        departments.add(it);
        departments.add(hr);

        System.out.println(departments);
    }
}