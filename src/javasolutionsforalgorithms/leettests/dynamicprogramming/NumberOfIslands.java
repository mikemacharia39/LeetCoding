package javasolutionsforalgorithms.leettests.dynamicprogramming;

/**
 * Given an m x n 2D binary grid grid which represents a map of '1's (land) and '0's (water), return the number of islands.
 *
 * An island is surrounded by water and is formed by connecting adjacent lands horizontally or vertically.
 * You may assume all four edges of the grid are all surrounded by water.
 *
 * Example 1:
 *
 * Input: grid = [
 *   ["1","1","1","1","0"],
 *   ["1","1","0","1","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","0","0","0"]
 * ]
 * Output: 1
 *
 * Example 2:
 *
 * Input: grid = [
 *   ["1","1","0","0","0"],
 *   ["1","1","0","0","0"],
 *   ["0","0","1","0","0"],
 *   ["0","0","0","1","1"]
 * ]
 * Output: 3
 */
public class NumberOfIslands {

    private void dfsFilling(char[][] grid, int i, int j) {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] != '1') {return;}
        grid[i][j] = '0'; // flood filling, i.e. marking areas as visited
        dfsFilling(grid, i+1, j);
        dfsFilling(grid, i-1, j);
        dfsFilling(grid, i, j-1);
        dfsFilling(grid, i, j+1);
    }
}
