package LeetCode.JulyChallenge;

import Trees.Node;
import Trees.Tree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BottomUpLevelTraversal {
    static List<List<Integer>> list = new ArrayList<List<Integer>>();
    public static void main(String[] args) {
        Tree node = new Tree();
        node.insert(3);
        node.insert(9);
        node.insert(20);
        node.insert(15);
        node.insert(7);

        System.out.println(levelOrderBottom(node.getRoot()));



    }


    private static void helper(Node node, int level){

        if(list.size() == level){
            list.add(new ArrayList<Integer>());
        }

        list.get(level).add(node.getData());
        System.out.println();

        if(node.getLeftChild()!= null){
            helper(node.getLeftChild(),level+1);
        }
        if(node.getRightChild()!= null){
            helper(node.getRightChild(),level+1);
        }
    }
    private static List<List<Integer>> levelOrderBottom(Node root) {

        if(root == null) return list;
        helper(root,0);
        Collections.reverse(list);
        return list;



    }
}
