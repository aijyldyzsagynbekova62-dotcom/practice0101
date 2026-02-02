import java.util.ArrayList;

public class main16 {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>();
        days.add("Mon");
        days.add("Thu");
        days.add("Tue");
        days.add("Wed");

        for (int i = 0; i < 2; i++) {
            String first = days.remove(0);
            days.add(first);
        }

        System.out.println(days);
    }
}
