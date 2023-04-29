package A;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test31 {
    public static void main(String[] args) {
        String text = "+1234.5";
        String regex = "^(\\+\\d+|\\d+)((?=.*(?![,\\.])))";   //   (\\+\\d+|\\d+)(?![\\.])

        if (text.matches(regex)) {
            System.out.println("Đúng");
        } else {
            System.out.println("Sai");
        }
    }
}