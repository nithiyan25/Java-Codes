import java.util.*;
class SmithNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = a;
        int sum = 0;
        int primesum = 0;
        int temp=0;
        boolean isprime;
        if (a == 1) {
            isprime = false;
        } else {
            for (int i = 2; i < a; i++) {
                if (a % i == 0) {
                    temp += 1;
                }
            }
            if (temp == 0) {
                isprime = true;
            } else {
                isprime = false;
            }
        }
        
    if(!isprime){
        while (a != 0) {
            int d = a % 10;
            sum += d;
            a /= 10;
        }
        a = n;
        for (int i = 2; i <= n; i++) {
            while (n % i == 0) {
                if (i >= 10) {
                    int j = i;
                    while (j != 0) {
                        int d = j % 10;
                        primesum += d;
                        j /= 10;
                    }
                } else {
                    primesum += i;
                }
                n = n / i;
            }
        }
        if (sum == primesum) {
            System.out.println("Smith Number :" + a);
        } else {
            System.out.println("Not a Smith Number");
        }
    } else {
        System.out.println("Not a Smith Number (It is a prime number)");
    }
    input.close();
    }
}