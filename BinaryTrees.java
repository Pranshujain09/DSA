// public class BinaryTrees {
//     // node class will represent single node of the tree
//     static class Node{
//         int data;
//         Node left;
//         Node right;


//         Node(int data){
//             // constructor
//             this.data = data;
//             this.left= null;
//             this.right= null;
//         }

//     }

//     static class BinaryTree{
//         static int idx= -1;
       


//         public static Node buildTree(int nodes[]){
//             idx++;
//             // root node created 
//             if(nodes[idx] == -1 ){
//                 return null;
//             }

//             Node newNode =new Node(nodes[idx]);
//             newNode.left= buildTree(nodes);
//             newNode.right = buildTree(nodes);
//             return newNode;

//         }
//     }

//     public static void main(String arg[]){
//         int nodes[]={1,2,4,-1,-1,5,-1,3,-1,6,-1,-1};
//         BinaryTree tree = new BinaryTree();
//         Node root = tree.buildTree(nodes);
//         System.out.println(root.data);
//     }
    
// }




// CREATING A BINARY TREE

class Node{
    int key;
    Node right;
    Node left;

    Node(int k){
        key=k;
        left=right=null;

    }



//  ******* inorder traversal******

    // static void inorder(Node root){
    //     if(root!=null){
    //         inorder(root.left);
    //         System.out.println(root.key);
    //         inorder(root.right);

    //     }
        
    // }



    //  ******** post order ******

    // static void preorder(Node root){
    //     if(root!=null){
    //         preorder(root.left);
    //         preorder(root.right);
    //         System.out.println(root.key);
           

    //     }
        
    // }

//  ***** preorder ****** 

    static void preorder(Node root){
        if(root!=null){
        
            System.out.println(root.key);
            preorder(root.left);
            preorder(root.right);
           

        }
        
    }


    public static void main(String[]args){
     Node root   =new Node(10);
     
     root.left=new Node(20);
    //  root of left subtree
     root.right=new Node(30);
     preorder(root);


    }
}