package main.TwoPointer;

/**
 * question:
 * solution:
 * discussion:
 */
public class Solution_925 {
    public boolean isLongPressedName(String name, String typed) {
        for (int i = 0; i < name.length()-1; i++) {
            char ch = name.charAt(i);
            int start = i, count = 1;
            while (name.charAt(i+1) == name.charAt(i)){
                i++;
                count++;
            }
        }
        return false;
    }
}
