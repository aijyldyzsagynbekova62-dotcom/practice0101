import java.util.ArrayList;
import java.util.List;

public class main6 {
    public static void main (String[] args){
    ArrayList<String> sports = new ArrayList<>();
    sports.add("Football");
    sports.add("Volleyball");
    sports.add("Tennis");

    ArrayList<String> check = new ArrayList<>(List.of("Tennis"));

System.out.println(sports.containsAll(check));
}
}
