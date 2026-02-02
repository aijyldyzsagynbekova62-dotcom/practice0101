import java.util.ArrayList;

public class main19 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Kiwi");
        fruits.add("Apple");

        ArrayList<Integer> lengths = new ArrayList<>();

        for (String f : fruits) {
            lengths.add(f.length());
        }

        System.out.println(lengths);
    }
}
