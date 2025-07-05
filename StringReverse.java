import java.util.*;
class StringReverse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String n = "";
        for (int i = a.length()-1;i>=0;i--){
            n+=a.charAt(i);
        }
        System.out.println(n);
        input.close();
    }
}