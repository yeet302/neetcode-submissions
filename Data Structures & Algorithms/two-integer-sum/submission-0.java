class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int needed = 0;
        int[] ans = new int[2];
        for(int i = 0; i < nums.length; i++){
            needed = target - nums[i];
            if(map.containsKey(needed)){
                ans[0] = map.get(needed);
                ans[1] = i;
            }
            map.put(nums[i], i);
        }
        return ans;
    }
}
