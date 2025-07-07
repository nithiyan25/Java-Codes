import java.util.*;

public class RemovingSpaces{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String a = input.nextLine();
        int b = a.length();
        String c = "";
        for (int i = 0;i<b;i++){
            if(a.charAt(i) ==' '){
                continue;
            }
            else{
                c+=a.charAt(i);
            }
        }
        System.out.println(c);
        input.close();
    }
}
