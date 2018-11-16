package main.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * question:判断一个单词能否在键盘的一行敲完
 * solution: Map-key:单词，value:行
 * discussion:
 */
public class Solution_500 {
    public String[] findWords(String[] words) {
        ArrayList<String> a_list = new ArrayList<>();
        Map<Character,Integer> map = new HashMap<>();
        char[][] arr = {
                {'Q','W','E','R','T','Y','U','I','O','P'},
                {'A','S','D','F','G','H','J','K','L'},
                {'Z','X','C','V','B','N','M'}
        };
        for (int i=0;i<arr.length;i++){
            for (int j=0;j<arr[i].length;j++){
                map.put(arr[i][j],i+1);
                map.put((char)(arr[i][j]+32),i+1);
            }
        }
        for(String word : words){
            char[] alphas = word.toCharArray();
            boolean onerow = true;
            for (int i=1;i<alphas.length;i++){
                if (map.get(alphas[i]) != map.get(alphas[i-1])){
                    onerow = false;
                    break;
                }
            }
            if (onerow)
                a_list.add(word);
        }
        String[] res = new String[a_list.size()];
        for (int i=0;i<a_list.size();i++)
            res[i] = a_list.get(i);
        return res;
    }
}
