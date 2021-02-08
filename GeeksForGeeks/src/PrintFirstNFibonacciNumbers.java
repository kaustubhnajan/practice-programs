import java.util.ArrayList;
import java.util.List;

public class PrintFirstNFibonacciNumbers {

    public static void main(String[] args) {

        int[] result = new int[7];
        result[0] = 1;
        result[1] = 1;

        for (int i = 2; i < 7; i++) {
            result[i] = result[i - 1] + result[i - 2];
        }

        for (int i = 0; i < 7; i++) {
            System.out.print(result[i] + " ");
        }
    }

//    private static int printFibonacci(int number, int[] result) {
//
//        if (number == 0 || number == 1) {
//            return 1;
//        } else if (result[number] != -1) {
//            return result[number];
//        } else {
//            result[number] = printFibonacci(number - 1, result) + printFibonacci(number - 2, result);
//            return result[number];
//        }
//    }
}
