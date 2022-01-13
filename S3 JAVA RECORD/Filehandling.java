import java.io.*;

class Filehandling {
    public static void main(String args[]) throws Exception {
        File inf = new File("Helloworld.java");
        File outf = new File("Pal.java");
        FileReader ins = new FileReader(inf);
        FileWriter outs = new FileWriter(outf);
        int ch = 0;
        while ((ch = ins.read()) != -1) {
            outs.write(ch);
        }
        if (outs != null) {
            System.out.println("Content is writter to file successfully");
        }
        ins.close();
        outs.close();
    }
}