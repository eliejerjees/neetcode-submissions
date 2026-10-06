class Solution {
    public int[] countBits(int n) {
        int[] numbers = new int[n+1];
        int count;


        for(int j = 0; j <= n; j++) {
            count = 0;
            for (int i = 0; i < 32; i++) {
                if(((j >>> i) & 1) == 1) {
                    count++;
                }
            }
            numbers[j] = count;
        }
        return numbers;
    }
}
