public class T8 {
    public static void main(String[] args) {
        int[] numbers = {40, 51, 34, 35, 12, 59};


        int max = numbers[0];
        int min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            } else if (numbers[i] < min) {
                min = numbers[i];
            }
        }

        System.out.println("Max number: " + max);
        System.out.println("Min number: " + min);
    }
}


