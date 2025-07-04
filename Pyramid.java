import java.util.*;

public class Pyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 0;i<a;i++){
            String spaces = " ".repeat(i);
            System.out.print(spaces);
            for(int j = i+1;j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        for(int i = a;i>1;i--){
            String spaces = " ".repeat(i-2);
            System.out.print(spaces);
            for(int j = i-1;j<=a;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        input.close();
    }
}