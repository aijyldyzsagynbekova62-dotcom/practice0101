import java.util.ArrayList;
import java.util.List;

public class main11 {
    public static void main(String[] args) {

        ArrayList<String> c1 = new ArrayList<>(List.of("France", "Germany", "Italy"));
        ArrayList<String> c2 = new ArrayList<>(List.of("Italy", "Spain"));

        ArrayList<String> common = new ArrayList<>();

        for (String c : c1) {
            if (c2.contains(c)) {
                common.add(c);
            }
        }

        System.out.println(common);
    }
}