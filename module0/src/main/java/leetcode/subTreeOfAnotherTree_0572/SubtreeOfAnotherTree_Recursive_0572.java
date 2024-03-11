package leetcode.subTreeOfAnotherTree_0572;

public class SubtreeOfAnotherTree_Recursive_0572 {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        S result = recursiveCheck(root, subRoot, subRoot);
        return S.Equals.equals(result);
    }

    private S recursiveCheck(TreeNode mainTree, TreeNode subTree, final TreeNode subRootHead/*always use this param*/) {
        if (subTree == null && mainTree == null) {
            return S.Equals;
        } else
        if (mainTree == null) {
            return S.LeftNotFound;
        } else
        if(subTree == null) {
            return S.RightNotFound;
        }

        S leftStatus;
        if(mainTree.val == subTree.val) {
            leftStatus = recursiveCheck(mainTree.left, subTree.left, subRootHead);
            if(S.LeftNotFound.equals(leftStatus)) { //instant fail
                return S.LeftNotFound;
            }
            if(S.Equals.equals(leftStatus)) { ////instant success shall go deeper
                return recursiveCheck(mainTree.right, subTree.right, subRootHead);
            }
        }
        //go deeper
        S leftHead = recursiveCheck(mainTree.left, subRootHead, subRootHead);
        if(S.Equals.equals(leftHead)) { //instant success
            return S.Equals;
        }
        if(S.LeftNotFound.equals(leftHead)) { //instant fail
            return S.LeftNotFound;
        }
        //go deeper
        return recursiveCheck(mainTree.right, subRootHead, subRootHead);
    }

    enum S {
        Equals, //instant success
        ValueNotEqual, //go deeper
        LeftNotFound, //instant fail
        RightNotFound //go deeper
    }
}
