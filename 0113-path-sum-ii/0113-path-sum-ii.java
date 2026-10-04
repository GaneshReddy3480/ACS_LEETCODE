class Solution {
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        path(root, targetSum, new ArrayList<>(), result);
        return result;
    }

    void path(TreeNode root, int sum, List<Integer> list, List<List<Integer>> result) {
        if (root == null) return;

        list.add(root.val);

        if (root.left == null && root.right == null && sum == root.val)
            result.add(new ArrayList<>(list));

        path(root.left, sum - root.val, list, result);
        path(root.right, sum - root.val, list, result);

        list.remove(list.size() - 1);
    }
}