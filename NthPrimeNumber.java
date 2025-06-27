import java.util.*;
public class NthPrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt();
        int count = 0;
        int num = 2; 
        int prime = 0;

        while (count < N) {
            boolean isPrime = true;
            for (int i = 2; i <= num / 2; i++) {
                if (num % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count++;
                prime = num;
            }
            num++;
        }

        System.out.println(prime);
        input.close();
    }
}


