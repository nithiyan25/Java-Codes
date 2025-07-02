import java.util.*;

public class KrishNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = a;
        int sum = 0;
        while(a!=0){
            int temp = a%10;
            a/=10;
            int fact = 1;
            for(int i = 1;i<=temp;i++){
                fact*=i;
            }
            sum+=fact;
        }
        if (sum==c){
            System.out.println("Krish");
        }
        else{
            System.out.println("Not Krish");
        }
        input.close();
    }
}
