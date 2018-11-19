package HashTable;

import main.HashTable.Solution_18;
import main.HashTable.Solution_500;
import org.junit.Test;

import java.util.List;

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
    public void test_18(){
        Solution_18 s = new Solution_18();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> res = s.fourSum(nums, target);
        for (int i=0;i<res.size();i++){
            List<Integer> list = res.get(i);
            for (int j=0;j<list.size();j++){
                System.out.print(list.get(j)+" ");
            }
            System.out.println();
        }
    }
}
