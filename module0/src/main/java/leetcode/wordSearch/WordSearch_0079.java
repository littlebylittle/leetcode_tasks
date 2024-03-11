package leetcode.wordSearch;

public class WordSearch_0079 {
    public boolean exist(final char[][] board, final String word) {
        char[] chars = word.toCharArray();
        int length = board[0].length;
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < length; j++) {
                if (findSubstrRecursive(board, chars, i, j, 0)) return true;
            }
        }
        return false;
    }

    private boolean findSubstrRecursive(final char[][] board, final char[] chars, int iLine, int jColumn, int letterPos) {
        if (board[iLine][jColumn] != chars[letterPos]) {
            return false;
        }
        if (letterPos == chars.length-1) { //we already found all letters; 'a'.length = 1; pos =1 - means we have reach the end of the word
            return true;
        }
        char keepValue = board[iLine][jColumn];
        board[iLine][jColumn] = 0; //to avoid using the same letter; we know chars doesn't use the 0 symbol
        boolean result = (iLine - 1 >= 0 && findSubstrRecursive(board, chars, iLine - 1, jColumn, letterPos + 1)) //go up
                || (iLine + 1 < board.length && findSubstrRecursive(board, chars, iLine + 1, jColumn, letterPos + 1)) // go down
                || (jColumn - 1 >= 0 && findSubstrRecursive(board, chars, iLine, jColumn - 1, letterPos + 1)) // go left
                || (jColumn + 1 < board[0].length && findSubstrRecursive(board, chars, iLine, jColumn + 1, letterPos + 1)); // go right
        board[iLine][jColumn] = keepValue; //return it back;
        return result;
    }
}
