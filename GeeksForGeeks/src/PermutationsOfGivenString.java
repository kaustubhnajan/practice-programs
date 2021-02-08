public class PermutationsOfGivenString {

    public static void main(String[] args) {
//        permute("ABC", 0, 2);
//
//        permute("ABSG", 0, 3);

        permuteEasy("", "ABC");

        permuteEasy("", "ABSG");
    }

    private static void permuteEasy(String permutation, String str) {
        if (str.isEmpty()) {
            System.out.println(permutation);
        } else {
            for (int i = 0; i < str.length(); i++) {
                permuteEasy(permutation + str.charAt(i),
                        str.substring(0, i) + str.substring(i + 1));
            }
        }
    }

    private static void permute(String str, int left, int right) {

        if (left == right) {
            System.out.println(str);
        } else {
            for (int i = left; i <= right; i++) {
                str = swapChars(str, left, i);
                permute(str, left + 1, right);
                str = swapChars(str, i, left);
            }
        }
    }

    private static String swapChars(String str, int i, int j) {
        char[] charArray = str.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}
