package Strings;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidPalindrome {
    public static void main(String[] args) {
        isPalindrome("A man, a plan, a canal: Panama");
    }

    public static boolean isPalindrome(String s) {
        Pattern pattern = Pattern.compile("\\b[a-zA-Z0-9]*\\b");
        StringBuilder stringBuilder = new StringBuilder();
        Matcher matcher = pattern.matcher(s);
        while(matcher.find()){
            stringBuilder.append(matcher.group().toLowerCase());
        }
        int i, j;
        for(i = 0, j = stringBuilder.length() - 1; i < j; i++, j--){
            if(stringBuilder.charAt(i) != stringBuilder.charAt(j)){
                return false;
            }
        }
        return true;
    }
}
