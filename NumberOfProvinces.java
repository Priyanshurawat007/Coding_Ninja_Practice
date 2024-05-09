public class Solution {
    public static int findNumOfProvinces(int[][] roads, int n) {
      boolean[] visited = new boolean[n];
        int provinceCount = 0;
        
        // Iterate over each city
        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                // Found a new province, start DFS from this city
                dfs(i, roads, visited);
                provinceCount++;
            }
        }
        
        return provinceCount;
    }
    
    private static void dfs(int city, int[][] roads, boolean[] visited) {
        // Mark the current city as visited
        visited[city] = true;
        
        // Explore all connected cities (neighbors)
        for (int neighbor = 0; neighbor < roads.length; neighbor++) {
            if (roads[city][neighbor] == 1 && !visited[neighbor]) {
                // Recursively visit the neighbor (connected city)
                dfs(neighbor, roads, visited);
            }
        }
    }
}
