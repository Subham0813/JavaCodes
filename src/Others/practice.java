package Others;

import java.util.*;

public class practice {
//    public static void main(String[] args) {
//        int[] arr = {-2,0,10,-19,4,6,-8};
//        System.out.println(checkIfExist(arr));
//    }
    public static void main(String[] args) {
        // Write your code here
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int n = 1634;
//        int ans =n, sum=0;
//        int count = 0;
//        while(ans>0){
//            count++;
//            ans/=10;
//        }
//        ans =n;
//        while(ans>0){
//            int rem = ans%10;
//            ans /=10;
//            int temp =1;
//            for(int i =0; i<count; i++)
//                temp *=rem;
//            sum += temp;
//        }
//        if(sum==n)System.out.println(true);
//        else System.out.println(false);
//int n =3;
//        int ans=0;
//        for(int i =1; i<=n; i++){
//            int div =i;
//            while(div>0){
//                if(i%div == 0) ans += div;
//                div--;
//            }
//        }
//        System.out.println(ans);

//        int[] nums1 = {1,4,7,0,0};
//        int[] nums2 = {2,5};
//        merge(nums1,3,nums2,2);
//        System.out.println(Arrays.toString(nums1));

//        List<List<String>> list = new ArrayList<>();
//        String[] strs = {"eat","tea","tan","ate","nat","bat"};
//        String[] sorted = new String[strs.length];
//
//        for(int i=0; i<strs.length; i++){
//            char[] s = strs[i].toCharArray();
//            Arrays.sort(s);
//            sorted[i] = String.valueOf(s);
//        }
//        Arrays.sort(sorted);
//        System.out.println(Arrays.toString(sorted));
//
//        for(String str : sorted) {
//            List<String> temp = new ArrayList();
//            for(int i=0; i<strs.length;i++){
//                if(strs[i]!="-1" && isAnagram(str,strs[i])){
//                    temp.add(strs[i]);
//                    strs[i] = "-1";
//                }
//            }
//            if(temp.size()>0)list.add(new ArrayList<>(temp));
//            temp.clear();
//        }
//        System.out.println(list);
//
//        int[] arr = {1,547,332,246,79,353,414,680,314,98,409,525,655,319,49,35,331,689,128,691,164,365,191,630,266,151,475,437,646,661,348,91,597,244,381,667,31,240,568,33,588,632,517,27,670,447,610,549,84,297,53,122,433,94,184,243,625,676,237,315,254,692,572,575,340,399,117,109,62,504,644,284,514,322,337,60,12,268,467,386,342,448,0,294,563,450,118,635,668,679,57,64,50,146,519,168,112,505,170,629,379,126,507,642,81,555,99,373,368,357,362,175,605,205,214,242,398,235,120,455,419,230,469,512,196,477,148,169,199,553,92,54,380,280,400,397,55,138,3,46,116,113,262,620,227,375,560,124,422,290,32,180,218,539,270,552,66,58,336,587,286,562,206,153,155,273,602,589,439,615,303,321,96,481,248,511,571,247,590,677,56,573,666,418,542,74,204,135,707,232,523,288,100,458,407,484,460,417,382,633,384,71,704,73,669,459,190,516,174,540,177,675,165,150,264,584,234,291,236,406,149,86,281,637,401,574,673,38,323,305,107,698,70,390,697,233,533,634,708,131,166,306,255,171,15,473,445,222,216,28,550,709,480,441,570,14,385,277,513,217,402,312,163,544,44,47,299,564,200,133,68,506,592,495,479,215,221,478,546,435,660,526,127,509,335,432,446,404,431,604,645,105,341,688,345,686,470,162,143,42,40,640,403,245,61,628,339,132,141,434,16,693,194,253,624,301,198,367,152,639,108,496,161,387,154,51,579,453,201,90,671,536,472,276,415,157,26,52,185,158,442,114,159,487,9,476,223,654,464,474,596,663,45,106,285,372,48,282,121,19,72,4,452,212,567,462,420,483,203,65,85,430,349,393,278,705,351,10,187,295,317,256,687,653,5,559,355,488,364,103,647,636,313,101,6,23,193,376,195,657,358,485,209,292,102,78,311,614,67,176,370,683,601,426,558,350,394,591,274,489,638,427,97,454,631,147,211,411,192,471,275,356,267,554,449,468,111,8,269,251,503,188,594,463,20,383,334,456,361,699,197,265,396,524,651,76,136,36,537,327,13,493,395,701,643,538,208,39,501,302,2,347,145,354,515,134,518,104,279,551,429,250,260,548,585,24,238,510,621,249,561,293,508,83,543,11,289,566,611,130,366,412,307,684,665,252,156,613,486,210,271,535,388,531,34,626,93,425,423,586,444,172,220,287,491,583,298,664,703,436,95,652,371,82,261,87,304,346,310,140,465,410,325,600,89,219,578,674,627,392,63,521,213,18,224,528,581,565,328,160,229,438,228,440,695,424,125,582,142,119,500,557,318,17,144,369,258,595,428,658,598,363,43,139,650,22,413,352,421,534,225,374,391,75,662,360,88,700,451,603,706,326,576,359,189,641,324,257,77,263,609,541,137,167,659,482,490,179,123,466,377,457,502,599,443,461,577,182,656,207,520,556,696,239,378,530,529,617,181,616,622,272,343,173,25,619,580,59,522,338,497,333,678,492,309,259,672,606,300,231,649,283,702,498,685,494,545,21,682,607,499,408,608,320,527,569,308,129,226,690,186,29,623,183,329,648,296,593,389,80,178,532,681,612,405,344,30,316,69,618,110,202,37,330,241,7,115,416,694,41};
////        System.out.println(containsNearbyDuplicate(arr,2));
//        System.out.println(arr.length);
//        String a = "subham";
//        String b = "subham";
//        System.out.println(a.equals(b));
//        System.out.println(a==b);
//
//        int[] nums = {1909 ,1209 ,1758, 1221, 1588, 1422, 1946, 1506, 1030, 1413, 1168, 1900, 1591, 1762, 1655, 1410, 1359, 1624, 1537, 1548, 1483, 1595, 1041 ,1602 ,1350 ,1291 ,1836 ,1374 ,1020 ,1596 ,1021 ,1348 ,1199 ,1668 ,1484 ,1281 ,1734 ,1053 ,1999 ,1418 ,1938 ,1900 ,1788 ,1127 ,1467 ,1728 ,1893, 1648, 1483 ,1807 ,1421, 1310, 1617 ,1813 ,1514, 1309, 1616, 1935, 1451, 1600, 1249, 1519, 1556, 1798, 1303, 1224, 1008, 1844, 1609, 1989, 1702, 1195, 1485, 1093, 1343, 1523, 1587, 1314, 1503, 1448, 1200 ,1458 ,1618 ,1580 ,1796 ,1798 ,1281 ,1589 ,1798 ,1009 ,1157 ,1472 ,1622 ,1538 ,1292 ,1038 ,1179 ,1190 ,1657 ,1958 ,1191 ,1815 ,1888 ,1156 ,1511 ,1202 ,1634, 1272, 1055, 1328, 1646, 1362, 1886, 1875, 1433, 1869, 1142, 1844 ,1416, 1881, 1998, 1322, 1651, 1021 ,1699, 1557, 1476 ,1892, 1389, 1075, 1712 ,1600 ,1510, 1003, 1869 ,1861, 1688 ,1401, 1789, 1255, 1423, 1002 ,1585, 1182, 1285, 1088, 1426 ,1617, 1757, 1832, 1932, 1169, 1154, 1721, 1189, 1976, 1329 ,1368 ,1692, 1425, 1555, 1434, 1549, 1441, 1512, 1145, 1060, 1718, 1753, 1139, 1423, 1279, 1996, 1687, 1529, 1549, 1437, 1866, 1949, 1193, 1195, 1297 ,1416};
//        System.out.println(max_of_subarrays(nums,183, 123));

//        int[] nums = {10,2,2,5,4,4,4,3,7,7};
//        int k =289;
//        int l = 0, r = 0 ,sum = 1,count=0;
//        boolean isLast = false;
//        while(l<=r && l<nums.length-1 && r<nums.length){
//            if(!isLast) sum *= nums[r];
//            if(sum<k && r<nums.length-1) {
//                count++;
//            }
//            else if(!isLast && r==nums.length-1) {
//                isLast = true;
//                if(sum<k) count++;
//            }
//            else {
//                sum /= nums[l];
//                l++;
//                if (sum < k) count++;
//                if (l<nums.length-1 && l!=r && nums[l] < k) count++;
//
//            }
//            if(r<nums.length-1)r++;
//        }
//        System.out.println(count);
        int[] people = {7,1,3};
        Arrays.sort(people);
        int limit = 7;
        int count = 0;
        int sum = 0;
        int j=0;
        for(int i=0; i<people.length; i++) {
            sum +=people[i];
            if(sum>=limit){
                count++;
                if(sum == limit) {
                    sum = 0;
                    j = i + 1;
                }
                while(sum>limit) {
                    sum -= people[j];
                    j++;
                }
            }
        }
        if(sum>0) count++;
        System.out.println(count);

    }

    static ArrayList <Integer> max_of_subarrays(int nums[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList();int st=0; int en = k-1;
        while(en<n){
            list.add(nums[findMax(nums,st,en)]);
            st++;en++;
        }
        return list;
    }
    static int findMax(int[] nums, int st, int en){
        int max = en;
        while(st<en){
            if(nums[st]>nums[max]) max=st;
            st++;
        }
        return max;
    }

    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length<2 || k==0) return false;
        for(int i=0; i<nums.length-k; i++){
            int j=i+1;
            int window=1;
            while(window<=k){

                if(nums[i]==nums[j]) return true;
                j++;
                window++;
            }
        }
        return false;
    }










    public static boolean isAnagram(String s, String t) {
        int[] alph = new int[256];
        for(char i: s.toCharArray()){
            alph[i]++;
        }
        for(char i: t.toCharArray()){
            alph[i]--;
        }
        for(int i: alph){
            if(i != 0) return false;
        }
        return true;
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //nums1 --> main Array , temp --> left,  nums2 --> right
        //only MargeProcedure so Time Complexity ==> O(n) , Space ==> O(length of num1 /2)
//        int mid = (m + n) / 2;
        int i=0, j=0, k = 0;

        int[] temp = new int[m];
        for (i=0; i<m; i++) temp[j++] = nums1[i];

        i=0;j=0;
        while(i<temp.length && j<nums2.length){
            if(temp[i] >= nums2[j]) nums1[k++] = nums2[j++];
            else  nums1[k++] = temp[i++];
        }
        while(i<temp.length){
            nums1[k++] = temp[i++];
        }
        while(j<nums2.length){
            nums1[k++] = nums2[j++];
        }
    }
    public static boolean checkIfExist(int[] arr) {
        Arrays.sort(arr);
        for(int target : arr){
            int start=0, end= arr.length-1;
            while(start<=end){
                int mid =start+(end-start)/2;
                if(arr[mid]*2 == target) return true;
                else if(arr[mid]*2 < target) start = mid+1;
                else end =mid-1;
            }
        }
        return false;
    }
//        List<List<Integer>> list1 = new ArrayList<>();

//        ArrayList<Integer> list2 = new ArrayList<>();
//        list2.add(1);
//        list2.add(2);
//        ArrayList<Integer> list3 = new ArrayList<>();
//        list3.add(4);
//        list3.add(2);
//
//        list1.add(list2);
//        list1.add(list3);
//        System.out.println(list1);
//        list2.clear();
//        System.out.println(list1);

//        Scanner Sc = new Scanner(System.in);
//        int n= Sc.nextInt();
//        if(n<=0) {
//            System.out.println(list1);
//        }
//        for(int i=1; i<=n; i++){}
//
//        System.out.println(list1);


        //PANGRAM is A to Z wil Appear at least once

//        String s = "the";
//        String t = "thh";
//        int n = s.length();
////        System.out.println(s.toCharArray());
////       char gp = 'a' + 1;
////        System.out.println(gp);
////        System.out.println(s.indexOf(gp));
//        System.out.println(s.contains("color"));
//        if(s.compareTo(t) == 0){
//            System.out.println("true");
//        } else{
//            System.out.println("false");}

//        System.out.println(n);
//        for(int i=0; i<n; i++){
//            System.out.println(s.charAt(i));
//        }
//        boolean result = true;
////        int n = s.length();
//        if(n==26){
//            for(int i=0; i<n; i++){
//                int ch = s.charAt(i);
//                if(ch>=97 || ch<=122){
//                    result = true;
//                } else {
//                    result= false;
//                    System.out.println(result);
//                    break;
//                }
//            }
//        }
//        byte an = 97;
//        System.out.println(an);
//
//        for( byte i = 97;i<=122;i++ ){
//            System.out.println(s.indexOf(i));
//
//            if( s.indexOf( i ) == -1 ){
//                 result = false;
////                System.out.println(result);
//                 break;
//            }
//        }
//        System.out.println(result);


//        List<List<String>> list = new ArrayList<>();
//        list.add(new ArrayList<>());
//        list.get(0).add("Subham");
//        list.get(0).add("Subham");
//        list.get(0).add("Subham");
//        list.add(new ArrayList<>());
//        list.get(1).add("Subham");
//        list.get(1).add("Subham");
//        list.add(new ArrayList<>());
//        list.get(2).add("Subham");


//        System.out.println(list);
//        System.out.println(list.size());
//        System.out.println(list.get(0).get(0) == ("SubHam"));

//["phone","blue","pixel"],["computer","silver","phone"],["phone","gold","iphone"]
//        List<String> l1 = new ArrayList<>();
//l1.add("phone");
//l1.add("blue");
//l1.add("pixel");
//List<String> l2 = new ArrayList<>();
//l2.add("computer");
//l2.add("silver");
//l2.add("phone");
//List<String> l3 = new ArrayList<>();
//l3.add("phone");
//l3.add("red");
//l3.add("infinix");
//
//List<List<String>> items = new ArrayList<>();
//items.add(l1);
//items.add(l2);
//items.add(l3);
//int c =0 ;
//String ruleKey = "name";
//String ruleValue = "pixel";
//
////        System.out.println(list2.get(1).get(0));
//        int j=0;
//        if(ruleKey == "color"){
//            j=1;
//        }
//        else if(ruleKey == "name"){
//            j=2;
//        }
//        else c = Integer.MIN_VALUE;
//        for (int i=0; i<items.size(); i++){
//            if(ruleValue == items.get(i).get(j)){
//                c++;
//            }
//
//        }
//        System.out.println(c);

        // for(int i=0; i<items.size(); i++){
        //     if(ruleValue == items.get(i).get(j)){
        //         match ++;
        //     }
        // }

//int[] gain = {44,32,-9,52,23,-50,50,33,-84,47,-14,84,36,-62,37,81,-36,-85,-39,67,-63,64,-47,95,91,-40,65,67,92,-28,97,100,81};
//        int[] point = new int[gain.length +1];
//        System.out.println(point.length);
//        int high = Integer.MIN_VALUE;
//        for(int i=1; i<= gain.length; i++){
//            point[i] = point[i-1]+ gain[i-1];
//        }
//        for (int k : point) {
//            if (k > high) high = k;
//        }
//
//        System.out.println(high);

//int[][] image = {
//            {1,0,0},{1,0,2},{0,2,1}
//        };
//
//
//        for(int i= 0; i<image.length; i++){
//            int start = 0, end = image[0].length-1;
//            while(start<end){
//                int temp = image[i][start];
//                image[i][start] = image[i][end];
//                image[i][end] = temp;
//                start++;
//                end--;
//            }
//        }
//
////        printArray(image);
//        for (int i =0; i< image.length; i++){
//            for (int col= 0; col<image[0].length;col++){
////                System.out.print(image[i][col]);
//                if(image[i][col] == 1 ) {
//                    image[i][col] = 0;
//                } else{
//                    image[i][col] = 1;
//                }
//            }
//        }

//printArray(image);


//        System.out.println(7/2);


/* String[] str = {"alice and bob love leetcode", "i think so too ", "this is great thanks very much"};
int max =0;

for (int i=0; i<str.length;i++) {
    if(str[i].startsWith(" ",0) || str[i].endsWith(" ")){
        System.out.println( "error");
        break;
    }

    int count =0;
    for(int j=0; j<str[i].length(); j++){
        System.out.print(str[i].charAt(j));
        if(str[i].charAt(j) == ' '){
            count++;
        }
    }
    System.out.println(" " +count);

    System.out.println();
} */


//int[] n = {200,10,300};
//String s = String.valueOf(n[1]);
//        System.out.println(s.length());


//        int[][] arr = {
//                {1,4,3}, {2, 6,7}
//        };
//        int c= arr[0].length;
//        int r= arr.length;
//        int[][] trr = new int[c][r];
//        for (int j=0; j<c;j++){
//            for (int i=0; i<r; i++){
//                trr[j][i] = arr[i][j];
//            }
//        }
//        printArray(trr);


/* int[] num ={9,9,9,9,9,9,9,9,9,9}; int k =1;
        int p= num.length;
        long mf =1, sum=0;
        System.out.println(p);
        for(int i=p-1; i>=0; i--){
            sum = sum+ (num[i] * mf);
            mf *= 10;
            System.out.print(sum+" ");
        }
        sum+= k;
        System.out.println(sum);
        List<Integer> list = new ArrayList<>();
        while(sum>0){
            long r=sum%10;
            list.add(0,(int)r);
            sum /=10;
        }
        System.out.println(list); */

/*

int[] freq = new int[100];
int[][] logs  =
        {
//        {1920,1947},
//        {1910,1930},
//        {1990,2000},
//        {2000,2039},
//        {1900,1980},
//        {1990,1990},
//        {1930,1957},
//        {1920,1930},
//        {1947,1990},
//        {2020,2050},
//        {1910,1930},
//                {1950,1961},{1960,1971},{1970,1981},
                {2025,2041},
                {1988,2007},
                {2003,2046},
                {2045,2049},
                {2025,2027},
                {2014,2040},
                {2014,2027},
                {2011,2027},
                {1972,2019}
        };
//        int[] freq = new int[2050];
        int ans =0;
        for (int i=0; i<logs.length; i++) {
            if (logs[i][0] < logs[i][1]) {
                freq[logs[i][0]-1950] += 1;
            }
        }
        for (int i=0; i<logs.length; i++){
            for (int j=0; j<logs.length; j++){
                int p= 0;
                if(logs[i][0] > logs[j][0] && logs[i][0]<=logs[j][1]){
                    p+=1;
                }
                freq[logs[i][0]-1950] += p ;
            }
        }


        for (int i=0; i<freq.length; i++){
            if(freq[i] > 0){
                if (freq[i]>freq[ans]){
                    ans = i;
                }
                System.out.print(i+" -> "+freq[i]);
                System.out.println();
            }

        }
        System.out.println(ans+1950);

*/


//int[] ar = {5,2,3,4,5,6,7,8};
//        System.out.println(Arrays.toString(ar));

//List<Integer> list = new ArrayList<>();
//
//        for(int i=0; i<ar.length/2; i++) {
////            int f = ar[2 * i];
////            int val = ar[2 * i + 1];
//            for (int j=0; j<ar[2 * i]; j++){
//                list.add(ar[2 * i + 1]);
//            }
//        }
//        int[] arr = new int[list.size()];
//        int len =arr.length ;
//        for (int i =0; i<len; i++){
//            arr[i] = list.get(i);
//        }
//
//        System.out.println(list +" "+len);
//
//Arrays.fill(arr,0,0+ar[0],2);
//        System.out.println(Arrays.toString(arr));


//        String ss = "codeleet";
//        int[] indices = {9,2,5,9};
//        char[] arr = new char[indices.length];
//        String str = "";
//
//        for (int i=0; i<arr.length; i++) {
//            arr[indices[i]] = ss.charAt(i);
//
//        }
//
//        System.out.println(Arrays.toString(arr));
////        System.out.println(str);
//
//        for (char c : arr){
//            str += c;
//        }
//        System.out.println(str);

//        char a[] = new char[ss.length()];
//        char ch[] = ss.toCharArray();
//        for(int i=0;i<ch.length;i++) {
//            a[indices[i]] = ch[i];
//        }
//        System.out.println(Arrays.toString(ch));
//int total = 0, m = 1;
//String s= "";
//
//        for (int i =indices.length -1; i>=0; i--){
//            total += indices[i] *m;
//            m *=10;
//
//        }
//        System.out.println(s);
//        System.out.println(total+1);
//        int n = indices.length;
//        if(indices[0] == 9) n= indices.length +1;
//int[] arr5 = new int[n];
//        System.out.println(Arrays.toString(arr5));

//        String s  ="racE ca";
//
//        String mod ="" ;
//        for(int i =0; i<s.length(); i++){
//            if(s.charAt(i)>=65 && s.charAt(i)<=90 || s.charAt(i)>= 97 && s.charAt(i)<= 122 ){
//                mod += s.charAt(i);
//            }
//        }
//        int start=0, end =mod.length()-1;
//        boolean palindrome = true;
//        while(start < end){
//           if(s.charAt(start)>=65 && s.charAt(end)>=65 && s.charAt(start)<=90 && s.charAt(end)<=90 || s.charAt(start)>=97 && s.charAt(end)>=97 && s.charAt(start)<=122 && s.charAt(end)<=122){
//               if(s.charAt(start) != s.charAt(end)) {
//                   palindrome = false;
//                   break;
//               }
//           }
//            start++;
//            end--;
//        }
//        System.out.println(palindrome);
//
//        System.out.println(mod);


//        int[][] mat = {{0,0,0},{0,1,0},{1,1,1}};
//        int[][] target = {{1,1,1},{0,1,0},{0,0,0}};
//        System.out.println(findRotation(mat,target));
//        System.out.println(Arrays.equals(mat[1],target[7]));

//String a = "toote makan";
//        System.out.println(a.substring(1,a.length()-1));

//        int matrix[][] ={
////                {1,10,4,2},{9,3,8,7},{15,16,17,12}
//                {7,8},{1,2}
//        };
//        List<Integer> list = new ArrayList<>();
//        int row = 0;
//        int col = 0;
//        int count =0;
//        int ans = Integer.MAX_VALUE;
//        while(row < matrix.length){
//            for(int j=0; j<matrix[0].length; j++){
//                if(matrix[row][j] < ans){
//                    ans = matrix[row][j];
//                    col = j;
//                }
//            }
//            for(int i =0; i<matrix.length; i++){
//                if(matrix[i][col] <= ans){
//                    count ++;
//                }else {
//                    count = 0;
//                    col = 0;
//                    ans = Integer.MAX_VALUE;
//                    break;
//                }
//            }
//            if(count == matrix.length) list.add(0,ans);
//            row++;
//        }
//
//        System.out.println(list);


//int[] arr =
//        {-2,1,};
//int max = Integer.MIN_VALUE;
//int start=0,size =0;
//for (int i =0; i<arr.length; i++){
//    int sum = arr[i];
//    if(sum > max) max = sum;
//    for (int j =i+1; j< arr.length; j++) {
//        sum += arr[j];
////        start = i;
////        size = j - i;
//        if (sum > max) {
//            max = sum;
//
//        }
//    }
//
//}
//        System.out.println(max);
//        System.out.println(start);
//        System.out.println(size);
//
//int[] arr2 = new int[size+1];
//for (int k=0; k<arr2.length; k++){
//    arr2[k] = arr[start];
//    start++;
//}
//        System.out.println(Arrays.toString(arr2));

//        String boxes = "001011";
//
//
//        int[] operations = new int[boxes.length()];
//        int ballCount = 0; // How many balls we're currently moving to the left or right, depending on which loop we are in
//        int opsPerIncrement = 0; // How many operations per increment in array
//
//        // Move balls to the right -->
//        for(int i = 0; i < boxes.length(); i++) {
//            operations[i] += opsPerIncrement;
//            if(boxes.charAt(i) == '1') {
//                ballCount++;
//            }
//            opsPerIncrement += ballCount;
//
//        }
//
//        ballCount = 0;
//        opsPerIncrement = 0;
//
//        // Move balls to the left <--
//        for(int i = boxes.length() - 1; i >= 0; i--) {
//            operations[i] += opsPerIncrement;
//            if(boxes.charAt(i) == '1') {
//                ballCount++;
//            }
//            opsPerIncrement += ballCount;
//        }
//        System.out.println(Arrays.toString(operations);

//        char[][] board = { {'a','b'},{'c','d'} } ; String word = "abcd"; //{'A','B','C','E'},{'S','F','C','S'},{'A','D','E','E'}
//        int[] temp = new int[51];
//        for(int i=0; i<board.length; i++){
//            for(int j=0; j<board[i].length; j++){
//                int index = board[i][j];
//                if(index>=65 && index<=90){
//                    temp[index-65]++;
//                }
//                if(index>=97 && index<=122){
//                    temp[index-97+26]++;
//                }
//            }
//        }
//
//        for(int k=0; k<word.length(); k++){
//            int index = word.charAt(k);
//            if(index>=65 && index<=90) index -= 65;
//            if(index>=97 && index<=122) index += (26-97);
//            if(temp[index]<1) {System.out.println(false); break; }
//            else temp[index]--;
//        }
//        System.out.println(true);;

//        String s = "abcdabcdabcd";
//        String s1 = "";
//        s1 = s.substring(0, s.length() / 2);
//        int k = 1;
//        while (s1.length() > 0) {
//            String s2 = s1;
//            while (s1.length() <= s.length()) {
//
//                s1 = s1.concat(s2);
//                if (s1.equals(s)) {
//                    System.out.println(true);
//                    break;
//                }
//            }
//            s1 = s.substring(0, s.length() / 2 - k++);
//        }
//        System.out.println(72%26 + " "+ 72/26);
       /* int num = 701;
        String ss = "";
        while (num > 26) {
            int rem = num % 26;
            ss = String.valueOf((char) (rem + 64)).concat(ss);
            num /= 26;
            System.out.println(num);

        }
        System.out.println(String.valueOf((char) (num + 64)).concat(ss))

//        else{
//            num += 64;
//            System.out.println(String.valueOf((char) num));
//        }

        */

// int[] array = {11,2,3,7,5,1,10};
// for (int i=0; i<array.length;i++){
//    int min = i;
//    for (int j =i+1; j<array.length;j++){
//        if(array[j]<array[min]) min = j;
//    }
//    int temp = array[min];
//    array[min] = array[i];
//    array[i] = temp;
// }
//        for (int d: array) {
//            System.out.print(d+" ");
//        }
//        num = 11;
//        long start = 1, end = num;
//        while (start <= end) {
//            long mid = start + (end - start) / 2;
//            long coin = mid * (mid + 1) / 2;
//            if (coin < num) start = mid + 1;
//            else if (coin > num) end = mid - 1;
//            else System.out.println((int) mid);
//        }
//        System.out.println((int) end);
//
//
//        int[] array = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 2, 1, 1, 1, 1, 1};
//        System.out.println(pSearch(array, 0, array.length));
//
//        for (int data: array
//             ) {
//            if(data == 2) System.out.println("found");
//
//        }
//        int[][] grid = {{4,2,-1},{-1,2,-2,4,-5}};
//        int ans =0;
//        int i=1;
//        for (int data : grid[i]){
//            if(data<0) ans++;
//        }
//        System.out.println(ans);

//        int[] nums= {1,5,7,7,7,8,9,11};
//        for (int val: nums) System.out.print(val + " ");
//        Arrays.sort(nums);
//        System.out.println();
//        for (int val: nums) System.out.print(val + " ");
//        int i=0, num=1,ans=0; int k =7;
//        while(i<nums.length && k>0){
//            if(nums[i] == num) i++;
//            else if (nums[i]<num ){
//                i++;
//                num--;
//            }
//            else {
//                k--;
//                ans += num;
//            }
//            num++;
//        }
//        while(k>0) {
//            ans += num++;
//            k--;
//        }
//        System.out.println();
//        System.out.println(ans);




















//
//        int p = 4;
//        int q = 0;
//        System.out.println(powerValue(p,q));


//        int n = -1234;
//        System.out.println(sumOfDigits(n));
//        System.out.println(countDigits(n));

//            int[] arr = {1,2,3,4,5,8,6,0,7,4,3,11,21,13,3,3};
//            for( int i : arr ) {
//                System.out.print(i + " ");
//            }


    }

//    static int pSearch(int[] num, int start, int end) {
//        while (start < end) {
//            int mid = start + (end - start) / 2;
//            if (num[mid] > num[mid + 1]) return mid;
//            else if (num[mid] > num[0]) start = mid;
//            else end = mid;
//        }
//        return num.length - 1;
//    }

//    static boolean canJump(int[] nums) {
//        if(nums.length==1) return true;
//        int jump = 0, step=0;
//        while(step<nums.length){
//            if(nums[step]==0 && step<nums.length-1) return false;
//            //if(nums[step]==0 && step==nums.length-1) return true;
//            jump = nums[step];
//            step += jump;
//        }
//
//    }

//    static int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
//        int[][] mat = new int[rows*cols][2];
//        int tRow= rStart, bRow=rStart, lCol= cStart, rCol=cStart,total =0;
//        mat[total][0] = tRow; mat[total][1] = lCol; total++;
//        tRow--; bRow++; lCol--; rCol++;
//        while(total < rows*cols ){
//            //right col
//            if(rCol < cols){
//                for(int j= tRow+1; j<=bRow && j<rows && total< rows*cols; j++){
//                    mat[total][0]= j;
//                    mat[total][1] = rCol;
//                    total++;
//                }
//            }
//            if(rCol > cols) rCol = cols;
//
//            //bottom row
//            if(bRow < rows){
//                for(int i= rCol-1; i>=lCol && i>=0 && total< rows*cols; i--){
//                    mat[total][0]= bRow;
//                    mat[total][1] = i;
//                    total++;
//                }
//            }
//            if(bRow > rows) bRow = rows;
//
//            //left col
//            if(lCol>=0){
//                for(int j= bRow-1; j>=tRow && j>=0 && total< rows*cols; j--){
//                    mat[total][0]= j;
//                    mat[total][1] = lCol;
//                    total++;
//                }
//            }
//            if(lCol < 0) lCol= -1;
//
//            //top row
//            if(tRow >= 0){
//                for(int i=lCol+1; i<=rCol && i<cols && total< rows*cols; i++){
//                    mat[total][0]= tRow;
//                    mat[total][1] = i;
//                    total++;
//                }
//            }
//            if(tRow < 0) tRow= 0;
//
//            tRow--; bRow++; lCol--; rCol++;
//        }
//
//        return mat;
//
//    }




//    static void printMatrix(int[][] a){
//        for (int[] ints : a) {
//            for (int anInt : ints) {
//                System.out.print(anInt + " ");
//            }
//            System.out.println();
//        }
//    }

//    static int countDigits(int n){
//        if(n<0){     //for negative nums
//            n = n*(-1);
//        }
//        if(n>=0 && n<=9) return 1; //base case
//
//        return countDigits(n/10) + 1; //recursive work
//    }
//    static int sumOfDigits(int n){
//        if(n<0) n = n*(-1);   // negative integer
//
//        if(n>=0 && n<=9) return n; //base case
//
//        return sumOfDigits(n/10) + n%10; // recursive case
//
//    }
//    static int powerValue(int p,int q){
//        if(q==0) return 1; //base case
//
//        return powerValue(p,q-1)*p; //recursive case
//    }
//    static int powerValueEfficient(int p, int q){
//        if(q==0) return 1; //base case
//        if(q%2 == 0) {                 //recursive case
//            return powerValueEfficient(p,q/2)*powerValueEfficient(p, q/2);
//        } else {
//            return p*powerValueEfficient(p,q/2)*powerValueEfficient(p,q/2);
//        }
//    }

//    static boolean findRotation(int[][] mat, int[][] target) {
//        int countR =0;
//        boolean countElement = true;
//        while(countR<3){
//            for(int i =0; i<mat.length; i++) {
//                for (int j = 0; j < mat[0].length; j++) {
//                    if (target[i][j] != mat[i][j]) {
//                        countElement = false;
//                        break;
//                    }
//                }
//            }
//            countR++;
//            mat = rotate(mat);
//        }
//        return countElement;
//    }
//
//    static int[][] rotate(int[][] arr){
//        int n = arr.length;
//        int[][] myArr = new int[n][n];
//        for(int i=0; i<n; i++){
//            for(int j=0; j<n; j++){
//                myArr[j][n-i-1] = arr[i][j];
//            }
//        }
//        return myArr;
//    }
//
//
//    static int romanToInt(String s) {
//        int total = 0;
//        if(s.length() == 0) return 0;
//
//
//        if(s.startsWith("I")) total = 1 + romanToInt(s.substring(1));
//
//        if (s.startsWith("IV")) total = 4 + romanToInt(s.substring(2));
//
//        if(s.startsWith("IX")) total = 9 + romanToInt(s.substring(2));
//
//        if (s.startsWith("V")) total = 5 + romanToInt(s.substring(1));
//
//        if(s.startsWith("X")) total = 10+ romanToInt(s.substring(1));
//
//        if (s.startsWith("XL")) total = 40 + romanToInt(s.substring(2));
//
//        if(s.startsWith("XC")) total = 90 + romanToInt(s.substring(2));
//
//        if (s.startsWith("L")) total = 50 + romanToInt(s.substring(1));
//
//        if(s.startsWith("C"))  total = 100 + romanToInt(s.substring(1));
//
//        if (s.startsWith("CD")) total = 400 + romanToInt(s.substring(2));
//
//        if(s.startsWith("CM")) total = 900 + romanToInt(s.substring(2));
//
//        if (s.startsWith("D")) total = 500 + romanToInt(s.substring(1));
//
//        if(s.startsWith("M")) total += 1000 + romanToInt(s.substring(1));
//
//        return total;
//    }
//}

//        int total = 0;
//        switch (s.charAt(0)) {
//            case 'M':
//                total += 1000 + roman(s.substring(1));
//                break;
//            case 'D':
//                total += 500 + roman(s.substring(1));
//                break;
//            case 'L':
//                total += 50 + roman(s.substring(1));
//                break;
//            case 'V':
//                total += 5 + roman(s.substring(1));
//                break;
//            case 'I':
//                if (s.charAt(1) == 'V') total += 4 + roman(s.substring(2));
//                if (s.charAt(1) == 'X') total += 9 + roman(s.substring(2));
//                if (s.charAt(1) == 'I') total += 1 + roman(s.substring(1));
//                break;
//            case 'X':
//                if (s.charAt(1) == 'L') total += 40 + roman(s.substring(2));
//                if (s.charAt(1) == 'C') total += 90 + roman(s.substring(2));
//                total += 10 + roman(s.substring(1));
//                break;
//            case 'C':
//                if (s.charAt(1) == 'D') total += 400 + roman(s.substring(2));
//                if (s.charAt(1) == 'M') total += 900 + roman(s.substring(2));
//                total += 100 + roman(s.substring(1));
//                break;
//        }
//        return total;

