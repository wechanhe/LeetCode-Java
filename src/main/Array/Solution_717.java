package main.Array;

/**
 * Created by wche on 2018/10/25
 * question:有两种符号0,10/11，判断给定字符串最后一个0是否代表0
 * solution:if bit[i] == 1 then i+=2 else i+=1;
 * discussion:
 */
public class Solution_717 {
    public boolean isOneBitCharacter(int[] bits) {
        int i = 0;
        if(bits.length == 1 && bits[0] == 0)
            return true;
        while (i<bits.length-1) {
            if (bits[i] == 1) i += 2;
            else i += 1;
        }
        if (i != bits.length-2 && i != bits.length-1)return false;
        return true;
    }
    public boolean discuss(int[] bits){
        int ones = 0;
        for (int i= bits.length-2;i>=0 && bits[i]!=0;i--)
            ones++;
        if (ones % 2 > 0)return false;
        return true;
    }
}
