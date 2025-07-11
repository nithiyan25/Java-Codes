import java.util.*;
 
public class RomantoInteger {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String roman = input.nextLine();
        int total = 0;
        int prev = 0;
        for (int i = roman.length() - 1; i >= 0; i--) {
            char c = roman.charAt(i);
            int value = 0;
            if (c == 'I') value = 1;
            else if (c == 'V') value = 5;
            else if (c == 'X') value = 10;
            else if (c == 'L') value = 50;
            else if (c == 'C') value = 100;
            else if (c == 'D') value = 500;
            else if (c == 'M') value = 1000;
            if (value < prev) {
                total -= value;
            } else {
                total += value;
                prev = value;
            }
        }
        System.out.println(total);
        input.close();
    }
}
