package leetcode.numberOfIslands;

import java.util.Stack;

public class NumberOfIslands_0200 {
    private final Stack<Integer> coordinatesVisit = new Stack<>();
    public int numIslands(char[][] grid) {
        int count = 0;
        final int maxHeight = grid.length;
        final int maxWidth = grid[0].length;
        for (int i = 0; i < maxHeight; i++) {
            for (int j = 0; j < maxWidth; j++) {
                if(grid[i][j] != '1') {
                    continue;
                }
                fillIsland(i, j, grid, maxHeight, maxWidth);
                count++;
            }

        }
        return count;
    }

    private void fillIsland(int i, int j, char[][] grid, final int maxHeight, final int maxWidth) {
        coordinatesVisit.add(i);
        coordinatesVisit.add(j);
        do {
            if(i-1>=0 && grid[i-1][j] == '1') {//add a top cell
                coordinatesVisit.add(i-1);
                coordinatesVisit.add(j);
            }
            if(i+1 < maxHeight && grid[i+1][j] == '1') {//add a bottom cell
                coordinatesVisit.add(i+1);
                coordinatesVisit.add(j);
            }
            if(j-1>=0 && grid[i][j-1] == '1') {//add a left cell
                coordinatesVisit.add(i);
                coordinatesVisit.add(j-1);
            }
            if(j+1 < maxWidth && grid[i][j+1] == '1') {//add a right cell
                coordinatesVisit.add(i);
                coordinatesVisit.add(j+1);
            }
            j = coordinatesVisit.pop();
            i = coordinatesVisit.pop();
            grid[i][j] = '0';
        } while(! coordinatesVisit.empty());
    }
}
