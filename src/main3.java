import java.util.ArrayList;
import java.util.List;

public class main3 {
    public static void main (String[] args) {
ArrayList<String> foods = new ArrayList<>(List.of("Pizza", "Burger", "Pizza","Sushi"));

int count = 0;
for (String food : foods) {
        if (food.equals("Pizza")) {
count++;
        }
        }
        System.out.println(count);
    }}