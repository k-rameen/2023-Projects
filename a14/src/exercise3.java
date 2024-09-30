import java.util.Scanner;

public class exercise3 {
    public static boolean match(String str1, String str2) {
        if (str1.isEmpty() && str2.isEmpty()) {
            return true;
        }
        if (str1.isEmpty() || str2.isEmpty()) {
            return false;
        }
        char char1 = str1.charAt(0);
        char char2 = str2.charAt(0);

        if (char1 == '?' || char2 == '?'){
            return match(str1.substring(1), str2.substring(1));
        }
        else if (char1 == char2) {
            return match(str1.substring(1), str2.substring(1));
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        String phrase1 = "MOON";
        String phrase2 = "M??N";

        boolean result1 = match(phrase1, phrase2);
        System.out.println("Match: " + result1);

        String phrase3 = "W?zar?";
        String phrase4 = "?izard";

        boolean result2 = match(phrase3, phrase4);
        System.out.println("Match: " + result2);

        String phrase5 = "???";
        String phrase6 = "???";

        boolean result3 = match(phrase5, phrase6);
        System.out.println("Match: " + result3);

        String phrase7 = "W?zar?";
        String phrase8 = "?izard";

        boolean result4 = match(phrase7, phrase8);
        System.out.println("Match: " + result4);
    }
}
