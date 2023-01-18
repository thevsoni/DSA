package ApnaCollegeDSA;

import java.util.ArrayList;

public class Video_33_BinarySearchTree {
    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
        }
    }
    // build binary search tree
    public static Node insert(Node root,int val){
        if (root==null){
            root = new Node(val);
            return root;
        }
        if (root.data>val){
            root.left = insert(root.left,val);
        }
        else {
            root.right = insert(root.right,val);
        }
        return root;
    }
    // inorder traversal
    public static void inOrder(Node root){
        if (root==null){
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
    // search a node in  BST
    public static boolean searchABST(int subRootData,Node root){
        if (root==null){
            return false;
        }
        if (subRootData==root.data){
            return true;
        }
        else if (subRootData<root.data){
            return searchABST(subRootData,root.left);
        }else {
            return searchABST(subRootData,root.right);
        }
        // else if (){if(searchABST(subRootData,root.left)){
        // return true;}
        // not right bcs isme if condition true nahi hoga to ye false bhi return nhi kr payega is liye not able
        // to write this.

    }


    // delete a node
    public static Node inOrderSequence(Node root){
        while (root.left != null){
            root=root.left;
        }
        return root;
    }
    public static Node deleteNode(Node root,int val){
        if (root.data>val){
            root.left = deleteNode(root.left,val);
        } else if (root.data<val) {
            root.right = deleteNode(root.right,val);
        }else {
            // root.data==val
            //case 1
            if (root.left==null && root.right==null){
                return null;
            }
            //case 2
            if (root.left==null){
                return root.right;
            }else if (root.right==null){
                return root.left;
            }
            //case3
            Node is = inOrderSequence(root.right);
            root.data=is.data;
            root.right = deleteNode(root.right, is.data);
        }
        return root;
    }

    //print in range
    public static void printInRange(Node root,int x,int y){
        if (root==null){
            return;
        }
        if (x<=root.data && root.data<=y){
            printInRange(root.left,x,y);
            System.out.print(root.data+" ");
            printInRange(root.right,x,y);
        }
        else if (y<=root.data){
            printInRange(root.left,x,y);
        }else {
            printInRange(root.right,x,y);
        }
    }
    //root to leaf path
    static ArrayList<Integer> a = new ArrayList<>();

    public static void rootToLeafPath(Node root){
        if (root==null){
            return;
        }
      a.add(root.data);
      if (root.left==null && root.right==null){
          System.out.print(a);
          System.out.println();
      }else {
          rootToLeafPath(root.left);
          rootToLeafPath(root.right);
      }
      a.remove(a.size()-1);
      }
    public static void main(String[] args) {
        //building a binary search tree
     int [] values = {8,5,3,1,4,6,10,11,14};
     Node root = null;
     for (int i=0;i< values.length;i++){
         root = insert(root,values[i]);
     }
      inOrder(root);
        System.out.println();
     //search a BST
        int subRootData = 2;
//        int subRootData = root.left.right.left.data;
        System.out.println(searchABST(subRootData,root));

        //delete a node
        deleteNode(root,4);
        inOrder(root);
        System.out.println();

        //print in a range
        printInRange(root,5,10);
        System.out.println();

        //rot to leaf path
        rootToLeafPath(root);
    }
}
