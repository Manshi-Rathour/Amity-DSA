package Tree;

import java.util.ArrayList;

public class MergeTwoBSTs {
    static class Node{
        int data;
        Node left;
        Node right;

        Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }
    public static void getInorder(Node root, ArrayList<Integer> inorder){
        if(root == null){
            return;
        }
        getInorder(root.left, inorder);
        inorder.add(root.data);
        getInorder(root.right, inorder);
    }
    public static ArrayList<Integer> merge(ArrayList<Integer> arr1, ArrayList<Integer> arr2){
        ArrayList<Integer> ans = new ArrayList<>();

        int i1 = 0;
        int i2 = 0;
        while(i1 < arr1.size() && i2 < arr2.size()){
            if(arr1.get(i1) < arr2.get(i2)){
                ans.add(arr1.get(i1));
                i1++;
            }
            else{
                ans.add(arr2.get(i2));
                i2++;
            }
        }

        while(i1 <  arr1.size() ){
            ans.add(arr1.get(i1));
            i1++;
        }

        while(i2 <  arr2.size() ){
            ans.add(arr2.get(i2));
            i2++;
        }
        return ans;
    }
    public static Node createBST(ArrayList<Integer> arr, int start, int end){
        if(start > end){
            return null;
        }

        int mid = (start + end) / 2;
        Node root = new Node(arr.get(mid));
        root.left = createBST(arr, start, mid-1);
        root.right = createBST(arr, mid+1, end);

        return root;
    }

    public static Node mergeBSTs(Node root1, Node root2){
        // get inorder
        ArrayList<Integer> arr1 = new ArrayList<>();
        getInorder(root1, arr1);
        ArrayList<Integer> arr2 = new ArrayList<>();
        getInorder(root2, arr2);

        // merge two sorted arrays
        ArrayList<Integer> merged = merge(arr1, arr2);

        // merged array to balanced BST
        return createBST(merged, 0, merged.size()-1);
    }

    public static void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }
    public static void main(String[] args) {
        Node root1 = new Node(2);
        root1.left = new Node(1);
        root1.right = new Node(4);

        Node root2 = new Node(9);
        root2.left = new Node(3);
        root2.right = new Node(12);

        Node root = mergeBSTs(root1, root2);
        preorder(root);
    }
}
