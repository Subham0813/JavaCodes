package Others;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
        int[] pos={5,98};
        int[] healths = {993,576};
        System.out.println(survivedRobotsHealths(pos, healths, "LR"));
    }

    public static List<Integer> survivedRobotsHealths(int[] pos, int[] healths, String dirs) {
        //Map   key=> pos[i], Value =>  i, healths[i], we'll fetch dirs[i]
        int max = Integer.MIN_VALUE;
        for (int i : pos) {
            if (i > max) max = i;
        }

        TreeMap<Integer , Integer> map = new TreeMap<>();
        for (int i = 0; i < pos.length; i++) {
            map.put(pos[i], i);
        }
        // [10,10,15,12]
        // "R L R L"

        Stack<Integer> st = new Stack<>();
        for (int key : map.keySet()) {
            int robo = map.get(key);
            while (!st.isEmpty()) {
                int health = healths[robo];
                if(health<1) break;
                char dir = dirs.charAt(robo);
                int p_robo = st.peek();
                int p_health = healths[p_robo];
                char p_dir = dirs.charAt(p_robo);
                if (p_dir == 'R' && dir == 'L') {
                    //collison
                    if (health == p_health) {
                        healths[robo] =
                                healths[p_robo] = 0;
                        st.pop();
                    } else if (health > p_health) {
                        healths[robo]--;
                        healths[p_robo] = 0;
                        st.pop();
                    } else {
                        healths[robo] = 0;
                        healths[p_robo]--;
                    }
                } else break;
            }
            if (healths[robo] > 0) st.push(robo);
        }
        List<Integer> res = new ArrayList<>();
        for (int health : healths) {
            if (health > 0) {
                res.add(health);
            }
        }
        return res;
    }


    public static String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        Stack<StringBuilder> st = new Stack<>();

        for (int i = 0; i < path.length(); i++) {
            if (!sb.isEmpty() && path.charAt(i) == '/' && sb.charAt(sb.length() - 1) == '/') {
                continue;
            }

            if (path.charAt(i) == '.') {
                if (i + 1 < path.length() && path.charAt(i + 1) != '.' &&
                        !sb.isEmpty() && sb.charAt(sb.length() - 1) == '.' && sb.length() == 2) {
                    if (!st.isEmpty())
                        st.pop();
                    sb = new StringBuilder();
                    continue;
                }
            } else if (!sb.isEmpty() && path.charAt(i) == '/') {
                if ((sb.charAt(sb.length() - 1) != '/' && sb.charAt(sb.length() - 1) != '.')
                        || (sb.charAt(sb.length() - 1) == '.' && sb.length() > 3)) {

                    st.push(new StringBuilder(sb));
                    sb = new StringBuilder();
                } else sb = new StringBuilder();
            }

            sb.append(path.charAt(i));
        }

        if(st.isEmpty()) return sb.toString();

        if(!sb.isEmpty()) {
            if(sb.charAt(sb.length() -1) == '/')
                sb.deleteCharAt(sb.length() -1);
            else if(sb.compareTo(new StringBuilder("/..")) == 0){
                if(!st.isEmpty()) st.pop();
                sb = new StringBuilder();
            }
            else if(sb.compareTo(new StringBuilder("/.")) == 0){
                sb = new StringBuilder();
            }
        }
        while (!st.isEmpty()) {
            sb = st.peek().append(sb);
            st.pop();
        }
        return sb.toString();
    }

    public static int maximumGain(String s, int x, int y) {
        StringBuilder sb = new StringBuilder(s);
        int max = Math.max(x,y);
        int min = Math.min(x,y);
        int points = 0;

        String maxSt = "";
        if(max == x) maxSt = "ab";
        else maxSt = "ba";

        while(sb.length() > 0){
            boolean found = false;
            for(int i=0; i<sb.length() -1; i++){
                if(sb.charAt(i) == maxSt.charAt(0) && sb.charAt(i+1) == maxSt.charAt(1)) {
                    points += max;
                    found = true;
                    sb.delete(i, i+2);
                }
            }

            if(!found) break;
        }

        String minSt = "";
        if(min == x) minSt = "ab";
        else minSt = "ba";

        while(sb.length() > 0 ){
            boolean found = false;
            for(int i=0; i<sb.length() -1; i++){
                if(sb.charAt(i) == minSt.charAt(0) && sb.charAt(i+1) == minSt.charAt(1)) {
                    points += min;
                    found = true;
                    sb.delete(i, i+2);
                }
            }

            if(!found) break;
        }

        return points;
    }
    public static String reverseParentheses(String s) {

        Stack<String> stack = new Stack<>();
        StringBuilder res = new StringBuilder();

        for(char ch : s.toCharArray()){

            if(stack.isEmpty() || ch == '(' || (ch >= 'a' && ch <= 'z')) stack.push(String.valueOf(ch));

            else if(ch == ')'){

                while(!stack.isEmpty()){

                    if(Objects.equals(stack.peek(), String.valueOf('('))){

                        stack.pop();
                        stack.push(res.toString());
                        res = new StringBuilder();
                        break;

                    }

                    else res.append(stack.pop());
                }
            }
        }

        while(!stack.isEmpty()){

            res.insert(0, stack.pop());
        }

        return res.toString();

    }

    public static boolean checkValidString(String s) {
        return helperOfCheckValidString(s,0,0);
    }

    private static boolean helperOfCheckValidString(String s, int i, int balance) {
        if (balance < 0) return false; // More ')' than '(' and '*' combined
        if (i == s.length()) return balance == 0; // Balance is maintained and end of string reached

        if (s.charAt(i) == '(') {
            return helperOfCheckValidString(s, i + 1, balance + 1);
        } else if (s.charAt(i) == ')') {
            return helperOfCheckValidString(s, i + 1, balance - 1);
        } else { // '*'
            // Try using '*' as ')', '(' and empty string
            if(helperOfCheckValidString(s, i + 1, balance + 1)) return true; // Treat '*' as '('
            else if(helperOfCheckValidString(s, i + 1, balance - 1)) return true; // Treat '*' as ')'
            else return helperOfCheckValidString(s, i + 1, balance); // Treat '*' as ""
        }
        //getting TLE for
    }

    public static List<List<Integer>> generate(int n) {
        List<List<Integer>> list = new ArrayList();
        List<Integer> prev = new ArrayList();
        prev.add(1);
        list.add(prev);
        for(int i=1; i<n; i++){
            List<Integer> curr = new ArrayList();
            for(int j=0; j<=prev.size(); j++){
                if(j==0 || j==i) curr.add(1);
                else curr.add(prev.get(j)+prev.get(j-1));
            }
            list.add(curr);
            prev=curr;
        }
        return list;
    }
    public static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int[][] matrix= new int[rows*cols][];
        int tRow,bRow,lCol,rCol; int count=0;
        tRow=bRow=rStart;
        lCol=rCol=cStart;
        int[][] view = new int[rows][cols];
        view[tRow][lCol]=1;
        matrix[count++]=new int[]{tRow,lCol};
        tRow--;bRow++;lCol--;rCol++;

        while(count<rows*cols){
            //right col
            if(tRow<0) tRow = -1;
            for(int i=tRow+1;  rCol<cols && i<bRow && count<rows*cols; i++){

                matrix[count++]= new int[]{i,rCol};
                view[i][rCol]=count;
            }
            if(++rCol>=cols) rCol=cols;
            //bottom row
            for(int i=rCol-1; bRow<rows && i>lCol && count< rows*cols; i--){

                matrix[count++]= new int[]{bRow,i};
                view[bRow][i]=count;
            }
            if(++bRow>=rows) bRow=rows;
            //left col
            for(int i=bRow-1; lCol>=0 && i>tRow && count<rows*cols; i--){

                matrix[count++]= new int[]{i,lCol};
                view[i][lCol]=count;
            }
            if (--lCol<0) lCol=-1;
            //top row
            for(int i=lCol+1; tRow>=0 && i<rCol && count<rows*cols; i++){

                matrix[count++]=new int[]{tRow,i};
                view[tRow][i]=count;
            } tRow--;

        }
        for(int[] a: view) System.out.println(Arrays.toString(a));
        return matrix;
    }
    static int searchIncr(int target, int[] mountainArr,int st,int en){

        while(st<=en){
            int mid=(st+en)/2;
            int midVal = mountainArr[mid];
            if(midVal==target){
                return mid;
            }else if(midVal<target) st=mid+1;
            else en=mid-1;
        }
        return -1;
    }
    static int searchDecr(int target, int[] mountainArr,int st,int en){

        while(st<=en){
            int mid=(st+en)/2;
            int midVal = mountainArr[mid];
            if(midVal==target){
                return mid;
            }else if(midVal<target) en=mid-1;
            else st=mid+1;
        }
        return -1;
    }
    public static int findInMountainArray(int target, int[] mountainArr) {
        int st=0;
        int en=mountainArr.length-1;
        while(st<en){
            int mid = st+(en-st)/2;
            int mid1=mountainArr[mid];
            int mid2 = mountainArr[mid+1];
            if(mid1<mid2) st=mid+1;
            else en=mid;
        }
        int ans1 = searchIncr(target,mountainArr,0,st);
        if(ans1==-1){
            int ans2= searchDecr(target,mountainArr,st,mountainArr.length-1);
            return ans2;
        }
        return ans1;
    }
    public static String replaceWords(List<String> dictionary, String sentence) {
        StringBuilder s = new StringBuilder();
        StringBuilder res = new StringBuilder();
        for(char c : sentence.toCharArray()){
            if(c != ' '){
                s.append(c);
            }else{
                boolean check = false;
                for(int i = 0; i<dictionary.size(); i++){
                    String st = dictionary.get(i);
                    if(s.toString().contains(st)){
                        res.append(st);
                        check = true;
                        dictionary.remove(i);
                        break;
                    }
                }
                if(!check) res.append(s);
                s = new StringBuilder();
                res.append(c);
            }
        }
        if(!dictionary.isEmpty() && s.toString().contains(dictionary.get(0))) res.append(dictionary.get(0));
        else res.append(s);
        return res.toString();
    }

        public static int compareVersion(String version1, String version2) {
        int i = 0, j = 0;
            int num1 = 0, num2 = 0;
            int f1 = 1, f2 = 1;
            int ans = 0;
            while(i<version1.length() && j<version2.length()){
                while(i<version1.length() && version1.charAt(i)!='.'){
                    if(num1 == 0 && version1.charAt(i) == '0') {
                        i++;
                        continue;
                    }
                    else{
                        num1 = num1 * 10 + (int)(version1.charAt(i) -'0');
                    }
                    i++;
                }
                while(j<version2.length() && version2.charAt(j)!='.'){
                    if(num2 == 0 && version2.charAt(j) == '0') {
                        j++;
                        continue;
                    }
                    else{
                        num2 = num2 * 10 + (int)(version2.charAt(j) -'0');
                    }
                    j++;
                }
                if(num1 == num2){
                    ans = num1 = num2 = 0;
                    i++; j++;
                } else if(num1>num2) return 1;
                else return -1;
            }

            while(i<version1.length()){
                while(i<version1.length() && version1.charAt(i)!='.'){
                    if(num1 == 0 && version1.charAt(i) == '0') {
                        i++;
                        continue;
                    }
                    else{
                        num1 = num1 * 10 + (int)(version1.charAt(i) -'0');
                    }
                    i++;
                }
                if(num1 == num2) {
                    ans = num1 = 0;
                    i++;
                }
                else if(num1>num2) return 1;
                else return -1;
            }

            while(j<version2.length()){
                while(j<version2.length() && version2.charAt(j)!='.'){
                    if(num2 == 0 && version2.charAt(j) == '0'){
                        j++;
                        continue;
                    }
                    else{
                        num2 = num2 * 10 + (int)(version2.charAt(j) -'0');
                    }
                    j++;
                }
                if(num1 == num2) {
                    ans = num2 = 0;
                    j++;
                }
                else if(num1>num2) return 1;
                else return -1;
            }
            return ans;
        }

    private static void helper(int div, String res, String roman){

        while(div>0) {
            res += roman;
            div--;
        }
    }

    public static String intToRoman(int num) {
        String res = "";
        int fact = 1000;
        while(num>0){
            int div = num/fact;
            num %= fact;
            if(fact==1000){
                helper(div, res, "M");
            }
            else if(fact==100){
                //100 to 900
                if(div == 9){
                    res += "CM";
                }else if(div == 4){
                    res += "CD";
                }else if(div >= 5){ //500 - 800
                    res += "D";
                    div %= 5;
                }

                helper(div, res, "C"); //300 -100
            }
            else if(fact==10){
                //10 to 90
                if(div == 9){
                    res += "XC";
                }else if(div == 4){
                    res += "XL";
                }else if(div >= 5){ //50 - 80
                    res += "L";
                    div %= 5;
                }

                helper(div, res, "X"); //30 -10
            }
            else{

                if(div == 9){
                    res += "IX";
                }else if(div == 4){
                    res += "IV";
                }else if(div >= 5){ //5 - 8
                    res += "V";
                    div %= 5;
                }

                helper(div, res, "I"); //3 -1
            }
            fact /= 10;
        }
        return res;
    }
}
