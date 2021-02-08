public class RemoveAllDuplicatesFromString {

    public static void main(String[] args) {
        String str = "aabbxyzpp";

        String finalString = "";
        for (char c : str.toCharArray()) {
            if (!finalString.contains(c + "")) {
                finalString += c;
            }
        }
        System.out.println(finalString);
    }
}
