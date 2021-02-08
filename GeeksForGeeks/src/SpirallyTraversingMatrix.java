public class SpirallyTraversingMatrix {

    public static void main(String[] args) {

        int[][] matrix = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}};
        traversSpirally(3, 3, matrix);
    }

    private static void traversSpirally(int rows, int cols, int[][] matrix) {

        int k = 0;
        int l = rows - 1;
        int m = 0;
        int n = cols - 1;

        while (k < l && m < n) {
            for (int i = m; i <= n; i++) {
                System.out.print(matrix[k][i] + " ");
            }
            k++;

            for (int i = k; i <= l; i++) {
                System.out.print(matrix[i][n - 1] + " ");
            }
            n--;

            if (k < l) {
                for (int i = 0; i <= l; i++) {
                    System.out.print(matrix[k - 1][i] + " ");
                }
                l--;
            }

            if (m < n) {
                for (int i = l - 1; i >= k; --i) {
                    System.out.print(matrix[i][m] + " ");
                }
                m++;
            }
        }
    }
}
