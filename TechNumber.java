import java.util.*;

public class TechNumber{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int n = a;
        int temp,sum = 0;
        int count = 0;
        while (n!=0)
        {
            n/=10;
            count++;
        }
        n = a;
        if(count%2!=0){
            System.out.println("Not a Tech Number");
        }
        else if(count == 2){
            sum+=a%10;
            a/=10;
            sum+=a;
            if(sum*sum==n){
                System.out.println("Tech Number");
            }
            else{
                System.out.println("Not a Tech Number");
                
            }
        }
        else{
            while (a!=0)
            {
                temp = a%100;
                sum+=temp;
                a/=100;
            }
            
            if(sum*sum==n){
                System.out.println("Tech Number");
            }
            else{
                System.out.println("Not a Tech Number");
            }
        }
        input.close();
    }
}