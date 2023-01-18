package ApnaCollegeDSA;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.*;

public class Video_32_BinaryTree {

    static class Node{
        int data;
        Node left;
        Node right;
        Node(int data){
            this.data=data;
            this.left=null;
            this.right=null;
        }
    }
    static class BinaryTree{
        static int idx=-1;
        public static Node buildTree(int [] nodes){
            idx++;
            if (nodes[idx]==-1){
                return null;
            }
            Node newNode = new Node(nodes[idx]);
            newNode.left=buildTree(nodes);
            newNode.right=buildTree(nodes);
            return newNode;
        }
    }
    // preorder traversal
    public static void preOrderWithoutNull(Node root){
        if (root==null){
            return;
        }
        System.out.print(root.data+" ");
        preOrderWithoutNull(root.left);
        preOrderWithoutNull(root.right);
    }

    public static void preOrderWithNull(Node root){
        if (root==null){
            System.out.print(-1+" ");
            return;
        }
        System.out.print(root.data+" ");
        preOrderWithNull(root.left);
        preOrderWithNull(root.right);
    }


    //inorder traversal
    public static void inOrderWithoutNull(Node root){
        if (root==null){
            return;
        }
        inOrderWithoutNull(root.left);
        System.out.print(root.data+" ");
        inOrderWithoutNull(root.right);
    }
    public static void inOrderWithNull(Node root){
        if (root==null){
            System.out.print(-1+" ");
            return;
        }
        inOrderWithNull(root.left);
        System.out.print(root.data+" ");
        inOrderWithNull(root.right);
    }

    //postOrder Traversal
    public static void postOrderWithoutNull(Node root){
        if (root==null){
            return;
        }
        postOrderWithoutNull(root.left);
        postOrderWithoutNull(root.right);
        System.out.print(root.data+" ");

    }
    public static void postOrderWithNull(Node root){
        if (root==null){
            System.out.print(-1+" ");
            return;
        }
        postOrderWithNull(root.left);
        postOrderWithNull(root.right);
        System.out.print(root.data+" ");

    }

    //level order Traversal
    public static void levelOrderTraversal(Node root){
        if (root==null){
            return;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        while (! q.isEmpty()){
            Node currNode = q.remove();
            if (currNode==null){
                System.out.println();
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                }
            }else{
                System.out.print(currNode.data+" ");
                if (currNode.left != null){
                    q.add(currNode.left);
                }
                if (currNode.right != null){
                    q.add(currNode.right);
                }
            }
        }
    }

    //Question
    // count of nodes
    public static int countOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int x = countOfNodes(root.left);
        int y = countOfNodes(root.right);
        return x+y+1;
    }

    // Question 2 sum of nodes
    public static int sumOfNodes(Node root){
        if (root==null){
            return 0;
        }
        int x = sumOfNodes(root.left);
        int y = sumOfNodes(root.right);
        return x+y+root.data;
    }

    //Question 3 height of a tree
    public static int heightOfTree(Node root){
        if (root==null){
            return 0;
        }
        int x = heightOfTree(root.left);
        int y = heightOfTree(root.right);
        int z = Math.max(x,y)+1;
        return z;
    }

    //Question 4 Diameter of a tree
    // approach 1 O(n^2)
    public static int DiameterOfTree(Node root){
        if (root==null){
            return 0;
        }
        int diam1 = DiameterOfTree(root.left);
        int diam2 = DiameterOfTree(root.right);
        int diam3 = heightOfTree(root.left)+heightOfTree(root.right)+1;
        return Math.max(diam3,Math.max(diam1,diam2));
    }
    //approach 2 O(n)
    static class TreeInfo{
        int ht;
        int diam;
        TreeInfo(int ht,int diam){
            this.ht=ht;
            this.diam=diam;
        }
    }
    public static TreeInfo diameter2(Node root){
        if (root==null){
            return new TreeInfo(0,0);
        }
        TreeInfo left = diameter2(root.left);
        TreeInfo right = diameter2(root.right);

        int myHeight = Math.max(left.ht,right.ht) +1;

        int diam1 = left.diam;
        int diam2 = right.diam;
        int diam3 = left.ht+right.ht+1;

        int myDiam = Math.max(diam3,Math.max(diam1,diam2));

        TreeInfo myInfo = new TreeInfo(myHeight,myDiam);
        return myInfo;
    }

    //check ,this particular tree is a subtree of a another tree or not ?

    public static boolean isIdentical(Node root,Node subRoot){
        if (root==null && subRoot==null){
            return true;
        }
        if (root==null || subRoot==null){
            return false;
        }
        if (root.data == subRoot.data){
            return isIdentical(root.left,subRoot.left)&&isIdentical(root.right,subRoot.right);
        }
        return false;
    }
    public static boolean isSubTree(Node root , Node subRoot){
        if (subRoot==null){
            return true;
        }
        if (root==null){
            return false;
        }
        if (root.data== subRoot.data){
            if (isIdentical(root, subRoot)){
                return true;
            }
        }
        return isSubTree(root.left,subRoot) || isSubTree(root.right,subRoot);
    }

    // Question sum of nodes of kth level
    public static int sOfNodesOfKthLevel(Node root,int k){
        //if root/1st element is null
        if (root == null){
            System.out.println("there is nothing ");
            return -1;
        }
        Queue<Node> q = new LinkedList<>();
        q.add(root);
        q.add(null);
        int n=1;
        int i=0;
        while (!q.isEmpty()){
            Node newNode = q.remove();

            if (newNode==null){
                if (q.isEmpty()){
                    break;
                }else {
                    q.add(null);
                    n++;
                }
            }else {

                if (n==k){
                    i+= newNode.data;
                }
                if (n>k){
                    break;
                }
                if (newNode.left != null){
                    q.add(newNode.left);
                }
                if (newNode.right != null){
                    q.add(newNode.right);
                }
            }
        }
        return i;
    }

    //search node
    public static boolean searchNode(Node root, int val){

        if (root==null){
            return false;
        }
        if (root.data==val){
            return true;
        }
        // agar main root.data==val ko pahle likh du root==null ke tb jab actual me root==null hoga tb root.data
        // naam ka koi cheez hoga hi nahi isliye ye kaise check krega isliye run time error dega isliye base condition
        // ko sabse phle likha jata hai

        return searchNode(root.left,val) || searchNode(root.right,val);
    }

    public static void main(String[] args) {
        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        int[] nodes = {1,2,4,-1,-1,5,-1,-1,3,-1,6,7,-1,-1,8,-1,-1};
        BinaryTree tree = new BinaryTree();
        Node root = tree.buildTree(nodes);
        System.out.println(root.data);

        //preorder traversal
        System.out.println("preorder traversal");
        preOrderWithoutNull(root);
        System.out.println();
        preOrderWithNull(root);
        System.out.println();

        //inorder traversal
        System.out.println("inorder traversal");
        inOrderWithoutNull(root);
        System.out.println();
        inOrderWithNull(root);
        System.out.println();

        //postorder traversal
        System.out.println("postorder traversal");
        postOrderWithoutNull(root);
        System.out.println();
        postOrderWithNull(root);
        System.out.println();

        //level order traversal
        System.out.println("level order Traversal");
        levelOrderTraversal(root);


        // questions
        // Question 1 count of Nodes
        System.out.println("count of nodes");
        System.out.println(countOfNodes(root));

        //Question 2 sum of nodes
        System.out.println("sum of nodes");
        System.out.println(sumOfNodes(root));

        //Question 3. Height of a tree
        System.out.println("height of a tree");
        System.out.println(heightOfTree(root));

        //Diameter of tree
        //using O(n^2)
        System.out.println("Diameter of a tree using O(n^2)");
        System.out.println(DiameterOfTree(root));

        //using O(n)
        System.out.println("Diameter of a tree using O(n)");
        System.out.println(diameter2(root).diam);

        //check ,this particular tree is a subtree of a another tree or not ?
        Node subTree = root.left;
        System.out.println(isSubTree(root,subTree));

        //sum of nodes of kth level
        System.out.println("sum of nodes of kth level");
        System.out.println(sOfNodesOfKthLevel(root,3));

        //search a node , is it present or not
        System.out.println(searchNode(root,2));

    }
}
