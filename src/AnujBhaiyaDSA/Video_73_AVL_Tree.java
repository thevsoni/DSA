package AnujBhaiyaDSA;


import java.util.HashSet;

public class Video_73_AVL_Tree {

    static class Node{
        int data;
        int height;
        Node left;
        Node right;
        Node(int data){
            this.data = data;
            height=1;
        }
    }
    static class AVLTree{
        int height(Node node){
            if(node==null){
                return 0;
            }
            return node.height;
        }
        int max(int a,int b){
            return a>b ? a : b;
        }

        Node rightRotate(Node node){
            Node newNode = node.left;
            Node support = newNode.right;

            //rotate
            newNode.right = node;
            node.left = support;

            node.height = max(height(node.left),height(node.right))+1;
            newNode.height = max(height(newNode.left),height(newNode.right))+1;

            return newNode;

        }


        Node leftRotate(Node node){
            Node newNode = node.right;
            Node support = newNode.left;

            //rotate
            newNode.left = node;
            node.right = support;

            node.height = max(height(node.left),height(node.right))+1;
            newNode.height = max(height(newNode.left),height(newNode.right))+1;

            return newNode;

        }

        int getBalance(Node node){
            if(node==null){
                return 0;
            }
            return height(node.left)-height(node.right);
        }

        Node insert(Node root,int val){
            if(root==null){
                return new Node(val);
            }
            if(root.data>val){
                root.left = insert(root.left,val);
            }else if (root.data<val){
                root.right = insert(root.right,val);
            }else{
                return root;
            }

            //update height
            root.height = 1+max(height(root.left),height(root.right));

            int balance = getBalance(root);

            //if unbalance
            //left left
            if(balance > 1 && val<root.left.data){
                return leftRotate(root);
            }
            //right right
            if (balance < -1 && val>root.right.data){
                return rightRotate(root);
            }
            //left right
            if(balance > 1 && val>root.left.data){
                root.left = leftRotate(root.left);
                return rightRotate(root);
            }
            //right left
            if(balance < -1 && val<root.right.data){
                root.right = rightRotate(root.right);
                return leftRotate(root);
            }

            return root;
        }

        void preOrder(Node root){
            if(root==null){
                return;
            }
            System.out.println(root.data);
            preOrder(root.left);
            preOrder(root.right);
        }


    }
    public static void main(String[] args) {

        int[] nodes = {10,20,30,40,50,25};
        Node root = null;
        AVLTree tree = new AVLTree();
        for(int i=0; i< nodes.length; i++){
            root = tree.insert(root,nodes[i]);
        }
        tree.preOrder(root);
    }
}
