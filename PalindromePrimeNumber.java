import java.util.Scanner;
class PalindromePrimeNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        boolean isPalindrome = true;
        boolean isPrime = true;
        int originalNumber = n;
        int reversedNumber = 0;
        while (n > 0) {
            int digit = n % 10;
            reversedNumber = reversedNumber * 10 + digit;
            n /= 10;
        }
        if (originalNumber != reversedNumber) {
            isPalindrome = false;
        }
        else {
            if (originalNumber < 2) {
                isPrime = false;
            } else {
                for (int i = 2; i < originalNumber; i++) {
                    if (originalNumber % i == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
        }

        if (isPalindrome && isPrime) {
            System.out.println(originalNumber + " is a palindrome prime number.");
        }  
        else{
            System.out.println(originalNumber + " is not a palindrome prime number.");
        }     
        
        input.close();
    }    
}
