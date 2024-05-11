package DataStructures.Arrays;
import java.util.*;


public class p1_ArrayPrinting {

    // creating array by input value from ta user by method

    static int[] createArray(int a_size) {
        System.out.println("enter integer array elements :");
        Scanner sc = new Scanner(System.in);
        int[] array = new int[a_size];
        for (int i = 0; i < a_size; i++) {
            array[i] = sc.nextInt();
        }
        System.out.println();
        return array;
    }

    static void printArray(int[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

//    static char[] createArray2(int a_size) {
//        System.out.println("enter charecter array elements :");
//        Scanner sc = new Scanner(System.in);
//        char[] array = new char[a_size];
//        for (int i = 0; i < a_size; i++) {
//            array[i] = sc.nextLine();
//        }
//        System.out.println();
//        return array;
//    }

//    static void printCharArray(char[] array) {
//
//        for (int i = 0; i < array.length; i++) {
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//    }

    static String[] createArray3(int a_size) {
        System.out.println("enter String array elements :");
        Scanner sc = new Scanner(System.in);
        String[] array = new String[a_size];
        for (int i = 0; i < a_size; i++) {
            array[i] = sc.nextLine();
        }
        System.out.println();
        return array;
    }

    static void printStringArray(String[] array) {

        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }


    public static void main(String[] args) {
        System.out.println("enter size of the array :");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();  //taking size

        int[] arr = createArray(size);
                                            //creating an array by following size
        String[] crr = createArray3(size);

            printArray(arr);
                                                //printing the array
            printStringArray(crr);

//        char[] brr = createArray2(size);
//        printCharArray(brr);     //char array does not exist ,
        // in java from a string we can find char,
        // always consider a char as a string.



    }
}