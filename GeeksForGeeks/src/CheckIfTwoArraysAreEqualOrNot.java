import java.util.Arrays;

public class CheckIfTwoArraysAreEqualOrNot {

    public static void main(String[] args) {
        checkIfEqual(new int[] {1, 2, 5, 4, 0}, new int[] {2, 4, 5, 0, 1});
        checkIfEqual(new int[] {1, 2, 5}, new int[] {2, 4, 15});
    }

    private static void checkIfEqual(int[] arr1, int[] arr2) {
        if (arr1.length == arr2.length) {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean isEqual = true;
            for (int i = 0; i <arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isEqual = false;
                    break;
                }
            }

            if (isEqual) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        } else {
            System.out.println(0);
        }
    }
}
