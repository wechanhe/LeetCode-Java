package HashTable;

import main.HashTable.*;
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

    @Test
    public void test_811(){
        Solution_811 s = new Solution_811();
//        String[] cpdomains = {"900 google.mail.com", "50 yahoo.com", "1 intel.mail.com", "5 wiki.org"};
        String[] cpdomains = {"9001 discuss.leetcode.com"};
        for (String cp : s.subdomainVisits(cpdomains)){
            System.out.println(cp);
        }
    }

    @Test
    public void test_884(){
        Solutin_884 s = new Solutin_884();
        String A = "this apple is sweet", B = "this apple is sour";
        String[] res = s.discuss(A, B);
        for (String word : res)
            System.out.println(word);
    }

    @Test
    public void test_461(){
        Solution_461 s = new Solution_461();
        System.out.println(s.hammingDistance(1, 0));
    }
}
