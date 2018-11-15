package main.String;

/**
 * Created by wche on 2018/10/26
 * question: 机器人一系列移动LRUD，判断最后是否回到原点
 * solution: 只要L和R、U和D对称就行了
 * discussion:
 */
public class Solution_657 {
    public boolean judgeCircle(String moves) {
        int left = 0,right = 0,up = 0, down = 0;
        for (char ch:moves.toCharArray())
            switch (ch){
                case 'L':left++;break;
                case 'R':right++;break;
                case 'U':up++;break;
                case 'D':down++;break;
                default:return false;
            }
        if (left != right || up != down) return false;
        return true;
    }
}
