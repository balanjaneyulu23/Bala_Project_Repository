package queue;

public class CircularQueueArray {
    // Declaration of variables
    private int top;
    private int start;
    private int[] queueArr;
    
    // Constructor to initialize variables
    public CircularQueueArray(int size) {
        top = start = -1;
        queueArr = new int[size];
    }
    
    // Enter the element in the queue
    public void enQueue(int value) {
         if (queueArr == null) {
             System.out.println("Queue array is not yet created!");
             return;
         } else if(isQueueFull()) {
             System.out.println("Queue is Overflowed");
             return;
         }
         
         initializeStartOfQueue();
         if (top+1 == queueArr.length) {
             top = 0;
         } else {
             top++;
         }
         queueArr[top] = value;
         
    }
    
    // Deletion of element in the queue
    public void deQueue() {
        if (isQueueEmpty()) {
            System.out.println("Queue is Underflow");
        } else 
            queueArr[start] = 0; 
            if(start+1 == queueArr.length) {
               start = 0;
            } else if(start == top) {
                 start = top = -1;
            
            } else {
                 start++; 
             }
    }
    
    
    // Peek operation
    public int peek() {
        if (isQueueEmpty()) {
            System.out.println("Queue is Underflow");
            return 0;
        }
        
        return queueArr[start];
    }
    // initialize start of the queue
    public void initializeStartOfQueue() {
        if (start == -1) {
            start = 0;
        }
    }
    
    // Delete queue
    public void deleteQueue() {
        queueArr = null;
    }
    //Whether Queue is full or not
    public boolean isQueueFull() {
        if (top+1 == start) { // one cycle got complete hence queue is full
            return true;
        } else if(start == 0 && top+1 == queueArr.length) { // start at first cell and top at last cell of queue
            return true;
        }
        return false;
    }
    
    // Whether queue is empty or not
    public boolean isQueueEmpty() {
        if (start == -1 && top == -1) {
            return true;
        }
        
        return false;
    }
    
    // Printing queue
    public void printQueue() {
        int startIndex = start;
        int topIndex = top;
        int size = queueArr.length;
        for (int i = 0; i < size; i++) {
             if (startIndex < size && queueArr[startIndex] !=0) {
                 System.out.println("Queue Value : "+queueArr[startIndex]);
                 startIndex++;
            } else if (topIndex < startIndex && queueArr[topIndex] !=0)  {
                 System.out.println("Queue Value : "+queueArr[topIndex]);
                 topIndex++;  
            }
        }
        
      }
    }
    
