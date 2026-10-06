class Solution {
    public int singleNumber(int[] nums) {
        HashMap<Integer, Integer> repeats = new HashMap<>();
        
        int length = nums.length;
        int amount = 0;

        for(int i : nums){
            if(repeats.containsKey(i)){
                amount = repeats.get(i) + 1;
                repeats.remove(i);
                repeats.put(i, amount);
            } else{
                repeats.put(i, 1);
            }
        }
        
        for(Map.Entry<Integer, Integer> entry : repeats.entrySet())
        {
            if(entry.getValue() != 2){
                return entry.getKey();
            }
        }
        return 2;
    }
}
