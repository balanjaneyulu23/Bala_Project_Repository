package queue;

import linkedList.SingleLinkedList;

public class QueueByLinkedList {
    // Declaration of variables
    private SingleLinkedList queueLinkedList;
    
    // Initialing Queue
    public QueueByLinkedList() {
        queueLinkedList = new SingleLinkedList();
    }
    
    // Insertion of element in the queue
    public void enQueue(int value) {
        if (queueLinkedList.getHead() == null) {
            queueLinkedList.createSingleLinkedList(value);
        } else {
            queueLinkedList.insertInLinkedList(value, queueLinkedList.getSize());
        }
    }
    
    // Deletion of element from the queue
    public void deQueue() {
        if (queueLinkedList.getHead() == null) {
          System.out.println("Queue is underflow");
          return;
        }
        
        System.out.println(queueLinkedList.getHead().getValue()+" has been deleted Successfully From Queue");
        queueLinkedList.deletionOfNode(0);
    }
    
    // Printing of the queue
    public void printQueue() {
        queueLinkedList.traverseLinkedList();
    }
    
    // Retrieving first element in the queue
    public int peek() {
        if (isQueueEmpty()) {
            System.out.println("Queue underflow error");
            return 0;
        }
        
        return queueLinkedList.getHead().getValue();
    }
    
    // Whether queue is empty or not
    public boolean isQueueEmpty() {
        if (queueLinkedList.getHead() == null) {
            return true;
        }
        
        return false;
    }

}
