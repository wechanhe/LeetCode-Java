package main.HashTable;

import java.util.HashSet;
import java.util.Set;

/**
 * question: 查找email的个数，name部分出现.忽略，出现+忽略后面部分
 * solution: 定义set保存email，使用StringBuilder保存local过滤后的部分
 * discussion:
 */
public class Solution_929 {
    public int numUniqueEmails(String[] emails) {
        Set<String> set = new HashSet<>();
        for(String email : emails){
            int idx = email.indexOf('@'), end = email.length();
            String local = email.substring(0, idx);
            String domain = email.substring(idx, end);
            StringBuilder sb = new StringBuilder();
            for (int i=0;i<local.length();i++) {
                char ch = local.charAt(i);
                if (ch =='+')
                    break;
                else if (ch != '.')
                    sb.append(ch);
            }
            sb.append(domain);
            set.add(sb.toString());
        }
        return set.size();
    }
}
