import java.util.ArrayList;

public class main4 {
    public static void main(String[] args) {
        ArrayList<String> fruits = new ArrayList<>();
        fruits.add("Banana");
        fruits.add("Apple");
        fruits.add("Pineapple");

        fruits.removeIf(fruit-> fruit.equals("Banana"));
        System.out.println(fruits);
    }
}
