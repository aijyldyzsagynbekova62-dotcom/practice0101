import java.util.ArrayList;
import java.util.List;

public class main4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>(List.of("Apple","Banana","Banana"));
        fruits.removeIf(fruit-> fruit.equals("Banana"));
        System.out.println(fruits);
    }
}
