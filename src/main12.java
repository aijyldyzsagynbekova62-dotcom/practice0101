import java.util.ArrayList;
import java.util.List;

public class main12 {
    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList<>(List.of("Anna", "Bob", "Mark"));

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).length() % 2 == 0) {
                names.remove(i);
                i--;
            }
        }

        System.out.println(names);
    }
}
