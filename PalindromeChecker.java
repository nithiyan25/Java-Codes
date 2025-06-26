import java.util.*;
public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp,b=0,c=a;
        while(a!=0){
            temp = a%10;
            b=b*10+temp;
            a/=10;
        }
        if(b == c){
            System.out.println("Palindrome");    
        }
        else{
            System.out.println("Not a Palindrome");    
        }
        input.close();
    }
}
