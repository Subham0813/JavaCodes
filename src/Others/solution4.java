package Others;
import java.util.*;
public class solution4 {
    public static void main(String[] args) {
        char[][] arr ={{'1','0'},{'0','1'}};
        System.out.println(maximalRectangle(arr));
    }
    public static int maximalRectangle(char[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        int[][] mat = new int[m][n];
        //copy charArray to int Array for easy calculation
        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                mat[i][j] = matrix[i][j] - '0';
            }
        }

        //doing prefixSum in each cell column wise
        for(int j=0; j<n; j++){
            for(int i=1; i<m; i++){
                if(mat[i][j]>0) mat[i][j] += mat[i-1][j];
            }
        }

        //considering each rows as a histogram chart and trying to find max. area of each rectangle
        int maxArea = 0;
        for(int[] mt : mat){
            maxArea = Math.max(maxArea, largestRectangleArea(mt));
        }
        return maxArea;

    }
    public static int largestRectangleArea(int[] heights) {
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;
        int index = 0;
        while (index < heights.length) {
            if (stack.isEmpty() || heights[index] >= heights[stack.peek()]) {
                stack.push(index);
                index++;
            } else {
                int top = stack.pop();
                int width = stack.isEmpty() ? index : index - stack.peek() - 1;
                maxArea = Math.max(maxArea, heights[top] * width);
            }
        }
        while (!stack.isEmpty()) {
            int top = stack.pop();
            int width = stack.isEmpty() ? index : index - stack.peek() - 1;
            maxArea = Math.max(maxArea, heights[top] * width);
        }
        return maxArea;
    }
}
