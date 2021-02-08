public class RotateArray {

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 2);

        arr = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
        rotate(arr, 3);
    }

    private static void rotate(int[] arr, int rotations) {
        for (int i = 0; i < rotations; i++) {
            int temp = arr[0];
            int j = 0;
            for (; j < arr.length - 1; j++) {
                arr[j] = arr[j+1];
            }
            arr[j] = temp;
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
