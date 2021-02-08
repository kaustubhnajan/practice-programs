public class MajorityElement {

    public static void main(String[] args) {

        int[] arr = {3, 1, 3, 3, 2};
        findMajorityElement(arr);

        arr = new int[] {1, 2, 3};
        findMajorityElement(arr);
    }

    private static void findMajorityElement(int[] arr) {
        int majorityFactor = arr.length / 2;
        int majorityElement = -1;

        int appearanceCount = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    appearanceCount++;
                }
            }

            if (appearanceCount > majorityFactor) {
                majorityElement = arr[i];
            }
            appearanceCount = 0;
        }

        System.out.println(majorityElement);
    }
}
