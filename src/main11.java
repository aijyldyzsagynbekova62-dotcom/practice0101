import java.util.ArrayList;


public class main11 {
    public static void main(String[] args) {

        ArrayList<String> countries1 = new ArrayList<>();
        countries1.add("France");
        countries1.add("Germany");
        countries1.add("Italy");

        ArrayList<String> countries2 = new ArrayList<>();
        countries2.add("Italy");
        countries2.add("Spain");

        ArrayList<String> common = new ArrayList<>();

        for (String c : countries1) {
            if (countries2.contains(c)) {
                common.add(c);
            }
        }

        System.out.println(common);
    }
}