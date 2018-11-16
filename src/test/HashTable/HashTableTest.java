package HashTable;

import main.HashTable.Solution_500;
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
}
