class Solution:
    def topKFrequent(self, nums: List[int], k: int) -> List[int]:
        frequency = {}
        pq = []
        
        for i in nums:
            if i not in frequency:
                frequency[i] = 1 
            else:
                frequency[i] += 1

        for num, count in frequency.items():
            heapq.heappush(pq, (count, num))

            if len(pq) > k:
                heapq.heappop(pq)

        return [num for count, num in pq]