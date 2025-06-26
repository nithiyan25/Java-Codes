import java.util.*;
class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        while (a >= 1) {
            i*=a;
            a--;
        }
        System.out.println(i);
        input.close();
    }
}
