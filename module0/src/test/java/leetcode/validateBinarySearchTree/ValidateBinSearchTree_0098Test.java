package leetcode.validateBinarySearchTree;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidateBinSearchTree_0098Test {
    @Test
    void name() {
        /**
         *                                                    5,
         *                                             /               \
         *                  4 (<<5 left, right>>-999999999),          100(>>>5 right, leftMax<<+9999999999)
         *                  ,                                     /                  \
         *             null null,                   77(leftMaxx<<100, rightMin>>5)              157 (>>5, >>100) +
         *                      6 (<<77 >>5)         <<100, >>77           x                  y
         */

    }
}