package Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
        isAnagram("anagram", "nagaram");
    }

    public static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        Map<Character, Integer> map = new HashMap<>();
        for(int i = 0; i < s.length(); i++){
            char charS = s.charAt(i);
            char charT = t.charAt(i);
            Integer int1 = map.get(charS);
            if(int1 == null){
                map.put(charS, 1);
            } else {
                map.put(charS, int1 += 1);
                if(int1 == 0){
                    map.remove(charS);
                }
            }
            Integer int2 = map.get(charT);
            if(int2 == null){
                map.put(charT, -1);
            } else {
                map.put(charT, int2 -= 1);
                if(int2 == 0){
                    map.remove(charT);
                }
            }
        }
        return map.size() == 0;
    }
}
