import java.util.*;

public class EmirpNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = a;
        int rev=0;
        int count=0;
        int b=0;
        while(a!=0){
            int temp = a%10;
            rev = rev*10 + temp;
            a/=10;
        }
        
        for(int i = 2;i < c;i++){
            if(c%i==0){
                count+=1;
            }
        }
        if (count==0){
            b+=1;
        }
        count=0;
        for(int i = 2;i < rev;i++){
            if(rev%i==0){
                count+=1;
            }
        }
        if (count==0){
            b+=1;
        }
        if (c==rev){
            b-=1;
        }
        if (b>1){
            System.out.println("Emirp");
        }
        else{
            System.out.println("Not Emirp");
        }
        input.close();
    }
}
