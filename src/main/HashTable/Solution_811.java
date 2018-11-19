package main.HashTable;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * question: 网站访问次数统计
 * solution: map，注意split函数只能用 "\\." "\\|" 作为分隔符
 * discussion:
 */
public class Solution_811 {
    public List<String> subdomainVisits(String[] cpdomains) {
        Map<String, Integer> map = new HashMap<>();
        List<String> res = new ArrayList<>();
        for (String cpdomain : cpdomains){
            String[] cp = cpdomain.split(" ");
            int count = Integer.valueOf(cp[0]);
            String domain = cp[1];
            String[] subdomains = domain.split("\\.");
            for (int i=0;i<subdomains.length;i++){
                String newDomain = "";
                for (int j=i;j<subdomains.length;j++) {
                    newDomain = newDomain.concat(subdomains[j]);
                    if (j != subdomains.length - 1)
                        newDomain = newDomain.concat(".");
                }
                map.put(newDomain, map.getOrDefault(newDomain, 0) + count);
            }
        }
        for (String key : map.keySet()){
            int value = map.get(key);
            res.add(value + " " + key);
        }
        return res;
    }
}
