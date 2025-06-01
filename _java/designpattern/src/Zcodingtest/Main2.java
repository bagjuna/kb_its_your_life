package Zcodingtest;



public class Main2 {
    static int maxDepth = 0;
    static class Node {
        int value;
        Node left;
        Node right;
        Node(int value) {
            this.value = value;
        }
    }
    public static void main(String[] args) {

        Node root = new Node(1);
        root.left = new Node(2);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right = new Node(3);

        System.out.println(dfs(root, 1));

    }

    static int dfs(Node root,int depth) {
        if (root == null) return 0;
        maxDepth = Math.max(maxDepth, depth);


        int leftDepth = dfs(root.left,depth + 1);
        int rightDepth = dfs(root.right, depth + 1);
        int max = Math.max(leftDepth, rightDepth);
        return Math.max(max, depth);
    }

}
