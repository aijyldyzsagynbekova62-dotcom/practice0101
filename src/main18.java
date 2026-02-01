import java.util.ArrayList;
import java.util.List;

public class main18 {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>(List.of("Up","Avatar","Titanic"));

        String first = "";
        String second = "";

        for (String m : movies) {
            if (m.length() > first.length()) {
                second = first;
                first = m;
            } else if (m.length() > second.length()) {
                second = m;
            }
        }

        System.out.println(second);
    }
}