import java.util.ArrayList;
import java.util.List;

public class main16 {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>(List.of("Mon","Tue","Wed","Thu"));

        for (int i = 0; i < 2; i++) {
            String first = days.remove(0);
            days.add(first);
        }

        System.out.println(days);
    }
}
