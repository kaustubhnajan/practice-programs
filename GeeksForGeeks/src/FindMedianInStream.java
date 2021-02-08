import java.util.ArrayList;
import java.util.List;

public class FindMedianInStream {

    public static void main(String[] args) {
        findMedian(new int[] {5, 15, 1, 3});
    }

    private static void findMedian(int[] arr) {
        List<Integer> sortedStream = new ArrayList<>();
        for (int element : arr) {
            sortedStream.add(element);
            sortedStream.sort(Integer::compare);

            int middlePos = sortedStream.size() / 2;
            if (sortedStream.size() % 2 == 0) {
                System.out.println((sortedStream.get(middlePos - 1) + sortedStream.get(middlePos)) / 2);
            } else {
                System.out.println(sortedStream.get(middlePos));
            }
        }
    }
}
