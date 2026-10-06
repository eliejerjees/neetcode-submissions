class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] str = s.toCharArray();
        int count = 0, max = 0;

        if(s.length() == 1){
            return 1;
        }

        for(int i = 0; i < s.length(); i++){
            for(int j = i; j < s.length(); j++){
                if(map.containsKey(str[j])){
                    if(count > max){
                        max = count;
                    }
                    count = 0;
                    map.clear();
                    break;
                }
                map.put(str[j], 1);
                count++;
            }
        }
        return max;
    }
}
