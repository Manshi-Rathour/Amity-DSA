package Tree;

public class KthAncestor {
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
    public static int kAncestor(Node root, int n, int k){
        if(root == null) return -1;
        if(root.data == n) return 0;

        int leftDist = kAncestor(root.left, n, k);
        int rightDist = kAncestor(root.right, n, k);

        if(leftDist == -1 && rightDist == -1){
            return -1;
        }
        int dist = Math.max(leftDist, rightDist) + 1;
        if(dist == k){
            System.out.println(root.data);
        }
        return dist;
    }
    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        int n = 5;
        int k = 2;

        kAncestor(root, n, k);
    }
}
