class Solution {
    public int[] getConcatenation(int[] nums) {
        int sizeOfArray = nums.length *2;
        int[] ans = new int[sizeOfArray];
        
        for(int i=0; i < sizeOfArray; i++) {
            ans[i] = nums[i % nums.length];
        }
        return ans;

    }
}