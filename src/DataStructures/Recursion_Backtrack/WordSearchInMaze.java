package DataStructures.Recursion_Backtrack;

import java.util.*;

class WordSearchInMaze {
    static boolean isFound=false;
    public static void main(String[] args) {
//        char[][] board =
//                {
//                {'A','B','C','E'},
//                {'S','F','C','S'},
//                {'A','D','E','E'}
//        };
//        System.out.println(exist(board,"ABCB"));
        char[][] boardII = {{'o','a','b','n'},
                            {'o','t','a','e'},
                            {'a','h','k','r'},
                            {'a','f','l','v'}};
        String[] words= {"oa","oaa"};
        List<String> li = new ArrayList<>(findWords(boardII,words));
        System.out.println(li);

    }
    static public List<String> findWords(char[][] board, String[] words) {
        int r, c;
        List<String> list = new ArrayList();
        for(String word : words){
            for(r=0; r<board.length; r++){
                isFound=false;
                for(c=0; c<board[0].length; c++){
                    if(word.charAt(0) == board[r][c]){
                        if(OptimizeFinding(board,word,r,c,0)) {
                            list.add(word);
                            isFound = true;
                            break;
                        }
                    }
                }
                if (isFound) break;
            }
        }
        return list;
    }
    public static boolean exist(char[][] board, String word) {
        int r, c;
        for(r=0; r<board.length; r++){
            for(c=0; c<board[0].length; c++){
                if(word.charAt(0) == board[r][c]){
//                    findingString(board,word,r,c,0);
                    if(OptimizeFinding(board,word,r,c,0)) return true;
                }
            }
        }
        return false;
    }
    static void findingString(char[][] board, String word, int r, int c, int id){

        if(id==word.length()){
            isFound=true;
            return;
        }

        if(r>= board.length || c>= board[0].length || board[r][c]== '0') return;


        char curr= word.charAt(id);

        if(r>0 && !isFound){
            if(board[r][c] == curr){
                board[r][c] = '0';
                findingString(board,word,r-1,c,id+1);
                board[r][c] = curr;
            }
        }
        if(c>0 && !isFound){
            if(board[r][c] == curr){
                board[r][c] = '0';
                findingString(board,word,r,c-1,id+1);
                board[r][c] = curr;
            }
        }
        if(c<board[0].length && !isFound){
            if(board[r][c] == curr){
                board[r][c] = '0';
                findingString(board,word,r,c+1,id+1);
                board[r][c] = curr;
            }
        }
        if(r<board.length && !isFound) {
            if (board[r][c] == curr) {
                board[r][c] = '0';
                findingString(board, word, r + 1, c, id + 1);
                board[r][c] = curr;
            }
        }
        return;
    }
    static boolean OptimizeFinding(char[][] board, String word, int r, int c, int id){
        if(id==word.length()){
            return true;
        }
        if(r<0 || r>= board.length || c<0 || c>= board[0].length || board[r][c] != word.charAt(id)) return false;

        char curr = board[r][c];
        board[r][c] = '0';

        boolean found = OptimizeFinding(board,word,r-1,c,id+1) ||
                OptimizeFinding(board,word,r,c-1,id+1) ||
                OptimizeFinding(board,word,r,c+1,id+1) ||
                OptimizeFinding(board,word,r+1,c,id+1);

        board[r][c] = curr;
        return found;
    }
}