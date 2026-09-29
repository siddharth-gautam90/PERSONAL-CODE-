
import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class BinarySearch {
    public static void main(String[] args) {

    }


    // pre order traversal leetcode problem
     public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> ans= new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
        public void dfs(TreeNode root, List<Integer> ans) {
        if (root == null)return;
        ans.add(root.val);
        dfs(root.left,ans);
        dfs(root.right,ans);
    }
    // in order traversal leetcode problem
    public void dfs(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        dfs(root.left,ans);
        ans.add(root.val);
        dfs(root.right,ans);
    }

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
        // post order traversal leetcode problem
    public void dfs(Node root, ArrayList<Integer> ans) {
        if (root == null) return;
        dfs(root.right, ans);
        dfs(root.left, ans);
        ans.add(root.val);
    }

    ArrayList<Integer> inOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        dfs(root, ans);
        return ans;
    }
    // Mirror tree
    void mirror(Node root) {
        if (root == null)
            return;
        Node temp = root.left;
        root.left = root.right;
        root.right = temp;
        mirror(root.left);
        mirror(root.right);
    }
    // identical trees
    boolean isIdentical(Node p, Node q) {
        if (p == null && q == null)return true;
        if (p == null || q == null)return false;
        if (p.val != q.val)return false;
        if (!isIdentical(p.left, q.left))return false;
        if (!isIdentical(p.right, q.right))return false;
        return true;
    }
    /// symmetric tree ---> 101
    public boolean isSymmentric(TreeNode root) {
        if (root == null)return true;
        return isIdentical(root.left, root.right);
    }
    boolean isIdentical(TreeNode p, TreeNode q) {
        if (p == null && q == null)return true;
        if (p == null || q == null)return false;
        if (p.val != q.val) return false;
        return isIdentical(p.left, q.right) && isIdentical(p.right, q.left);
    }
    //  Path Sum 
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if (root == null)
            return false;
        if (root.left == null && root.right == null) {
            if (targetSum == root.val)
                return true;
            else
                return false;
        }
        return hasPathSum(root.left, targetSum - root.val) || hasPathSum(root.right, targetSum - root.val);
    }
    // root-to-leaf-paths
    // level-order-traversal

     public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> tree = new ArrayList<>();
        if(root == null) return tree;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int levelSize = q.size(); // Freeze current level size before adding children
            List<Integer> currentLevel = new ArrayList<>();
            for(int i = 0; i<levelSize ; i++){
                TreeNode front = q.remove();
                currentLevel.add(front.val);
                if(front.left != null) q.add(front.left);
               if(front.right != null) q.add(front.right);
            }
            tree.add(currentLevel);
        }
        return tree;
    }
        // zig-zag-tree-traversal
      public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
            List<List<Integer>> tree = new ArrayList<>();
            if (root == null) return tree; // handle empty tree
            Queue<TreeNode> q = new LinkedList<>(); // create queue
            q.add(root);
            // Flag to track direction (false = left-to-right, true = right-to-left)
            boolean leftToRight = true;
            while (q.size() > 0) {
                int levelSize = q.size();
                List<Integer> currentLevel = new ArrayList<>();
                for (int i = 0; i < levelSize; i++) {
                    TreeNode front = q.remove();
                    // Insert elements based on current level direction
                    if (leftToRight) currentLevel.add(front.val); // Add to end
                    else currentLevel.add(0, front.val); // Add to front (reverses order)
                    if (front.left != null) q.add(front.left);
                    if (front.right != null) q.add(front.right);
                }
                tree.add(currentLevel);
                leftToRight = !leftToRight; // Flip direction for next level
            }
            return tree;
        }


  // Average of levels of biinary tree 
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> tree = new ArrayList<>();
        if(root == null) return tree;
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        while(q.size() > 0){
            int levelSize = q.size(); // 1. Current level par kitne nodes hain unko count karo
            double sum = 0; // 2. Iss level ka total sum track karne ke liye variable
            for(int i = 0; i < levelSize ; i++ ){
                TreeNode front = q.poll();
                sum += front.val;
                if(front.left != null) q.add(front.left);
                if(front.right != null) q.add(front.right);
            }
            // Average = (Current Level ke saare nodes ki values ka sum) / (Current Level mein kitne nodes hain)
            tree.add(sum / levelSize ) ;// store average 
        }
        return tree;
    }
}
