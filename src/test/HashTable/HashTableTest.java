package HashTable;

import main.HashTable.Solution_500;
import main.HashTable.Solution_929;
import org.junit.Test;

public class HashTableTest {
    @Test
    public void test_500(){
        Solution_500 s = new Solution_500();
        String[] words = {"Hello","Alaska","Dad","Peace"};
        String[] res = s.findWords(words);
        for (String word : res){
            System.out.println(word);
        }
    }

    @Test
    public void test_929(){
        Solution_929 s = new Solution_929();
        String[] emails = {"test.email+alex@leetcode.com","test.e.mail+bob.cathy@leetcode.com",
                "testemail+david@lee.tcode.com"};
        System.out.println(s.numUniqueEmails(emails));
    }
}
