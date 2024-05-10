package DataStructures.Queues;

import java.util.*;

class MyCircularQueue {
    int[] dataSet;
    int head;
    int tail;
    int size;
    public MyCircularQueue(int k) {
        dataSet = new int[k];
        Arrays.fill(dataSet, -1);
        size = head = tail = 0;
        
    }
    
    public boolean enQueue(int value) {
        if(isFull()) return false;
        dataSet[tail++] = value;
        if(tail == dataSet.length) tail = 0;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        size--;
        dataSet[head++] = -1;
        if(head == dataSet.length) head = 0;
        return true;
    }
    
    public int Front() {
        if(isEmpty()) return -1;
        return dataSet[head];
    }
    
    public int Rear() {
       if(isEmpty()) return -1;
       if(tail == 0) return dataSet[dataSet.length -1];
       return dataSet[tail-1];
    }
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public boolean isFull() {
        return size == dataSet.length;
    }

    public static void main(String[] args) {
        MyCircularQueue obj = new MyCircularQueue(2);
        boolean param_1 = obj.enQueue(1);
        boolean param_2 = obj.enQueue(2);
        boolean param_3 = obj.deQueue();
        boolean param_4 = obj.enQueue(3);
        boolean param_5 = obj.deQueue();
        boolean param_6 = obj.enQueue(3);
        boolean param_7 = obj.deQueue();
        boolean param_8 = obj.enQueue(3);
        boolean param_9 = obj.deQueue();
        int param_10 = obj.Front();
        int param_11 = obj.Rear();
        boolean param_12 = obj.isEmpty();
        boolean param_13 = obj.isFull();
    }
}

