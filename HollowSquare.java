import java.util.*;

public class HollowSquare{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        String spaces = "  ".repeat(a-2);
        for(int i = 1;i<=a;i++){
            System.out.print("* ");
        }
        System.out.println();
        for(int j = 1;j<=a-2;j++){
            System.out.println("* "+spaces+"*");
        }
        
        for(int i = 1;i<=a;i++){
            System.out.print("* ");
        }
        input.close();
        
    }
}