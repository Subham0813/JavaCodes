package Others;

import java.util.*;

public class Solution2 {
    public static void main(String[] args) {
//        String a ="lisugHW";
//        String[] arr = a.split("ug");
////        System.out.println(Arrays.toString(arr));
////        System.out.println(arr[1]);
////        System.out.println(generate(5));
////        System.out.println(checkValidString("************************************************************"));
//        List<String> dic = new ArrayList<>();
//        dic.add("bat");
//        dic.add("cat");
//        dic.add("rat");
//        System.out.println(replaceWords(dic, "the cattle was rattled by the battery"));
        System.out.println(compareVersion("1.101", "1.100001"));

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
}
