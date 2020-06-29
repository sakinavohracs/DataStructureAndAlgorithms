package LeetCode.Trees;

import Trees.Node;
import Trees.Tree;

public class MaximumPathBinarySearchTree {
    public static void main(String[] args) {
        Tree tree = new Tree();
        tree.insert(-10);
        tree.insert(9);
        tree.insert(20);
        tree.insert(7);
        tree.insert(15);
        System.out.println(maxPathSum(tree.getRoot()));
    }


        static int max_sum = Integer.MIN_VALUE;

        public static int max_gain(Node node) {
            if (node == null) {
                System.out.println("in null");
                return 0;
            }

            // max sum on the left and right sub-trees of node

            int left_gain = Math.max(max_gain(node.getLeftChild()), 0);

            int right_gain = Math.max(max_gain(node.getRightChild()), 0);


            // the price to start a new path where `node` is a highest node
            int price_newpath = node.getData() + left_gain + right_gain;


            // update max_sum if it's better to start a new path
            max_sum = Math.max(max_sum, price_newpath);


            // for recursion :
            // return the max gain if continue the same path

            return node.getData() + Math.max(left_gain, right_gain);
        }

        public static int maxPathSum(Node root) {
            //-10
            max_gain(root);
            return max_sum;
        }

}
