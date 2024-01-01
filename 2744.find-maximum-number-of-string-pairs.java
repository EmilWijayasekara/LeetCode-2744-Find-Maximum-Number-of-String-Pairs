/*
 * @lc app=leetcode id=2744 lang=java
 *
 * [2744] Find Maximum Number of String Pairs
 */

// @lc code=start
class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int count=0;
        for (int i = 0; i < words.length; i++) {
            for (int j = i+1; j < words.length; j++) {
                if(words[i].charAt(0)== words[j].charAt(1) && words[i].charAt(1)== words[j].charAt(0)){
                    count++;
                }
            }
        }
        return count;
    }
}
// @lc code=end

