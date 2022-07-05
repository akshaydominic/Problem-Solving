import java.time.temporal.Temporal;
import java.util.Stack;

public class InOrderTree {
    
    public static void main(String[] args) {
        TreeNode a1 = new TreeNode(1);
        TreeNode root = a1;
        TreeNode a2 = new TreeNode(2);
        TreeNode a3 = new TreeNode(3);
        TreeNode a4 = new TreeNode(4);
        TreeNode a5 = new TreeNode(5);
        TreeNode a6 = new TreeNode(6);
        a1.left = a2;
        a1.right =a3;
        a2.left = a4;
        a2.right = a5;
        a3.left = a6;
        PrintInOrder(root);
        System.out.println();
        PrintPreOrder(root);
    }

    public static void PrintInOrder(TreeNode root){
        TreeNode temp = root;
        Stack<TreeNode> st = new Stack<>();

        while(temp != null || !st.isEmpty()){
            while(temp!=null){
                st.push(temp);
                temp = temp.left;
            }
            temp = st.pop();
            System.out.print(temp.val+" ");
            temp = temp.right;
        }
    }
    public static void PrintPreOrder(TreeNode root){
        TreeNode temp = root;
        Stack<TreeNode> st = new Stack<>();

        st.push(temp);
        while(!st.isEmpty()){
            temp = st.pop();
            System.out.print(temp.val+" ");
            if(temp.right!=null){
                st.add(temp.right);
            }
            if(temp.left!=null){
                st.add(temp.left);
            }
        }
    }
    
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode(int val){
        this.val= val;
        left = null;
        right= null;
    }
}



