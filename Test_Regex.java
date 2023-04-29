package A;

import java.util.regex.*;
public class Test_Regex {

    public static boolean isPrimeRegex(String s) {
        return s.matches("(1|(11+?)\\1+)$");
    }
    public static void main(String[] args) {
        String s="Hello World";
        //s = Pattern.compile("\\p{Ll}&&[^m-p]").matcher(s).replaceAll(s);
        s=s.replaceAll("(?<=\\p{Lu})", " ");
        System.out.println(s);

        System.out.println(isPrimeRegex("1111111"));


        String input = "ABcDeFO!";
        String regex = "/[^AEIOU\\d\\s][A-Z]/g";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        int count = 0;
        while (matcher.find()) {
            count++;
        }

        System.out.println(count);
    }
}
