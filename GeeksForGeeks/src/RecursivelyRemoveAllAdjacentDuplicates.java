public class RecursivelyRemoveAllAdjacentDuplicates {

    public static void main(String[] args) {
        removeAdjacentDuplicates("geeksforgeek", 0);

        removeAdjacentDuplicates("acaaabbbacdddd", 0);
    }

    private static void removeAdjacentDuplicates(String str, int start) {

        if (start >= str.length() - 1) {
            System.out.println(str);
        } else {
            if (str.charAt(start) == str.charAt(start + 1)) {
                int end = start;
                for (int i = start; i < str.length() - 1; i++) {
                    if (str.charAt(i) == str.charAt(i + 1)) {
                        end++;
                    } else {
                        break;
                    }
                }
                str = str.substring(0, start) + str.substring(end + 1);
                start--;
            }
            removeAdjacentDuplicates(str, start + 1);
        }
    }
}
