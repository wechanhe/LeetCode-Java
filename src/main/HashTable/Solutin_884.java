package main.HashTable;

import java.awt.*;
import java.util.*;
import java.util.List;

/**
 * question: 给定两个句子，查找只在一个句子中出现一次的单词
 * solution: Map
 * discussion: 把两个句子合起来，只出现一次的单词就是满足要求的
 */
public class Solutin_884 {
    public String[] uncommonFromSentences(String A, String B) {
        String[] wordsA = A.split(" "), wordsB = B.split(" ");
        List<String> list = new ArrayList<>();
        Map<String,Integer> mapA = new HashMap<>(), mapB = new HashMap<>();
        for (String word : wordsA)
            mapA.put(word, mapA.getOrDefault(word, 0)+1);
        for (String word : wordsB)
            mapB.put(word, mapB.getOrDefault(word, 0)+1);
        for (String key : mapA.keySet()){
            if (mapA.get(key) > 1 || mapB.getOrDefault(key, 0) > 0)
                mapA.put(key, -1);
        }
        for (String key : mapB.keySet()){
            if (mapB.get(key) > 1 || mapA.getOrDefault(key,0) == -1)
                mapB.put(key, -1);
        }
        for (String key : mapA.keySet()){
            if (mapA.get(key) == 1)
                list.add(key);
        }
        for (String key : mapB.keySet()){
            if (mapB.get(key) == 1)
                list.add(key);
        }
        String[] res = new String[list.size()];
        for (int i=0;i<list.size();i++)
            res[i] = list.get(i);
        return res;
    }

    public String[] discuss(String A, String B){
        Map<String,Integer> map = new HashMap<>();
        ArrayList<String> res = new ArrayList<>();
        for (String word : (A+" "+B).split(" ")){
            map.put(word, map.getOrDefault(word,0)+1);
        }
        for (String key : map.keySet()){
            if (map.get(key) == 1)
                res.add(key);
        }
        return res.toArray(new String[0]);
    }
}
