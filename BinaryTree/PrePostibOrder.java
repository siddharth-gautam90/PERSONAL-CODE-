// pre order

class Solution {
    public ArrayList<Integer> preorder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.data);
            if(top.right!=null) st.push(top.right);
            if(top.left!=null) st.push(top.left);
        }
        return ans;
    }
}

 /// Post order
class Solution {
    ArrayList<Integer> postOrder(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        st.push(root);
        while(st.size()>0){
            Node top = st.pop();
            ans.add(top.data);
            if(top.left!=null) st.push(top.left);
            if(top.right!=null) st.push(top.right);
        }
        Collections.reverse(ans);
        return ans;
    }
}

class Solution {
    ArrayList<Integer> inOrder(Node root) { // Iterative
        ArrayList<Integer> ans = new ArrayList<>();
        Stack<Node> st = new Stack<>();
        Node curr = root;
        while(st.size()>0 || curr!=null){
            if(curr!=null){
                if(curr.left!=null){
                    st.push(curr);
                    curr = curr.left;
                }
                else{
                    ans.add(curr.data);
                    curr = curr.right;
                }
            }
            else{ // curr == null
                Node top = st.pop();
                ans.add(top.data);
                curr = top.right;
            }
        }
        return ans;
    }
}
