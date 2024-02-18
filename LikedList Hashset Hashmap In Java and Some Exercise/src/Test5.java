
/*
 * Write a java program that ask user to enter 5 english words 
 * Prepare a map where the key: word, value = number of characters in word
 * Example test case is {happy=5, joy=3,......}
 */

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Test5 {
    public static void main(String[] args) {
        HashMap<String, Integer> usw = new HashMap<String, Integer>();

        Scanner s = new Scanner(System.in);

        for(int i=0; i<=5;i++){
            System.out.println("Enter the word: "+ i +": ");
            String word = s.next();

            int count = word.length();
            usw.put(word, count);
        }

        System.out.println("Word Map: ");
        for(String word : usw.keySet()){
            System.out.println(word+": "+usw.get(word));
        }

        for(Map.Entry<String, Integer> e : usw.entrySet()){
            System.out.println(e.getKey()+" -------- "+e.getValue());
        }
    }
}
