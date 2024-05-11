public class Scrap {
    public static void main(String[] args) {
String s = "XVI";
        System.out.println(romanToInt(s));
//        int x = 12321;
//        int result =0;
//        while(x>0){
//            int mFac = (int) Math.log10(x);
//            result += x%10 * (int)Math.pow(10,mFac);
//            x /=10;
//        }
//        System.out.println(result);
        int[] arr = {84,49,5,24,70,77,87,8};
        System.out.println(timeRequiredToBuy(arr, 3));
    }

    public static int timeRequiredToBuy(int[] tickets, int k) {
        int count = 0;
        while(tickets[k]>0){
            int i;
            for(i=0; i<tickets.length; i++){
                if(tickets[i]==0) continue;
                tickets[i]--;
                count++;
            }
        }
        return count;
    }



    static int romanToInt(String s) {
        int total = 0, value = 0, pVal =0;
        for(int i =s.length()-1; i>=0; i--){
            switch(s.charAt(i)){
                case 'I':
                    value = 1;break;
                case 'V':
                    value = 5;
                    break;
                case 'X':
                    value = 10;
                    break;
                case 'L':
                    value = 50;
                    break;
                case 'C':
                    value = 100;
                    break;
                case 'D':
                    value = 500;
                    break;
                case 'M':
                    value = 1000;
                    break;
            }
            if(value < pVal){
                total -= value;
            } else {
                total += value;
                pVal = value;
            }
        }
        return total;
    }
}
