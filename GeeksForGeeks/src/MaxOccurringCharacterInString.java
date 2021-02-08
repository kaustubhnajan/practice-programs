public class MaxOccurringCharacterInString {

    public static void main(String[] args) {

        String str = "Today is Mondaya";

//        System.out.println((int) 'Z');

        int[] charCount = new int[256];
        for (char c : str.toCharArray()) {
            charCount[c]++;
        }

        int maxCount = -1;
        char result = ' ';
        for (int i = 0; i < str.length(); i++) {
            if (charCount[str.charAt(i)] > maxCount) {
                maxCount = charCount[str.charAt(i)];
                result = str.charAt(i);
            }
        }
        System.out.println(result);
    }
}
