public class SearchInRotatedArray {

    public static void main(String[] args) {
        search(new int[] {5, 6, 7, 8, 9, 10, 1, 2, 3}, 10);
        search(new int[] {3, 1, 2}, 1);
        search(new int[] {3, 5, 1, 2}, 6);
    }

    private static void search(int[] arr, int searchEle) {
        int index = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == searchEle) {
                index = i;
            }
        }
        System.out.println(index);
    }
}
