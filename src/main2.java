import java.util.ArrayList;

public class main2 {
    public static void main(String[] args){
ArrayList<String> movies = new ArrayList<>();

movies.add("Up");
movies.add("Inception");
movies.add("Interstellar");

    String longest = movies.get(0);
for (String m :movies)

    {
        if (m.length() > longest.length()) {
            longest = m;
        }
    }
            System.out.println(longest);
    }}
