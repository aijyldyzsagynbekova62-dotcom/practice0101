import java.util.ArrayList;

public class main3 {
    public static void main (String[] args) {
ArrayList<String> foods = new ArrayList<>();

foods.add("Burger");
foods.add("Pizza");
foods.add("Pizza");
foods.add("Shushi");

int count = 0;
for (String food : foods) {
        if (food.equals("Pizza")) {
count++;
        }
        }
        System.out.println(count);
    }}