class Solution {
    public int numRookCaptures(char[][] board) {
        int result=0;
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[0].length;j++){
                if(board[i][j]=='R'){
                       return  up(board,i-1,j)+down(board,i+1,j)+left(board,i,j-1)+right(board,i,j+1);
                     
                }
            }
        }

        return 0;
    }


    public static  int up(char[][]board,int i,int j){

        for(int k = i;k>=0;k--){
            if(board[k][j]=='p'){
                return 1;
            }else if(board[k][j]=='B'){
                break;
            }
        }
        return 0;
    }

    public static int down(char[][]board,int i,int j){
        for(int k=i;k<board.length;k++){
            if(board[k][j]=='p'){
                return 1;
            }else if(board[k][j]=='B'){
                break;
            }
        }
        return 0;
    }

    public static int left(char[][]board,int i,int j){
        for(int k=j;k>=0;k--){
                if(board[i][k]=='p'){
                    return 1;
                }
                if(board[i][k]=='B'){
                    break;
                }
        }
        return 0;
    }

    public static int right(char[][]board,int i,int j){
            for(int k=j;k<board[0].length;k++){
                if(board[i][k]=='p'){
                    return 1;
                }
                if(board[i][k]=='B'){
                    break;
                }
            }
            return 0;
    }
}