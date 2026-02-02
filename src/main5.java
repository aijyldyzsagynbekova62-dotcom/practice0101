import java.util.ArrayList;
import java.util.Collections;

public class main5 {
    public static void main (String[] args){
        ArrayList<String> colors = new ArrayList<>();
        colors.add("Blue");
        colors.add("Red");
        colors.add("Black");

        Collections.fill(colors, "Black");
        System.out.println(colors);
    }
}
