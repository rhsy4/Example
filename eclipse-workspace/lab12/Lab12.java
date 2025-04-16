import java.util.Random;
import java.util.Scanner;

public class Lab12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random rand = new Random();
        
        System.out.print("n: ");
        int n = scanner.nextInt();
        int[] numbers = new int[n];
        System.out.println("numbers:");
        for (int i = 0; i < n; i++) {
            numbers[i] = rand.nextInt(100);
            System.out.print(numbers[i] + " ");
        }
        System.out.println("\neven numbers:");
        for (int num=1; num<=n; num++) {
            //if (String.valueOf(num).startsWith("2") && num % 2 == 0) {
            if(numbers[num]!=2 && numbers[num]/10==2 ){
               System.out.println(num);
            }
        }
        
        scanner.close();
    }
}