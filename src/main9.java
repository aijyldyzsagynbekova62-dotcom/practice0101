import java.util.ArrayList;

public class main9 {
    public static void main(String[] args) {

        ArrayList<String> cities = new ArrayList<>();
cities.add("Paris");
cities.add("London");
cities.add("London");
        String[] array = cities.toArray(new String[0]);

        for (String city : array) {
            System.out.println(city);
        }
    }
}
