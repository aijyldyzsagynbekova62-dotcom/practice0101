import java.util.ArrayList;
import java.util.List;

public class main13 {
    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>(List.of("Hello", "Sky", "Wonderful"));

        String smallest = songs.get(0);

        for (String s : songs) {
            if (s.length() < smallest.length()) {
                smallest = s;
            }
        }

        System.out.println(smallest);
    }
}