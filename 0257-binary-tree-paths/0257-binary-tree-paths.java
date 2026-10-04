class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        path(root, "", result);
        return result;
    }

    void path(TreeNode root, String s, List<String> result) {
        if (root == null) return;

        s += root.val;

        if (root.left == null && root.right == null) {
            result.add(s);
            return;
        }

        s += "->";
        path(root.left, s, result);
        path(root.right, s, result);
    }
}