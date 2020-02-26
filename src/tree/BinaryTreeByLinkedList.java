package tree;

import java.util.LinkedList;
import java.util.Queue;

import node.BinaryNode;

public class BinaryTreeByLinkedList {
    
    // Declaration of variables
    public BinaryNode root;

    //Constructor for creating blank Binary Tree
    public BinaryTreeByLinkedList() {
        this.root = null;
    }
    
    // Insert Node to the tree
    public void insert(int value) {
        BinaryNode node = new BinaryNode();
        node.setValue(value);
        if (root == null) {
            root = node;
            System.out.println("New Node has been successfully inserted!");
            return;
        }
        
        // Create blank queue for level traversal of tree to find space to add node
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
           BinaryNode presentNode = queue.remove();
           if (presentNode.getLeft() == null) {
               presentNode.setLeft(node);
               System.out.println("New Node has been successfully inserted!");
               break;
          } else if(presentNode.getRight() == null){
               presentNode.setRight(node);
               System.out.println("New Node has been successfully inserted!");
               break;
          } else {
               queue.add(presentNode.getLeft());
               queue.add(presentNode.getRight());
          }
          
        } // while loop ends
      
    } // Method ends
    
    // Pre-order traversal of a Binary tree
    public void preOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
     
        System.out.println("Value of Node : "+node.getValue());
        preOrderTraversal(node.getLeft());
        preOrderTraversal(node.getRight());
    }
    
    // In-Order Traversal of a Binary Tree
    public void inOrderTraversal(BinaryNode node) {
         if (node == null) {
             return;
        }
         
        inOrderTraversal(node.getLeft());
        System.out.println("Value of Node : "+node.getValue());
        inOrderTraversal(node.getRight());
    }
    
    // Post order Traversal of Binary Tree
    public void postOrderTraversal(BinaryNode node) {
        if (node == null) {
            return;
        }
        
        postOrderTraversal(node.getLeft());
        postOrderTraversal(node.getRight());
        System.out.println("Value of Node : "+node.getValue());
    }
    
    // Level order traversal of queue
    public void levelOrderTraversal( ) {
        // creating the queue
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryNode presentNode = queue.remove();
            System.out.println("Value of Node : "+presentNode.getValue());
            if (presentNode.getLeft()!= null) {
                queue.add(presentNode.getLeft());
            }
            if (presentNode.getRight()!=null) {
                queue.add(presentNode.getRight());
            }
        }
    }
    
    // Search given value in Binary Tree 
    public void search(int value) {
        if (root != null) {
            System.out.println("Binary Tree doesn't exists");
            return;
        }
        
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
           BinaryNode presentNode = queue.remove();
           if (presentNode.getValue() == value) {
               System.out.println("Value found "+value);
               return;
           } else {
               if (presentNode.getLeft()!= null) {
                   queue.add(presentNode.getLeft());
                }
           
               if (presentNode.getRight()!=null) {
                   queue.add(presentNode.getRight());
               }
          }
           
        }
  
        System.out.println("Value "+value+" Not found");
    }
    
    // Delete node from Binary Tree
    public void deleteNodeFromTree(int value) {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        
        while (!queue.isEmpty()) {
          
            BinaryNode presentNode = queue.remove();
            
            if (presentNode.getValue() == value) {
                presentNode.setValue(getDeepestNode().getValue());
                deleteDeepestNode();
                System.out.println("Deleted the Node !!");
                return;
                
            } else {
              
                if (presentNode.getLeft()!= null) {
                   queue.add(presentNode.getLeft());
                }
                if (presentNode.getRight() != null) {
                   queue.add(presentNode.getRight());
                }
            }
        }
      
        System.out.println(value+" Not found in the tree");
    }
    
    // Deletion of entire tree
    public void deleteTree() {
        root = null;
        System.out.println("Binary tree has been deleted successfully!!");
    }
    
    // Delete deepest node of tree
    public void deleteDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        
        BinaryNode previousNode = null, presentNode = null;
        while (!queue.isEmpty()) {
            previousNode = presentNode;
            presentNode = queue.remove();
            
            if (presentNode.getLeft() == null) {
                previousNode.setRight(null);
                break;
            } else if (presentNode.getRight() == null) {
                presentNode.setLeft(null);
                break;
            }
           
            queue.add(presentNode.getLeft());
            queue.add(presentNode.getRight());
        }
    }
    
    // find the deepest node in the tree
    public BinaryNode getDeepestNode() {
        Queue<BinaryNode> queue = new LinkedList<>();
        queue.add(root);
        
        BinaryNode presentNode = null;
        while (!queue.isEmpty()) {
            presentNode = queue.remove();
            if (presentNode.getLeft() != null) {
                queue.add(presentNode.getLeft()); 
            }
            
            if (presentNode.getRight() != null) {
                queue.add(presentNode.getRight());
            }
        }
        
        return presentNode;
    }
}
