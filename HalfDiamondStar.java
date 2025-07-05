import java.util.*;

public class HalfDiamondStar{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 1;i<=a;i++){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = a-1;i>0;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        input.close();
    }
}
