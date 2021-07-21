package Strings;

public class ReverseString {
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        reverseString(s);
    }

    public static void reverseString(char[] s) {
        int size = s.length;
        for(int i = 0; i < size / 2; i++){
            swap(s, i, size - 1 - i);
        }
    }

    public static void swap(char[] s, int i, int j){
        char a = s[i];
        s[i] = s[j];
        s[j] = a;
    }
}
