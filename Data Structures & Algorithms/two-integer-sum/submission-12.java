class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sum = new int[2];
        int difference;
        
        for(int i = 0; i < nums.length; i++){
            map.put(nums[i], i);
        }

        
        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];
            if(map.containsKey(difference) && i != map.get(difference)){
                sum[0] = i;
                sum[1] = map.get(difference);
                break;
            }
        }
        return sum;
    }
}
