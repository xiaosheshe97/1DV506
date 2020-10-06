package xz222az_assign4;

import java.io.*;
import java.util.ArrayList;

public class Frequency {
    public static void main(String[] args) throws IOException {
        long start = System.currentTimeMillis();
        File file = new File("/Users/zhuxiaohe/Desktop/1dv506/lovecraft.txt");
        ArrayList<String> words = new ArrayList<String>();
        BufferedReader br = new BufferedReader(new FileReader(file));
        String line = "";
        String word1 = "";
        String word2 = "";
        int count = 0;
        int maxCount = 0;
        int secondCount = 0;
        int cthulhu = 0;
        int azathoth = 0;
        int necronomicon = 0;

        while((line = br.readLine()) != null) {
            String[] string = line.toLowerCase().trim().split("(,.\\s]+) ");
            for(String s : string){
                words.add(s);
            }
        }
        for(int i = 0; i < words.size(); i++){
            count = 1;
            if(words.get(i).equalsIgnoreCase("Cthulhu"))
                cthulhu++;
            if(words.get(i).equalsIgnoreCase("Azathoth"))
                azathoth ++;
            if(words.get(i).equalsIgnoreCase("Necronomicon"))
                necronomicon++;
            for(int j = i+1; j < words.size(); j++){
                if(words.get(i).equals(words.get(j))){
                    count++;
                }
            }
            if(count > maxCount){
                maxCount = count;
                word1 = words.get(i);
            }
            else if (count>secondCount && count != maxCount) {
                secondCount = count;
                word2 = words.get(i);
            }
        }
        System.out.println("Most common words: " + word1 + " with " + maxCount + " occurrences");
        System.out.println("Second common words: " + word2 + " with " + secondCount + " occurrences");
        System.out.println("Occurrences of \'Cthulhu\':  " + cthulhu);
        System.out.println("Occurrences of \'Azathoth\': " + azathoth);
        System.out.println("Occurrences of \'”Necronomicon\': " + necronomicon);

        long end = System.currentTimeMillis();
        System.out.println("Time is"+ (end - start) / 1000);
    }

}
