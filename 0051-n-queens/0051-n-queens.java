class Solution {
    public List<List<String>> solveNQueens(int n) {
        List<List<String>> AllBoard = new ArrayList<>();
        char[][] Board = new char[n][n];

        Helper(AllBoard,Board,0);

        return AllBoard;
    }

    public static void Helper(List<List<String>> AllBoard,char[][]Board,int col){

            if(col==Board.length){
                Save(Board,AllBoard);
                return;
            }

                for(int row=0;row<Board.length;row++){

                    if(isSafe(row,col,Board)){

                        Board[row][col]='Q';
                        Helper(AllBoard,Board,col+1);
                        Board[row][col] = '.';
                    }
                }
    }


    public static boolean isSafe(int row,int col,char[][]Board){


        //Horizontally
        for(int c=0;c<Board.length;c++){
            if(Board[row][c]=='Q'){
                return false;
            }
        }

        // Vertically
        for(int r=0;r<Board.length;r++){
            if(Board[r][col]=='Q'){
                return false;
            }
        }


        // Left Upper corner
        int r = row;
        for(int c = col;c>=0 && r>=0 ;c--,r--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        // Right Uper corner
         r=row;
        for(int c=col;c<Board.length && r>=0 ; c++,r--){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        // Down Left corner
          r=row;
        for(int c =col;c>=0&&r<Board.length ; c--,r++){
            
            if(Board[r][c]=='Q'){
                return false;
            }
        }


        //Down Right corner

        r=row;
        for(int c=col;c<Board.length && r<Board.length;c++,r++){
            if(Board[r][c]=='Q'){
                return false;
            }
        }

        return true;
    }


    public static void Save(char[][]Board,List<List<String>> Allboard){

        String st="";
        List<String> lst = new ArrayList<>();

        for(int i=0;i<Board.length;i++){
            st="";
            for(int j=0;j<Board.length;j++){
                    if(Board[i][j]=='Q'){
                        st+='Q';
                    }else{
                        st+='.';
                    }
            }
            lst.add(st);
        }

        Allboard.add(lst);
    }

}