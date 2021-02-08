public class RearrangeArrayAlternately {

    public static void main(String[] args) {
        rearrangeArray(new int[] {1, 2, 3, 4, 5, 6});
    }

    private static void rearrangeArray(int[] arr) {
        if (arr.length % 2 == 0) {
            int lastPos = 1;
            int swappingPos = arr.length / 2;

            while (swappingPos > 0) {
                int temp = arr[swappingPos - 1];
                arr[swappingPos - 1] = arr[swappingPos];
                arr[swappingPos] = temp;

                temp = arr[arr.length - lastPos];
                arr[arr.length - lastPos] = arr[swappingPos];
                arr[swappingPos] = temp;

                temp = arr[arr.length - 1 - lastPos];
                arr[arr.length - 1 - lastPos] = arr[swappingPos - 1];
                arr[swappingPos - 1] = temp;

                lastPos += 2;
                swappingPos = (arr.length - lastPos + 1) / 2;
            }

            for (int ele : arr) {
                System.out.print(ele + " ");
            }
        }
    }
}
