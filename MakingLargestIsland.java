import java.util.*;

public class Solution {

    private static int n;
    private static int[][] directions = {{1, 0}, {-1, 0}, {0, 1}, {0, -1}};
    
    public static int maximumIslandSize(int[][] grid) {
        n = grid.length;
        boolean[][] visited = new boolean[n][n];
        int maxIslandSize = 0;
        Map<Integer, Integer> islandSizes = new HashMap<>();
        int islandId = 2; // Start island ID from 2 because grid contains only 0 and 1

        // First pass to identify all islands and their sizes
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 1 && !visited[i][j]) {
                    int size = dfs(grid, visited, i, j, islandId);
                    islandSizes.put(islandId, size);
                    maxIslandSize = Math.max(maxIslandSize, size);
                    islandId++;
                }
            }
        }

        // Second pass to find maximum island size by changing one '0' to '1'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (grid[i][j] == 0) {
                    Set<Integer> connectedIslands = new HashSet<>();
                    int newSize = 1; // Include the changed cell

                    // Check all 4 directions for connected islands
                    for (int[] dir : directions) {
                        int ni = i + dir[0];
                        int nj = j + dir[1];
                        if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] > 1) {
                            int island = grid[ni][nj];
                            if (connectedIslands.add(island)) {
                                newSize += islandSizes.get(island);
                            }
                        }
                    }
                    maxIslandSize = Math.max(maxIslandSize, newSize);
                }
            }
        }

        return maxIslandSize;
    }

    private static int dfs(int[][] grid, boolean[][] visited, int i, int j, int islandId) {
        int size = 1;
        visited[i][j] = true;
        grid[i][j] = islandId;
        for (int[] dir : directions) {
            int ni = i + dir[0];
            int nj = j + dir[1];
            if (ni >= 0 && ni < n && nj >= 0 && nj < n && grid[ni][nj] == 1 && !visited[ni][nj]) {
                size += dfs(grid, visited, ni, nj, islandId);
            }
        }
        return size;
    }

    public static void main(String[] args) {
        int[][] grid1 = {{0, 1}, {1, 0}};
        System.out.println(maximumIslandSize(grid1)); // Output: 3
        
        int[][] grid2 = {{0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}, {0, 0, 0, 0}};
        System.out.println(maximumIslandSize(grid2)); // Output: 1
    }
}
