import java.util.*;
class PerfectNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp=0;
        for(int i=1;i<a;i++){
            if (a%i==0){
                temp+=i;
            }
        }
        if (temp == a){
            System.out.println("Perfect Number");
        }
        else{
            System.out.println("Not a Perfect Number");
        }
        input.close();
    }
}