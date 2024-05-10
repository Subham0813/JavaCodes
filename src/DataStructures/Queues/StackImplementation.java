package DataStructures.Queues;

import java.util.Stack;

public class StackImplementation {
    Stack<Integer> mainQueue;
    Stack<Integer> addQueue;
    StackImplementation(){
        mainQueue = new Stack<>();
        addQueue = new Stack<>();
    }
    public void push(int value){
        if(mainQueue.isEmpty()) mainQueue.push(value);
        else{
            while(!mainQueue.isEmpty()){
                addQueue.push((mainQueue.pop()));
            }
            mainQueue.push(value);
            while(!addQueue.isEmpty()){
                mainQueue.push(addQueue.pop());
            }
        }
    }
    public int extract(){
        return mainQueue.pop();
    }
    public int see(){
        return mainQueue.peek();
    }
    public int size(){
        return mainQueue.size();
    }

    public static void main(String[] args) {
        StackImplementation mySt = new StackImplementation();
        mySt.push(9);
        System.out.println(mySt.extract());
        mySt.push(8);
        mySt.push(3);
        mySt.push(2);
        System.out.println(mySt.extract());
        mySt.push(5);
        System.out.println(mySt.see());
        mySt.push(7);
        mySt.push(6);
        System.out.println(mySt.extract());
        System.out.println(mySt.see());
    }
}
