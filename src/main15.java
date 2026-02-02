import java.util.ArrayList;
import java.util.List;

public class main15 {
    public static void main(String[] args) {

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);

        ArrayList<Integer> even = new ArrayList<>();
        ArrayList<Integer> odd = new ArrayList<>();

        for (int n : nums) {
            if (n % 2 == 0)
                even.add(n);
            else
                odd.add(n);
        }

        System.out.println(even);
        System.out.println(odd);
    }
}
