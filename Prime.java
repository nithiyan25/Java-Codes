import java.util.*;
class Prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int temp=0;
        if (a==1){
            System.out.println("False");
        }
        else{
            for(int i=2;i<a;i++){
                  if (a%i==0){
                        temp+=1;
                    }
            }
            if (temp!=0){
                System.out.println("False");
            }
            else{
            System.out.println("True");
                
            }
        }
        input.close();
    }
}