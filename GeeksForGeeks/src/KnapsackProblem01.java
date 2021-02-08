import java.util.ArrayList;
import java.util.List;

public class KnapsackProblem01 {

    public static void main(String[] args) {

        int[] values = {1, 2, 3};
        int[] weights = {4, 5, 1};
        findMaxWeight(values, weights, 4);

        values = new int[] {1, 2, 3};
        weights = new int[] {4, 5, 6};
        findMaxWeight(values, weights, 3);
    }

    private static void findMaxWeight(int[] values, int[] weights, int sackMaxCapacity) {

        List<Integer> allowedValues = new ArrayList<>();
        for (int i = 0; i < weights.length; i++) {
            if (weights[i] <= sackMaxCapacity) {
                allowedValues.add(values[i]);
            }
        }

        if (allowedValues.size() > 0) {
            System.out.println(allowedValues.stream().max(Integer::compare).get());
        } else {
            System.out.println(0);
        }
    }
}
