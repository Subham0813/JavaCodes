package DataStructures.Recursion_Backtrack;

import java.util.ArrayList;
import java.util.Scanner;

public class p14_returnEveryIndexOfTarget {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print(" enter Array size : " );
        int s = in.nextInt();
        int[] arr = new int [s];
        System.out.print("enter Array elements : ");
        for (int i = 0; i < s; i++ ){
            arr[i] =in.nextInt();
        }
        System.out.print("enter element to be searched : ");
        int k = in.nextInt();
//        printIndex(arr,0, k);       //printing method

        System.out.println(printAllIndex(arr,0,k));    //returning a list
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println(printAllIndex2(arr,k,0,list));    //returning a list

    }
    static void printIndex(int[] ar,int i, int k){
        if(i == ar.length)  return;                     //base case;

        if (ar[i] == k) System.out.print(i+ " ");         //self work

        printIndex(ar,i+1,k);                      //recursive case
    }
    static ArrayList<Integer> printAllIndex(int[] arr, int i, int target){

        if(i == arr.length)  return new ArrayList<>();  // base case     if id > array length return empty ArrayList

        ArrayList<Integer> list  = new ArrayList<>();       //creating new empty list

        if (arr[i] == target) {                             //self work
            list.add(i) ;
        }
        ArrayList<Integer> list2 = (printAllIndex(arr,i+1,target));    //recursive work

        list.addAll(list2);         //addAll method append all element of list2 into list  something like concatenation

        return list;

    }
    static ArrayList<Integer> printAllIndex2(int[] arr, int target, int id, ArrayList<Integer> list){
        if(id == arr.length) return list;
        if(arr[id] == target) list.add(id);
        return printAllIndex2(arr,target,id+1,list);
    }
}
