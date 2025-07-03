import java.util.*;

public class InvertedLeftHalfPyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i =a;i>=1;i--){
            String spaces = "  ".repeat(a-i);
            System.out.print(spaces);
            for(int j=1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}