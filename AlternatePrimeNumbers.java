import java.util.*;
class AlternatePrimeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int N = input.nextInt(); 
            int count = 0;
        for (int num = 1; num <= N; num++) {

            if (num < 2) {
                continue;
            }
            boolean isPrime = true;
            for (int j = 2; j <= num / 2; j++) {
                if (num % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                count+=1;
                if (count%2!=0){
                System.out.print(num + " ");
                    
                }
            }
            input.close();
        }
    }
}

