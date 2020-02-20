package queue;

public class QueueByLinkedListMain {

  public static void main(String[] args) {
    QueueByLinkedList queue = new QueueByLinkedList();
    queue.enQueue(10);
    queue.enQueue(20);
    queue.enQueue(30);
    queue.enQueue(40);
    queue.enQueue(50);
    System.out.println("Before Deletion of Queue");
    queue.printQueue();
    queue.deQueue();
    queue.deQueue();
    queue.enQueue(100);
    queue.enQueue(200);
    System.out.println("After Deletion of Queue");
    queue.printQueue();
    

  }

}
