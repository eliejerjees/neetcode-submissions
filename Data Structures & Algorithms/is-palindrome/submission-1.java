class Solution {
    public boolean isPalindrome(String s) {
        char[] arr = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
        int len = arr.length;

        for(int l = 0; l < len/2; l++){
            int r = len -1 - l;
            if(arr[l] != arr[r]){
                return false;
            }
        }
        return true;
    }
}
