package Others;// importing the concurrent package
import java.util.concurrent.*;

// a class that implements the Runnable interface and acts as a producer
class Producer implements Runnable {
    // a reference to the shared queue
    private BlockingQueue<String> queue;
    // a constructor that takes the queue as a parameter
    public Producer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    // overriding the run() method
    public void run() {
        try {
            // producing some messages and adding them to the queue
            for (int i = 0; i < 10; i++) {
                String message = "Message " + i;
                System.out.println("Produced: " + message);
                queue.put(message);
                // sleeping for some time
                Thread.sleep(1000);
            }
            // adding a termination message to the queue
            queue.put("END");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// a class that implements the Runnable interface and acts as a consumer
class Consumer implements Runnable {
    // a reference to the shared queue
    private BlockingQueue<String> queue;
    // a constructor that takes the queue as a parameter
    public Consumer(BlockingQueue<String> queue) {
        this.queue = queue;
    }
    // overriding the run() method
    public void run() {
        try {
            // consuming messages from the queue until the termination message is received
            while (true) {
                String message = queue.take();
                if (message.equals("END")) {
                    break;
                }
                System.out.println("Consumed: " + message);
                // sleeping for some time
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

// a class that creates and starts the producer and the consumer threads
public class MessagePassingExample {
    public static void main(String[] args) {
        // creating a BlockingQueue with a capacity of 5
        BlockingQueue<String> queue = new ArrayBlockingQueue<String>(5);
        // creating a Others.Producer object and passing the queue
        Producer producer = new Producer(queue);
        // creating a Others.Consumer object and passing the queue
        Consumer consumer = new Consumer(queue);
        // creating and starting the producer and the consumer threads
        new Thread(producer).start();
        new Thread(consumer).start();
    }
}
