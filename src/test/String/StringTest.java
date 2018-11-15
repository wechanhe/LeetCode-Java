package test.String;

import main.HashTable.Solution_771;
import main.util.TreeNode;
import main.String.*;
import org.junit.Test;

public class StringTest {
    @Test
    public void test_709(){
        Solution_709 s = new Solution_709();
        String str = new String("Hello");
        System.out.println(s.toLowerCase(str));
    }
    @Test
    public void test_804(){
        Solution_804 s = new Solution_804();
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(s.uniqueMorseRepresentations(words));
    }
    @Test
    public void test_657(){
        Solution_657 s = new Solution_657();
        String moves = new String("DD");
        System.out.println(s.judgeCircle(moves));
    }
    @Test
    public void test_557(){
        Solution_557 s = new Solution_557();
        String str = new String("I am hwc");
        System.out.println(s.discuss(str));
    }
    @Test
    public void test_344(){
        Solution_344 s = new Solution_344();
        String str = new String("I am hwc");
        System.out.println(s.reverseString(str));
    }
    @Test
    public void test_893(){
        Solution_893 s = new Solution_893();
        String[] A = {"a","b","c","a","c","c"};
        System.out.println(s.numSpecialEquivGroups(A));
    }
    @Test
    public void test_824(){
        Solution_824 s = new Solution_824();
        String str = "I speak Goat Latin";
        System.out.println(s.toGoatLatin(str));
    }
    @Test
    public void test_520(){
        Solution_520 s = new Solution_520();
        String str = "Latin";
        System.out.println(s.discuss1(str));
    }
    @Test
    public void test_696(){
        Solution_696 s = new Solution_696();
        String str = "0110001111";
        System.out.println(s.countBinarySubStrings(str));
    }
    @Test
    public void test_788(){
        Solution_788 s = new Solution_788();
        System.out.println(s.rotatedDigits(857));
    }
    @Test
    public void test_606(){
        Solution_606 s = new Solution_606();
        String str = "[1,2,3,4]";
        TreeNode node = TreeNode.mkTree(str);
        System.out.println(s.tree2str(node));
    }
    @Test
    public void test_13(){
        Solution_13 s = new Solution_13();
        String str = "MCMXCIV";
        System.out.println(s.romanToInt(str));
    }
    @Test
    public void test_383(){
        Solution_383 s = new Solution_383();
        String ransomNote = "aa", magazine = "ab";
        System.out.println(s.discuss(ransomNote, magazine));
    }
    @Test
    public void test_387(){
        Solution_387 s = new Solution_387();
        String str = "leetcode";
        System.out.println(s.firstUniqChar(str));
    }
    @Test
    public void test_551(){
        Solution_551 s = new Solution_551();
        String str = "ALLAPPL";
        System.out.println(s.checkRecord(str));
    }
    @Test
    public void test_771(){
        Solution_771 s = new Solution_771();
        String J = "aA", S = "aAAbbbb";
        System.out.println(s.numJewelsInStones(J,S));
    }
}
