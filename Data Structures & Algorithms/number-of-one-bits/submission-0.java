class Solution {
    public int hammingWeight(int n) {
        int count = 0;

        if((n & 1) == 1){
            count++;
        }

        for (int i = 1; i < 31; i++){
            if(((n >>> i) & 1) == 1){
                count++;
            }
        }
        return count;
    }
}
