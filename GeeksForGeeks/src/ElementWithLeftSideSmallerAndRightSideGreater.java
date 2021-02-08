import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ElementWithLeftSideSmallerAndRightSideGreater {

    public static void main(String[] args) {

//        rearrange(new int[] {4, 2, 5, 7});
        findElementOptimized(new int[] {4, 2, 5, 7});

//        rearrange(new int[] {11, 9, 12});
//
//        rearrange(new int[] {4, 3, 2, 7, 8,
//
//        rearrange(new int[] {4, 3, 2, 7, 8, 9});
    }

    private static void findElementOptimized(int[] arr) {

        int[] leftMax = new int[arr.length];
        leftMax[0] = Integer.MIN_VALUE;

        for (int i = 1; i < arr.length; i++) {
            leftMax[i] = Math.max(arr[i - 1], leftMax[i - 1]);
        }

        Arrays.stream(leftMax).boxed().collect(Collectors.toList()).stream().forEach(System.out::println);
    }

    private static void rearrange(int[] arr) {

        int element = -1;

        for (int i = 1; i < arr.length - 1; i++) {
            boolean found = true;
            for (int j = i; j >= 0; j--) {
                if (arr[i] < arr[j]) {
                    found = false;
                    break;
                }
            }

            if (found) {
                for (int j = i + 1; j < arr.length; j++) {
                    if (arr[i] > arr[j]) {
                        found = false;
                        break;
                    }
                }
            }

            if (found) {
                element = arr[i];
                break;
            }
        }

        System.out.println(element);
    }
}
