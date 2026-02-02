import java.util.ArrayList;

public class main13 {
    public static void main(String[] args) {

        ArrayList<String> songs = new ArrayList<>();
        songs.add("Hello");
        songs.add("Sky");
        songs.add("Wonderful");

        String smallest = songs.get(0);

        for (String s : songs) {
            if (s.length() < smallest.length()) {
                smallest = s;
            }
        }

        System.out.println(smallest);
    }
}