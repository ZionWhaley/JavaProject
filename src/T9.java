import java.util.Arrays;

public class T9 {
    public static void main(String[] args) {
            int[] numbers = {12, 53, 84, 20, 15, 70};
            Arrays.sort(numbers);
            int secondLargest;
            if (numbers.length >= 2) {
                secondLargest = numbers[numbers.length - 2];
                System.out.println("The second largest number is: " + secondLargest);
            } else {
                System.out.println("There is no second largest number in the array.");
            }
        }
    }

