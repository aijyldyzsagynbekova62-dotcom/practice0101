import java.util.ArrayList;

public class main18 {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Up");
        movies.add("Titanic");

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