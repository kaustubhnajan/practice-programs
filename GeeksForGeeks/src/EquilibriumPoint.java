public class EquilibriumPoint {

    public static void main(String[] args) {

        int[] arr = {1, 3, 5, 2, 2};
        System.out.println(findEquilibriumPoint(arr));

        arr = new int[] {1};
        System.out.println(findEquilibriumPoint(arr));
    }

    private static int findEquilibriumPoint(int[] arr) {
        if (arr.length == 1) {
            return arr[0];
        }

        int beforeSum = 0;
        int afterSum = 0;

        for (int i = 0; i< arr.length - 1; i++) {
            beforeSum += arr[i];

            for (int j = i + 2; j < arr.length; j++) {
                afterSum += arr[j];
            }

            if (beforeSum == afterSum) {
                return i + 1 + 1;
            } else {
                afterSum = 0;
            }
        }

        return -1;
    }
}
