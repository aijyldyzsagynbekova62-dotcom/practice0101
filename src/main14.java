import java.util.ArrayList;
import java.util.List;

public class main14 {
    public static void main(String[] args) {

        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Butterfly");

        for (int i = 0; i < words.size(); i++) {
            words.set(i, words.get(i).replaceAll("[aeiouAEIOU]", "*"));
        }

        System.out.println(words);
    }
}