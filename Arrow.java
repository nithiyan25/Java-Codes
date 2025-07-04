import java.util.*;

public class Arrow{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n= a-1;
        for(int i = 1;i<=a;i++){
            System.out.print(" ".repeat(a-(a-i)));
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i =n;i>=1;i--){
            String spaces = " ".repeat(n-(n-i));
            System.out.print(spaces);
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}