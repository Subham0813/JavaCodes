package DataStructures.stacks;
import java.util.*;
import java.util.Stack;
public class cafeteria {
    public static void main(String[] args) {
        int[] stQ= {1,1,0,0};
        int[] sw = {0,1,0,1};
        System.out.println(countStudents(stQ, sw));
        int[] arr = {-2,-2,1,-2};
        System.out.println(Arrays.toString(asteroidCollision(arr)));
    }
    public static int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        int[] result = new int[stack.size()];
        for(int i=result.length-1; i>=0; i--){
            result[i] = stack.pop();
        }
        return result;
    }
    public static int countStudents(int[] stQ, int[] sw) {
        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();
        for(int student : stQ){
            queue.offer(student);
        }
        for(int i = sw.length-1; i>=0; i--){
            stack.push(sw[i]);
        }
        int unable = 0;
        while(!stack.isEmpty() && unable<stack.size()){
            if(Objects.equals(stack.peek(), queue.peek())){
                stack.pop();
                queue.poll();
                unable= 0;
            } else {
                queue.offer(queue.poll());
                unable++;
            }
        }
        return unable;
    }
}
