package DataStructures.Recursion_Backtrack;

class FindKthBitString {
    public static void main(String[] args) {
        System.out.println(findKthBit(20,1048575));
    }
    static public char findKthBit(int n, int k) {
        String str = makeString(n,new StringBuilder("0"),new StringBuilder("1"));
        return str.charAt(k-1);
    }
    static String makeString(int n, StringBuilder sb, StringBuilder revSb) {
        if (n == 1) {
            sb.append("1");
            sb.append(revSb);
            return sb.toString();
        }

        sb.append("1");
        sb.append(revSb);
        revSb = revInv(new StringBuilder(sb));
        return makeString(n - 1, sb, revSb);
    }
    static StringBuilder revInv(StringBuilder s){
        s.reverse();
        for(int i=0; i<s.length(); i++){
            char curr = s.charAt(i);
            s.deleteCharAt(i);
            if(curr == '0') {
                s.insert(i,"1");
            }
            else s.insert(i,"0");
        }
        return s;
    }


}