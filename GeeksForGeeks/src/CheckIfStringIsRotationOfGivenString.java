public class CheckIfStringIsRotationOfGivenString {

    public static void main(String[] args) {
        System.out.println(check("IndiaVsAustralia", "AustraliaVsIndia"));
        System.out.println(check("IndiaVsEngland", "EnglandIndiaVs"));
    }

    private static boolean check(String original, String rotation) {
        if (original.length() != rotation.length()) {
            return false;
        }

        original += original;
        if (original.indexOf(rotation) == -1) {
            return false;
        }
        return true;
    }
}
