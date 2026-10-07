class Solution:
    def numIslands(self, grid: List[List[str]]) -> int:
        visited = set()
        islands = 0

        for row in range(len(grid)):
            for col in range(len(grid[0])):
                if grid[row][col] == "1" and (row, col) not in visited:
                    islands += 1
                    self.search(grid, visited, row, col)

        return islands

    def search(self, grid, visited, row, col):
        # out of bounds
        if (
            row < 0
            or row >= len(grid)
            or col < 0
            or col >= len(grid[0])
        ):
            return

        # water or already visited
        if grid[row][col] == "0" or (row, col) in visited:
            return

        visited.add((row, col))

        self.search(grid, visited, row + 1, col)
        self.search(grid, visited, row - 1, col)
        self.search(grid, visited, row, col + 1)
        self.search(grid, visited, row, col - 1)