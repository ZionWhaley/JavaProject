public class T3 {
    public static void main(String[] args) {

        int[][] Arr = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10},
                {11, 12, 13, 14}
        };
        for (int[] row : Arr) {
            for (int num : row) {
                if (num % 2 == 0) {
                    System.out.print(num + " ");
                }
            }
        }
    }
}
