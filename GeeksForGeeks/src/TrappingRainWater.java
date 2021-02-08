public class TrappingRainWater {

    public static void main(String[] args) {

        int[] arr = { 7, 4, 0, 9};
        System.out.println(maxWater(arr));

        arr = new int[] { 6, 9, 9};
        System.out.println(maxWater(arr));
    }

    public static int maxWater(int[] arr) {

        int result = 0;

        for (int i = 0; i < arr.length; i++) {

            int leftMax = arr[i];
            for (int j = 0; j < i; j++) {
                if (leftMax < arr[j]) {
                    leftMax = arr[j];
                }
            }

            int rightMax = arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                if (rightMax < arr[j]) {
                    rightMax = arr[j];
                }
            }

            result = result + Math.min(leftMax, rightMax) - arr[i];
        }

        return result;
    }
}
