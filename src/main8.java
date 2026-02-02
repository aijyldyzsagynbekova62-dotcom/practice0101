import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.LinkedHashSet;

public class main8 {
    public static void main (String[] args){
        ArrayList<String> animals = new ArrayList<>();
animals.add("Cat");
animals.add("Dog");
animals.add("Cat");
        Set<String> unique = new LinkedHashSet<>(animals);
        animals = new ArrayList<>(unique);

        System.out.println(animals);
    }
}
