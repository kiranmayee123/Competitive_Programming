import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Morse {
    public static void main(String[] args) {
        Scanner v = new Scanner(System.in);
        ArrayList<String> morse = new ArrayList<>();
        for (String line = v.nextLine(); !line.isEmpty(); line = v.nextLine()) {
            morse.add(line);
        }
        String [] morsestring = new String[morse.size()];
        for(int i=0;i<morse.size();i++){
            morsestring[i]=morse.get(i);
    }
    System.out.println(uniqueMorseRepresentations(morsestring));
}
public static int uniqueMorseRepresentations(String[] words) {
         String [] morseCodes = {".-","-...","-.-.","-..",".","..-.","--.","...."
         ,"..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-",
         "..-","...-",".--","-..-","-.--","--.."}; 
         HashSet<String> set = new HashSet<>();
         for(String x : words){ // Handle each word
             String result="";
             for(char y : x.toCharArray()){ // Handle each character
                 result+=morseCodes[y-'a'];
             }
             set.add(result);
         }
         return set.size();   
    }
}