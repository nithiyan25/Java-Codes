import java.util.*;
class PrintFactors {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();

        for(int i=1;i<=a;i++){
            if (a%i==0){
                System.out.print(i+" ");
            }
        }
        input.close();
    }
}