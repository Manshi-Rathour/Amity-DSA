package Tree;

import java.util.*;

public class BinaryTreeB {
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

    static class BinaryTree{
        static int idx = -1;
        public static Node buildTree(int[] nodes){
            idx++;
            if(nodes[idx] == -1){
                return null;
            }

            Node newNode = new Node(nodes[idx]);
            newNode.left = buildTree(nodes);
            newNode.right = buildTree(nodes);

            return newNode;
        }

        public static void preorder(Node root){
            if(root == null){
                return;
            }
            System.out.print(root.data + " ");
            preorder(root.left);
            preorder(root.right);
        }

        public static void inorder(Node root){
            if(root == null){
                return;
            }
            preorder(root.left);
            System.out.print(root.data + " ");
            preorder(root.right);
        }

        public static void postorder(Node root){
            if(root == null){
                return;
            }
            postorder(root.left);
            postorder(root.right);
            System.out.print(root.data + " ");
        }

        public static void levelOrderTraversal(Node root){
            ArrayList<ArrayList<Integer>> result = new ArrayList<>();
            Queue<Node> q = new LinkedList<>();

            if(root != null){
                q.add(root);
            }

            while (!q.isEmpty()){
                int size = q.size();
                ArrayList<Integer> level = new ArrayList<>();

                for(int i=1; i<=size; i++){
                    Node r = q.remove();
                    level.add(r.data);

                    if(r.left != null){
                        q.add(r.left);
                    }
                    if(r.right != null){
                        q.add(r.right);
                    }
                }
                result.add(level);
            }

            System.out.println(result);
        }

        public static int height(Node root) {
            if(root == null){
                return 0;
            }

            int lh = height(root.left);
            int rh = height(root.right);

            return Math.max(lh, rh) + 1;
        }

        public static int countNodes(Node root) {
            if(root == null){
                return 0;
            }
            int lc = countNodes(root.left);
            int rc = countNodes(root.right);

            return lc + rc + 1;
        }
        public static int sum(Node root){
            if(root == null){
                return 0;
            }

            int ls = sum(root.left);
            int rs = sum(root.right);

            return ls + rs + root.data;
        }

        public static int diameter2(Node root){
            if(root == null){
                return 0;
            }

            int ld = diameter2(root.left);
            int lh = height(root.left);
            int rd = diameter2(root.right);
            int rh = height(root.right);

            int selfDiam = lh + rh + 1;

            return Math.max(selfDiam, Math.max(ld, rd));
        }

        static class Info{
            int diam;
            int ht;

            public Info(int diam, int ht){
                this.diam = diam;
                this.ht = ht;
            }
        }

        public static Info diameter(Node root){
            if(root == null){
                return new Info(0, 0);
            }
            Info leftInfo = diameter(root.left);
            Info rightInfo = diameter(root.right);

            int diam = Math.max(Math.max(leftInfo.diam, rightInfo.diam), leftInfo.ht + rightInfo.ht + 1);
            int ht = Math.max(leftInfo.ht, rightInfo.ht) + 1;

            return new Info(diam, ht);
        }

        static class Info2{
            Node node;
            int hd;

            public Info2(Node node, int hd){
                this.node = node;
                this.hd = hd;
            }
        }
        public static void topView(Node root){
            //Level order
            Queue<Info2> q = new LinkedList<>();
            HashMap<Integer, Node> map = new HashMap<>();

            int min = 0, max = 0;
            q.add(new Info2(root, 0));
            q.add(null);

            while(!q.isEmpty()){
                Info2 curr = q.remove();
                if(curr == null){
                    if(q.isEmpty()){
                        break;
                    }else{
                        q.add(null);
                    }
                }
                else{
                    if(!map.containsKey(curr.hd)){
                        map.put(curr.hd, curr.node);
                    }
                    if(curr.node.left != null){
                        q.add(new Info2(curr.node.left, curr.hd - 1));
                        min = Math.min(min, curr.hd - 1);
                    }
                    if(curr.node.right != null){
                        q.add(new Info2(curr.node.right, curr.hd + 1));
                        max = Math.max(max, curr.hd + 1);
                    }
                }
            }

            for(int i=min; i<=max; i++){
                System.out.print(map.get(i).data + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[] nodes = {1, 2, 4, -1, -1, 5, -1, -1, 3, -1, 6, -1, -1};

        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);

        System.out.println(root.data);

        System.out.println("Preorder Traversal: ");
        tree.preorder(root);

        System.out.println();
        System.out.println("Inorder Traversal: ");
        tree.inorder(root);

        System.out.println();
        System.out.println("Postorder Traversal: ");
        tree.postorder(root);

        System.out.println();
        System.out.println("Level Order Traversal: ");
        tree.levelOrderTraversal(root);

        System.out.println();
        System.out.println("Height of the tree: " + tree.height(root));

        System.out.println("Total Nodes: " + tree.countNodes(root));

        System.out.println("Nodes Sum: " + tree.sum(root));

        System.out.println("Diameter: " + tree.diameter2(root));

        System.out.println("Diameter using class: " + tree.diameter(root).diam);

        tree.topView(root);
    }
}
