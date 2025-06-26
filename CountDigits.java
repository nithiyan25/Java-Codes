import java.util.*;
class CountDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int c = a,count = 0;
        int temp;
        while(a!=0){
                temp = a%10;
                a/=10;
                if (c%temp==0){
                    count+=1;
                }
        }
        System.out.println(count);
        input.close();
    }
}

