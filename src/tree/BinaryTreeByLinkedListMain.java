package tree;

public class BinaryTreeByLinkedListMain {

  public static void main(String[] args) {
      BinaryTreeByLinkedList tree = new BinaryTreeByLinkedList();
      for (int i = 1; i <= 10; i++) {
          tree.insert(i*10);        
      }
      tree.deleteTree();
      tree.levelOrderTraversal();
  }

}
