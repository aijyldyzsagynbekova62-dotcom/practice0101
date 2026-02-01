import java.util.ArrayList;

public class main {
    public static void main (String[] args) {

        ArrayList<String> books1 = new ArrayList<>();
        books1.add("Harry Potter");
        books1.add("Peter Pan");

        ArrayList<String> books2 = new ArrayList<>();
        books2.add("Happy");
        books2.add("The Little Prince");

        books1.addAll(books2);

        System.out.println(books1);
    }
}