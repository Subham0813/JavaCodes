package DataStructures.stacks;

import java.util.*;
import java.util.Stack;

public class QueueImplementation {
    Queue<Integer> mainStack;
    Queue<Integer> addiStack;
    QueueImplementation(){
        mainStack = new LinkedList<>();
        addiStack = new LinkedList<>();
    }
    public void push(int value){
       if(mainStack.isEmpty()) mainStack.offer(value);
       else{
           while(!mainStack.isEmpty()){
               addiStack.offer(mainStack.poll());
           }
           mainStack.offer(value);
           while(!addiStack.isEmpty()){
               mainStack.offer(addiStack.poll());
           }
       }

    }
    public int pop(){
      return mainStack.poll();
    }
    public int peek(){
        return mainStack.peek();
    }
    public int size(){
        return mainStack.size();
    }

    public static void main(String[] args) {
        QueueImplementation myStack = new QueueImplementation();
        myStack.push(4);
        myStack.push(5);
        myStack.push(1);
        myStack.push(3);
        myStack.push(9);
        myStack.push(2);
        System.out.println(myStack);
        System.out.println(myStack.pop());
        System.out.println(myStack.size());
        System.out.println(myStack.peek());

    }
}
