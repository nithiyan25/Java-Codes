import java.util.*;
class ReverseDigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp,b=0;
        while(a!=0){
                temp = a%10;
                b=b*10+temp;
                a/=10;
        }
        System.out.println(b);
        input.close();
    }
}