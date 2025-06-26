import java.util.*;
class SquareRoot {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int i = 1;
        while (i * i <= a) {
            i++;
        }
        System.out.println(i - 1);
        input.close();
    }
}