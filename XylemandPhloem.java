import java.util.*;

public class XylemandPhloem{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int s1 = 0;
        int s2 = 0;
        s1 = a%10;
        a/=10;
        
        while (a>=10){
            s2+=a%10;
            a/=10;
        }
        s1+=a;
        
        if (s1==s2){
            System.out.println("Xylem");
        }
        else{
            System.out.println("Phloem");
        }
        input.close();
    }
}