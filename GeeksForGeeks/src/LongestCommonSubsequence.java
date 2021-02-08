public class LongestCommonSubsequence {

    public static void main(String[] args) {

        System.out.println(LCS1("ABCDGH".toCharArray(), "ACDGHR".toCharArray(), 6, 6));
        System.out.println(LCS2("ABC".toCharArray(), "AC".toCharArray(), 3, 2));
    }

    private static int LCS1(char[] str1, char[] str2, int l1, int l2) {
        if (l1 == 0 || l2 == 0) {
            return 0;
        }

        if (str1[l1 - 1] == str2[l2 - 1]) {
            return 1 + LCS1(str1, str2, l1 - 1, l2 - 1);
        } else {
            return Math.max(LCS1(str1, str2, l1, l2 - 1), LCS1(str1, str2, l1 - 1, l2));
        }
    }

    private static int LCS2(char[] str1, char[] str2, int l1, int l2) {
        int[][] result = new int[l1 + 1][l2 + 1];

        for (int i = 0; i <= l1; i++) {
            for (int j = 0; j <= l2; j++) {
                if (i == 0 || j == 0) {
                    result[i][j] = 0;
                } else if (str1[i - 1] == str2[j - 1]) {
                    result[i][j] = result[i - 1][j - 1] + 1;
                } else {
                    result[i][j] = Math.max(result[i][j - 1], result[i - 1][j]);
                }
            }
        }

        return result[l1][l2];
    }
}
