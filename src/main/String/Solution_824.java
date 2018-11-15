package main.String;

import java.util.HashSet;
import java.util.Set;

/**
 * Created by wche on 2018/10/26
 * question:
 * solution:
 * discussion:
 */
public class Solution_824 {
    public String toGoatLatin(String S) {
        String[] words = S.split(" ");
        StringBuilder sb = new StringBuilder();
        final Set<Character> vowel = new HashSet<>();
        vowel.add('a');
        vowel.add('A');
        vowel.add('e');
        vowel.add('E');
        vowel.add('i');
        vowel.add('I');
        vowel.add('o');
        vowel.add('O');
        vowel.add('u');
        vowel.add('U');
        for (int i=0;i<words.length;i++){
            String word = words[i];
            if(vowel.contains(word.charAt(0))){ //begins with a vowel
                word += "ma";
            }else {     //begins with a consonant
                char head = word.charAt(0);
                word = word.substring(1,word.length()) + head + "ma";
            }
            for (int j=0;j<=i;j++)
                word += "a";
            sb.append(word+" ");
        }
        return sb.toString().trim();
    }
}
