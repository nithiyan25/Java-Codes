import java.util.*;

public class Butterfly {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = a-1;
        for (int i = 1; i <= a; i++) {
            String spaces = "  ".repeat(2*a - 2*i);
            System.out.print("* ".repeat(i));
            System.out.print(spaces);
            System.out.println("* ".repeat(i));
        }
        for (int i = n; i >= 1; i--) {
            String spaces = "  ".repeat(2*a - 2*i);
            System.out.print("* ".repeat(i));
            System.out.print(spaces);
            System.out.println("* ".repeat(i));
        }
        input.close();
    }
}
