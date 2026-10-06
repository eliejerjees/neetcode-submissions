class Solution:
    def lengthOfLongestSubstring(self, s: str) -> int:
        longest = 0
        left = 0
        current_substring = set()

        for right in range(len(s)):
            while s[right] in current_substring:
                current_substring.remove(s[left])
                left += 1

            current_substring.add(s[right])
            longest = len(current_substring) if len(current_substring) > longest else longest
            longest = max(longest, right - left + 1)

        return longest