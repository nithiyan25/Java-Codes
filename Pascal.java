import java.util.Scanner;

public class Pascal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        n-=1;

        int value = 1;
        for (int k = 0; k <= n; k++) {
            System.out.print(value + " ");
            value = value * (n - k) / (k + 1); 
        }
        input.close();
    }
}
