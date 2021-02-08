import java.util.ArrayList;
import java.util.List;

public class $CountWaysToReachTheNthStair {

    public static void main(String[] args) {
        countWays(4);
        countWays(10);
        countWays(24);
    }

    private static void countWays(int numberOfStairs) {
        if (numberOfStairs == 1) {
            System.out.println(1);
        } else if (numberOfStairs == 2) {
            System.out.println(2);
        } else {
            List<Integer> list = new ArrayList<>();
            list.add(1);
            list.add(2);

            int numberOfWays = 0;
            for (int i = 2; i < numberOfStairs; i++) {
                numberOfWays = list.get(i - 1) + list.get(i - 2);
                list.add(numberOfWays);
            }
            System.out.println(numberOfWays);
        }
    }
}
