import java.io.*;

class Freq {
    public static void main(String[] args) {
        String str = args[0];
        char ch[] = str.toCharArray();
        int fr[] = new int[256];
        int l = str.length();
        for (int i = 0; i < l; i++) {
            fr[ch[i]]++;
        }
        for (int j = 0; j < 256; j++) {
            if (fr[j] != 0) {
                System.out.println((char) j + " occurs " + fr[j]);
            }
        }
    }
}