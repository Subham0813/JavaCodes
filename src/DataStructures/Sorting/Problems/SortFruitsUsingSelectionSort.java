package DataStructures.Sorting.Problems;

public class SortFruitsUsingSelectionSort {
    static void sortFruits(String[] f){
        for(int i=0; i<f.length; i++){
            int min =i;
            for (int j=i+1; j<f.length; j++) {
                if (f[j].compareToIgnoreCase(f[min]) < 0)
                    min = j;
            }
            //swapping
            String temp = f[i];
            f[i] = f[min];
            f[min] = temp;
        }
    }

    public static void main(String[] args) {
        String[] fruits = {"strawberry","mango","orange","nashpati"};
        sortFruits(fruits);
        for(String fruit : fruits){
            System.out.print(fruit + " ");
        }
    }
}
