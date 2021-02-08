import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatingCharacterInString {

    public static void main(String[] args) {

        String str = "JavaJ";

//        int nonRepeatingCharIndex = 0;
//        for (int i = 0; i < str.length() - 1; i++) {
//            boolean found = true;
//            for (int j = i + 1; j < str.length(); j++) {
//                if (Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(j))) {
//                    found = false;
//                    break;
//                }
//            }
//            if (found) {
//                nonRepeatingCharIndex = i;
//                break;
//            }
//        }
//
//        System.out.println(str.charAt(nonRepeatingCharIndex));


        Map<Character,Integer> counts = new LinkedHashMap<>(str.length());
        for (char c : str.toCharArray()) {
//            c = Character.toUpperCase(c);
            counts.put(c, counts.containsKey(c) ? counts.get(c) + 1 : 1);
        }

        for (Map.Entry<Character,Integer> entry : counts.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.println(entry.getKey());
                break;
            }
        }
    }
}
