class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> repeats = new HashSet<Integer>();
        for(int i = 0; i < nums.length; i++){
            if(repeats.contains(nums[i])){
                return true;
            }
            repeats.add(nums[i]);
        }
        return false;
    }
}