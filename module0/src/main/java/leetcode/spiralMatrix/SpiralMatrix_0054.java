package leetcode.spiralMatrix;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class SpiralMatrix_0054 {
    //x,y
    private final Map<String, String> nextMoves = Map.of(
            "toRight", "toDown",
            "toDown", "toLeft",
            "toLeft", "toUp",
            "toUp", "toRight"
    );
    private final Map<String, int[]> coordinatesMap =
        Map.of(
                "toRight", new int[]{1, 0},
                "toDown", new int[]{0, 1},
                "toLeft", new int[]{-1, 0},
                "toUp", new int[]{0, -1}
        );
    private final int VISITED = Integer.MIN_VALUE;

    public List<Integer> spiralOrder(int[][] matrix) {
        int idX = 0, idY = 0;
        String move = "toRight";
        int invalidMoves = 0;
        final List<Integer> result = new ArrayList<>();
        final int width = matrix[0].length;
        final int height = matrix.length;
        do {
            int moveX = coordinatesMap.get(move)[0];
            int moveY = coordinatesMap.get(move)[1];

            //we can move
            if(idX >= 0 && idX < width && idY >=0 && idY  < height
                    && (matrix[idY][idX] != VISITED)) {
                result.add(matrix[idY][idX]);
                invalidMoves = 0;
                matrix[idY][idX] = VISITED;

            } else {
                //go back and try another way
                invalidMoves += 1;
                idX -= moveX;
                idY -= moveY;
                move = nextMoves.get(move);
                moveX = coordinatesMap.get(move)[0];
                moveY = coordinatesMap.get(move)[1];
            }
            idX += moveX; idY += moveY;

        } while(invalidMoves<=4);
        return result;
    }
}
