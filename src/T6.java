import java.util.Scanner;

public class T6 {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Enter positive integer : ");
        int num= scan.nextInt();
        boolean isPrime=true;
        for (int i = 2; i <num ; i++) {
            if (num%i==0){
                isPrime=false;
            }
        }
        System.out.println("The number is Prime? : "+ isPrime);
    }
}
