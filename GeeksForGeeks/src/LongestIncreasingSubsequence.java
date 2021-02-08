public class LongestIncreasingSubsequence {

    public static void main(String[] args) {

//        String str = "0 8 4 12 2 10 6 14 1 9 5 13 3 11 7 15".replace(" ", ", ");
//        System.out.println(str);

        int[] arr = {0, 8, 4, 12, 2, 10, 6, 14, 1, 9, 5, 13, 3, 11, 7, 15};
        calculateLongestIncreasingSequence(arr);
    }

    private static void calculateLongestIncreasingSequence(int[] arr) {

        int finalSequenceCount = 0;
        int sequenceCount = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < arr[j]) {
                    sequenceCount++;
                }
                i = j - 1;
            }

            if (sequenceCount > finalSequenceCount) {
                finalSequenceCount = sequenceCount;
            }
            sequenceCount = 0;
        }

        System.out.println(finalSequenceCount);
    }
}
