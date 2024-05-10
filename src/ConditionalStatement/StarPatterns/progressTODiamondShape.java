package ConditionalStatement.StarPatterns;


public class progressTODiamondShape {

    //let n= 3
    public static void main(String[] args) {
//        int n = 5, nums = 1, noOfSpaces = n - 1, total = 2 * n - 1;
//        for (int i = 1; i <= total; i++) {
//            for (int k = 1; k <= noOfSpaces; k++) {        //spaces
//                System.out.print(" ");
//            }
//            for (int j = 1; j <= nums; j++) {      //stars
//                System.out.print("*");
//            }
//            if (i < total / 2 + 1) {
//                nums += 2;
//                noOfSpaces--;
//            } else {
//                nums -= 2;
//                noOfSpaces++;
//            }
//            System.out.println();
//        }

        int n = 10, nums = 1, noOfSpaces = n - 1, total = 2 * n - 1;
        for (int i = 1; i <= total; i++) {
            for (int k = 1; k <= noOfSpaces; k++) {        //spaces
                System.out.print(" ");
            }
            int x = i, y=2;
            if(i>n) x = n- noOfSpaces;
            for (int j = 1; j <= nums; j++) {      //stars
                if(x>0)System.out.print(x--);
                else System.out.print(y++);
            }
            if (i < total / 2 + 1) {
                nums += 2;
                noOfSpaces--;
            } else {
                nums -= 2;
                noOfSpaces++;
            }
            System.out.println();
        }

    }

}

