import java.util.Arrays;

public class Anagram {

    public static void main(String[] args) {
        checkAnagram("geeksforgeeks", "forgeeksgeeks");
        checkAnagram("allergy", "allergic");

        checkAnagramOptimized("geeksforgeeks", "forgeeksgeeks");
        checkAnagramOptimized("allergy", "allergic");
    }

    private static void checkAnagramOptimized(String str1, String str2) {
        if (str1.length() == str2.length()) {
            boolean isAnagram = true;
            char[] arr1 = str1.toCharArray();
            char[] arr2 = str2.toCharArray();
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            for (int i = 0; i < arr1.length; i++) {
                if (arr1[i] != arr2[i]) {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }

    private static void checkAnagram(String str1, String str2) {
        if (str1.length() == str2.length()) {
            boolean isAnagram = false;
            for (char c1 : str1.toCharArray()) {
                if (str2.matches(".*" + c1 + ".*")) {
                    isAnagram = true;
                } else {
                    isAnagram = false;
                    break;
                }
            }

            if (isAnagram) {
                for (char c2 : str2.toCharArray()) {
                    if (str1.matches(".*" + c2 + ".*")) {
                        isAnagram = true;
                    } else {
                        isAnagram = false;
                        break;
                    }
                }
            }

            if (isAnagram) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        } else {
            System.out.println("NO");
        }
    }
}
