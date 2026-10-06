class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sum = new int[2];
        int difference;

        for(int i = 0; i < nums.length; i++){
            difference = target - nums[i];

            if(map.containsKey(difference)){
                sum[0] = map.get(difference);
                sum[1] = i;
                break;
            }
            map.put(nums[i], i);
        }
        return sum;
    }
}
