class Solution {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase().replaceAll("[^A-Za-z0-9]", "");
        int len = s.length();

        for(int l = 0; l < len/2; l++){
            int r = len - 1 - l;
            if(s.charAt(l) != s.charAt(r)){
                return false;
            }
        }
        return true;
    }
}
