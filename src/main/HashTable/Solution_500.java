package main.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * question:判断一个单词能否在键盘的一行敲完
 * solution: Map-key:单词，value:行
 * discussion: 首先确定在哪一行检查，String：toLowerCase，indexOf接口的使用
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
    public String[] discuss(String[] words){
        String[] letters = new String[]{"qwertyuiop","asdfghjkl","zxcvbnm"};
        List<String> ans = new ArrayList<>();
        for (String word : words){
            boolean pass = true;
            int row = 0;
            if (letters[1].indexOf(word.toLowerCase().charAt(0)) >= 0)
                row = 1;
            else if (letters[2].indexOf(word.toLowerCase().charAt(0)) >= 0)
                row = 2;
            for (char c : word.toLowerCase().toCharArray()){
                if (letters[row].indexOf(c) == -1){
                    pass = false;
                    break;
                }
            }
            if (pass)
                ans.add(word);
        }
        return ans.toArray(new String[ans.size()]);
    }
}
