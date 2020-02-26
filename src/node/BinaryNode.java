package node;

public class BinaryNode {
    // Declaration of variables
    private int value;
    private BinaryNode left;
    private BinaryNode right;
    private int height;
    
    // Setters and getters
    public int getValue() {
        return value;
    }
    
    public void setValue(int value) {
        this.value = value;
    }
    
    public BinaryNode getLeft() {
        return left;
    }
    
    public void setLeft(BinaryNode left) {
        this.left = left;
    }
    
    public BinaryNode getRight() {
        return right;
    }
    
    public void setRight(BinaryNode right) {
        this.right = right;
    }
    
    public int getHeight() {
      return height;
    }
    
    public void setHeight(int height) {
      this.height = height;
    }
    
}
