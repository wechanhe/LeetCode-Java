package main.String;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * Created by wche on 2018/10/25
 * question: Morse-letter
 * solution:
 * discussion:字符串数组
 */
public class Solution_804 {
    public int uniqueMorseRepresentations(String[] words) {
        final String[] morse = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        Set<String> set = new HashSet<>();
        for (String word : words){
            String code = "";
            for (char ch:word.toCharArray()){
                code += morse[ch - 'a'];
            }
            set.add(code);
        }
        return set.size();
    }
}
