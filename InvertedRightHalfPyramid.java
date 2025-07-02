import java.util.*;

public class InvertedRightHalfPyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = a;i>0;i--){
            for (int j = 1;j<=i;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        input.close();
    }
}
