package Others;

import java.lang.reflect.Array;
import java.util.*;

public class Solution3 {
    public static int[] getFrequencies(int[] v) {
        // Write Your Code Here
        int x = 0;
        for (int i : v) {
            if (i > x) x = i;
        }
        int[] freq = new int[x];
        for (int i = 0; i < v.length; i++) {
            freq[v[i] - 1]++;
        }
        int max = 0;
        int min = freq.length - 1;
        for (int i = 0; i < freq.length; i++) {
            if (freq[i] != 0 && freq[i] > freq[max]) max = i;

        }
        for (int i = freq.length - 1; i >= 0; i--) {
            if (freq[i] != 0 && freq[i] <= freq[min]) min = i;

        }
        int ans1 = freq[max];
        int ans2 = freq[min];

        if (ans1 != ans2 && ans2 != 0) return new int[]{max + 1, min + 1};
        else return new int[]{max + 1, max + 1};
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i]) && Math.abs(map.get(nums[i]) - i) <= k) return true;
            map.put(nums[i], i);
        }
        return false;
    }

    public static boolean isValidSudoku(char[][] board) {
        Map<Character, Integer> map = new HashMap();
        for (int row = 0; row < board.length; row++) {
            for (int col = 0; col < board[row].length; col++) {
                if (board[row][col] == '.') continue;
                if (map.containsKey(board[row][col])) {
                    if (map.get(board[row][col]) == col)
                        return false;
                } else map.put(board[row][col], col);
            }
        }
        return true;
    }

    public static void main(String[] args) {
//        int[] nums = {7, 9, 9, 15, 5 };//{1, 2, 3, 1, 1, 4}; //{10, 10, 10, 3, 3, 3};// //{11,13 ,3 ,14, 17, 3, 7, 9, 1, 11, 9, 15, 5, 2, 2, 3 };
//        System.out.println(Arrays.toString(getFrequencies(nums)));

        int[] a = {4, 3, 2, 5};
        int zero = 0;
        int nonZero = 0;
        while (zero < a.length - 1 && nonZero < a.length - 1) {
            if (a[zero] != 0) {
                while (zero < a.length - 1 && a[zero] != 0) zero++;
            }
            if (a[nonZero] == 0) {
                nonZero = zero;
                while (nonZero < a.length - 1 && a[nonZero] == 0) nonZero++;
            }

            if (zero < nonZero) {
                int t = a[zero];
                a[zero] = a[nonZero];
                a[nonZero] = t;
                zero++;
            } else nonZero = zero;
        }
//        System.out.println(Arrays.toString(a));

        int[] nums = {1,1};
//        System.out.println(containsNearbyDuplicate(nums, 1));
//        System.out.println(largestRectangleArea(nums));
        char[][] n = {{'5', '3', '.', '.', '7', '.', '.', '.', '.'}
                , {'6', '.', '.', '1', '9', '5', '.', '.', '.'}
                , {'.', '9', '8', '.', '.', '.', '.', '6', '.'}
                , {'8', '.', '.', '.', '6', '.', '.', '.', '3'}
                , {'4', '.', '.', '8', '.', '3', '.', '.', '1'}
                , {'7', '.', '.', '.', '2', '.', '.', '.', '6'}
                , {'.', '6', '.', '.', '.', '.', '2', '8', '.'}
                , {'.', '.', '.', '4', '1', '9', '.', '.', '5'}
                , {'.', '.', '.', '.', '8', '.', '.', '7', '9'}};
//        System.out.println(isValidSudoku(n));
        System.out.println(makeGood("leEeetCode"));

        System.out.println(minRemoveToMakeValid("())()((("));
    }
    public static String minRemoveToMakeValid(String s) {

        //brute Approach
        Stack<Integer> st = new Stack();
        char[] ch = s.toCharArray();
        for(int i=0; i<ch.length; i++){
            if(!st.isEmpty() && ch[i] == ')'){
                st.pop();
            }
            else if(st.isEmpty() && ch[i] == ')') ch[i] = '*';
            else if(ch[i] == '(')st.push(i);
        }
        StringBuilder sb = new StringBuilder();
        for(int i = ch.length-1; i>=0; i--){
            if(ch[i] == '*') continue;
            if(ch[i]!= '(') sb.insert(0, ch[i]);
            else {
                if(st.isEmpty() || (int)st.peek() != i) sb.insert(0,ch[i]);
                else st.pop();
            }
        }
        return sb.toString().toString();
    }

    public static String makeGood(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch >= 'A' && ch<='Z'){ //let say are find 'R' so 'R' + ' ' == 'r'
                if(!st.isEmpty() && st.peek() == ch + ' ') {
                    st.pop();
                    continue;
                }
            }
            else if(ch >= 'a' && ch <= 'z'){ //let say are find 'R' so 'R' - ' ' == 'r'
                if(!st.isEmpty() && st.peek() == ch - ' ') {
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        //we have our ans as characters holdin into this Stack
        StringBuilder res = new StringBuilder();
        while(!st.isEmpty()){
           res.insert(0, st.pop());
        }
        return res.toString();
    }

    public static int largestRectangleArea(int[] heights) {
        /*
        steps -->
         * 1.we find previous smaller position/index & Next smaller position/index for every element
                store it int two different Array
         * 2. Area = (nse[i] - pse[i] - 1 ) x height(i);

        */

        int n = heights.length;
        Stack<Integer> pSt = new Stack<>();
        Stack<Integer> nSt = new Stack<>();
        int[] nse = new int[n];
        int[] pse = new int[n];

        for (int i = 0; i < n; i++) {

            while (!pSt.isEmpty() && heights[pSt.peek()] >= heights[i]) {
                pSt.pop();
            }
            if (pSt.isEmpty()) pse[i] = -1;
            else pse[i] = pSt.peek();
            pSt.push(i);

            while (!nSt.isEmpty() && heights[nSt.peek()] >= heights[n - 1 - i]) {
                nSt.pop();
            }
            if (nSt.isEmpty()) nse[n-i-1] = n;
            else nse[n-i-1] = nSt.peek();
            nSt.push(n - 1 - i);
        }
        System.out.println(Arrays.toString(heights));
        System.out.println(Arrays.toString(pse));
        System.out.println(Arrays.toString(nse));
        int maxArea = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            int area = (nse[i] - pse[i] - 1) * heights[i];
            maxArea = Math.max(maxArea, area);
        }
        return maxArea;
    }
}
