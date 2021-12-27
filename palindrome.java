import java.io.*;

class palindrome {
    public static void main(String[] args) {
        String str1 = args[0];
        String rev = "";
        int l = str1.length();
        System.out.println("********* TO CHECK STRING IS PALINDROME OR NOT ********");
        System.out.println("The string is :: " + str1);
        for (int i = l - 1; i >= 0; i--) {
            rev = rev + str1.charAt(i);
        }
        System.out.println("The reversed string is :: " + rev);
        if (str1.equals(rev)) {
            System.out.println(str1 + " is a palindrome");
        } else {
            System.out.println(str1 + " is not a palindrome");
        }
    }
}