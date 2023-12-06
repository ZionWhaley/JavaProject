public class T10 {
    public static void main(String[] args) {

        String[] stringArray = {"Mango", "Peaches", "orange", "Mango", "grape", "Peaches"};
        System.out.println("Duplicate elements in the array");
        for (int i = 0; i < stringArray.length - 1; i++) {
            for (int j = i + 1; j < stringArray.length; j++) {
                if (stringArray[i].equals(stringArray[j])) {
                    System.out.println(stringArray[i]);
                }
            }
        }
    }
}
