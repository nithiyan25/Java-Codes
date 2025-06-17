import java.util.*;
class BinaryTriangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        for(int i = 1;i<a+1;i++){
            for(int j=0;j<i;j++){
                if ((i+j)%2==0){
                    System.out.print("0");
                }
                else{
                    System.out.print("1");
                }
            }
            System.out.println();
        }
        input.close();
    }
    
}
