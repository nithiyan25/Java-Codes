import java.util.*;
class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = a,count = 0;
        int temp,b=0;
        while(a!=0){
                temp = a%10;
                a/=10;
                count+=1;
        }
        a = c;
        while(a!=0){
                temp = a%10;
                a/=10;
                
                b+=Math.pow(temp,count);
        }
        if (b == c){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        input.close();
    }
}

