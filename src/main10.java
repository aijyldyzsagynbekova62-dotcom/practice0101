import java.util.ArrayList;
import java.util.Collections;

public class main10 {
    public static void main(String[] args) {

        Integer[] numbers = {1, 2, 3, 4, 5};

        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, numbers);

        System.out.println(list);
    }
}
