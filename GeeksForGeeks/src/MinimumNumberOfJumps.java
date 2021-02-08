public class MinimumNumberOfJumps {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
        calculateMinNumberSteps(arr);

        arr = new int[] {1, 4, 3, 2, 6, 7};
        calculateMinNumberSteps(arr);
    }

    private static void calculateMinNumberSteps(int[] arr) {

        int minNumberSteps = 1;

        for (int i = 1; i < arr.length; i++) {
            int nextAvailableSteps = arr[i];

            if (nextAvailableSteps >= (arr.length - i - 1)) {
                minNumberSteps++;
                break;
            } else {
                i = i + 1;
                for (int j = i + 1; j < nextAvailableSteps; j++) {
                    if (arr[i] <= arr[j]) {
                        i = j;
                    }
                }
                minNumberSteps++;
            }
        }

        System.out.println(minNumberSteps);
    }
}
