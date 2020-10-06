package xz222az_assign4;

import java.io.*;
import java.util.Scanner;

public class CountingWords {
    public static void main(String[] args) throws IOException {
        File file = new File("/Users/zhuxiaohe/Desktop/1dv506/lovecraft.txt");
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = br.readLine();
        int count = 0;
        String[] words;

        while(st !=null) {
            words = st.split(" ");
            if (doseCount(st)){
                count += words.length;
            }
            st = br.readLine();
        }
        System.out.println("Number of words: " + count);
        br.close();
    }
    public static boolean doseCount(String st){
        if (!st.isEmpty()) {
            try {
                Integer.parseInt(st.trim());
                return false;
            }
            catch (Exception e){
                return true;
            }
        }
        else
            return false;
    }
}





