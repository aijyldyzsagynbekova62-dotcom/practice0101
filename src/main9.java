import java.util.ArrayList;
import java.util.List;

public class main9 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>(List.of("Paris", "London", "Rome"));

        String[] array = cities.toArray(new String[0]);

        for (String city : array) {
            System.out.println(city);
        }
    }
}
