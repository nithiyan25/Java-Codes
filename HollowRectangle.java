import java.util.*;
class HollowRectangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        int i, j;
        for (i = 1; i <=a; i++)
        {
            for (j = 1; j <=b; j++)
            {
                if (i == 1 || i ==a || 
                    j == 1 || j ==b)            
                    System.out.print("*");            
                else
                    System.out.print(" ");            
            }
            System.out.println();
        }
        input.close();
    }
}