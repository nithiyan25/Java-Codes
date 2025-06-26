import java.util.*;
public class PowerofNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp=0,b=0,c=a;
        while(a!=0){
                temp = a%10;
                b=b*10+temp;
                a/=10;
        }
        temp=0;
        for(int i=0;i<b;i++){
            temp+=c;
        }
        System.out.println(temp);
        input.close();
    }
}