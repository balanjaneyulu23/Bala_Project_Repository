package queue;

public class CircularQueueArrayMain {

  public static void main(String[] args) {
      CircularQueueArray queue = new CircularQueueArray(5);
      queue.enQueue(10);
      queue.enQueue(20);
      queue.enQueue(30);
      queue.enQueue(40);
      queue.enQueue(50);
      System.out.println("Before DeQueue");
      queue.printQueue();
      queue.deQueue();
      queue.deQueue();
      queue.enQueue(100);
      System.out.println("After DeQueue");
      queue.printQueue();
      

  }

}
