package xz222az_assign4;

import java.io.*;
import java.util.Scanner;

public class ObscureLovecraft {
    public static void main(String[] args) throws IOException {
        System.out.println("Obscure\n" +
                "=======\n" +
                "1. Make obscure\n" +
                "2. Make readable\n" +
                "3. Print obscure\n" +
                "4. Print readable\n" +
                "0. Exit");

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("==>");
        String answer = sc.nextLine();

        File file = new File("/Users/zhuxiaohe/Desktop/1dv506/lovecraft.txt");
        File obscuredFile = new File("obscured.txt");
        File readableLovecraft = new File("readableLovecraft.txt");


        while (!answer.equals("0")) {
            if (isNumeric(answer)) {
                int in = Integer.parseInt(answer);
                if (in == 1) {
                    Obscure(file, obscuredFile);
                }
                if (in == 2) {
                    Readable(obscuredFile, readableLovecraft);
                }
                if (in == 3) {
                    PrintOb(obscuredFile);
                }
                if (in == 4) {
                    PrintRe(readableLovecraft);
                }
            } else {
                System.out.println("That is not an option.");
            }

            System.out.println();
            System.out.println("Obscure\n" +
                    "=======\n" +
                    "1. Make obscure\n" +
                    "2. Make readable\n" +
                    "3. Print obscure\n" +
                    "4. Print readable\n" +
                    "0. Exit");
            System.out.print("==>");
            answer = sc.nextLine();
        }
        System.out.println("Bye, bye!");

    }

    public static boolean isNumeric(String st) {
        if (!Character.isDigit(st.charAt(0))) {
            return false;
        }
        return true;
    }

    public static void Obscure(File file, File obscuredFile) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader(file));
        BufferedWriter bw = new BufferedWriter(new FileWriter(obscuredFile));
        //prepare to read
        String s = "";
        //read very line until end of the file
        while ((s = br.readLine()) != null) {
            //prepare to write
            StringBuilder st = new StringBuilder();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                ch = (char) (ch + 3);
                st.append(ch);
            }
            bw.write(st.toString());
            bw.newLine();
        }
    }

    public static void Readable(File obscuredFile, File readableLovecraft) throws IOException {
        readableLovecraft.createNewFile();
        if (obscuredFile.exists()) {
            BufferedReader br = new BufferedReader(new FileReader(obscuredFile));
            BufferedWriter bw = new BufferedWriter(new FileWriter(readableLovecraft));
            //prepare to read
            String s = "";
            //read very line until end of the file
            while ((s = br.readLine()) != null) {
                //prepare to write
                StringBuilder st = new StringBuilder();
                for (int i = 0; i < s.length(); i++) {
                    char ch = s.charAt(i);
                    ch = (char) (ch - 3);
                    st.append(ch);
                }
                bw.write(st.toString());
                bw.newLine();
            }
        } else System.out.println("There is no ciphered file");
    }

    public static void PrintOb(File obscuredFile) throws IOException {
        if (obscuredFile.exists()) {
            FileInputStream fin = new FileInputStream(obscuredFile);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader buffReader = new BufferedReader(reader);
            String strTmp = "";
            while ((strTmp = buffReader.readLine()) != null) {
                System.out.println(strTmp);
            }
        } else System.out.println("There is no ciphered file");
    }

    public static void PrintRe(File readableLovecraft) throws IOException {
        if (readableLovecraft.exists()) {
            FileInputStream fin = new FileInputStream(readableLovecraft);
            InputStreamReader reader = new InputStreamReader(fin);
            BufferedReader buffReader = new BufferedReader(reader);
            String strTmp = "";
            while ((strTmp = buffReader.readLine()) != null) {
                System.out.println(strTmp);
            }
        } else System.out.println("There is no readableLovecraft file");
    }
}