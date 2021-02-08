public class SortAnArrayOf0s1sAnd2s {

    public static void main(String[] args) {

        int[] arr = {0, 2, 1, 2, 0};
        sort(arr);

        arr = new int[] {0, 1, 0};
        sort(arr);
    }

    private static void sort(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        for (int element : arr) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}
