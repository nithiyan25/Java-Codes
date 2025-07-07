import java.util.*;

public class OneRotationOfAnother{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        String r = input.nextLine();
        int b = a.length();
        String n = "";
        char c = a.charAt(b-1);
        n+=c;
        for (int i = 0;i<b-1;i++){
            n+=a.charAt(i);
        }
        if(n.equals(r)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
        input.close();
    }
}
