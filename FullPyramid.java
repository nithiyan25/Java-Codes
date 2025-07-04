import java.util.*;

public class FullPyramid{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 2*a;i>1;i--){
            
            if(i%2!=0){
                continue;
            }
            else{
                String spaces = " ".repeat(i-2);
                System.out.print(spaces);
            for(int j = i;j<=2*a;j++){
                System.out.print("* ");
            }
                
            }
            System.out.println();
        }
        input.close();
    }
}