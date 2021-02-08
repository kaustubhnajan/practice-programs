public class LongestCommonPrefixInAnArray {

    public static void main(String[] args) {
        findLongestCommonPrefix(new String[] {"geeksforgeeks", "geeks", "geek", "geezer"});
        findLongestCommonPrefix(new String[] {"apple", "ape", "april"});
    }

    private static void findLongestCommonPrefix(String[] arr) {

        int i = 0;
        for (; i < arr[0].length(); i++) {
            boolean matches = true;
            for (int j = 1; j < arr.length; j++) {
                if (arr[0].charAt(i) != arr[j].charAt(i)) {
                    matches = false;
                    break;
                }
            }

            if (!matches) {
                break;
            }
        }

        if (i > 0) {
            System.out.println(arr[0].substring(0, i));
        } else {
            System.out.println(-1);
        }
    }
}
