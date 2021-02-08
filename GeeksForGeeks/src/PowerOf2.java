public class PowerOf2 {

    public static void main(String[] args) {
        checkIfPowerOf2(1);
        checkIfPowerOf2(98);
    }

    private static void checkIfPowerOf2(int number) {
        if (number == 1) {
            System.out.println("Yes");
        } else if (number % 2 == 0) {
            int power = 1;
            while (power < number) {
                power *= 2;
            }

            if (power == number) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        } else {
            System.out.println("No");
        }
    }
}
