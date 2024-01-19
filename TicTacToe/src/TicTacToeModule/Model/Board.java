package TicTacToeModule.Model;

public class Board {
    int size;
    PlayPiece[][] playPieces;

    public int getSize() {
        return size;
    }

    public Board(int size){
        this.size = size;
        playPieces = new PlayPiece[size][size];
    }

    public boolean checkFreeSpace(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++) if(playPieces[i][j] == null) return true;
        }
        return false;
    }

    public boolean addSymbol(int row, int col, Player player){
        if(playPieces[row][col] != null) return false;
        playPieces[row][col] = player.getPlayPiece();
        return true;
    }

    public void displayBoard(){
        for(int i=0;i<size;i++){
            System.out.print("| ");
            for(int j=0;j<size;j++){
                System.out.print((playPieces[i][j] == null ? " " : playPieces[i][j].playPieceType) + " | ");
            }
            System.out.println();
        }
    }

    public boolean gameFinished(int row, int col, Player player){
        boolean result = true;
        for(int i=0;i<size;i++){
            if(playPieces[i][col] == null || playPieces[i][col] != player.playPiece){
                result = false;
                break;
            }
        }
        if(result) return true;

        result = true;
        for(int i=0;i<size;i++){
            if(playPieces[row][i] == null || playPieces[row][i] != player.playPiece){
                result = false;
                break;
            }
        }
        if(result) return true;

        result = true;
        for(int i=0;i<size;i++){
            if(playPieces[i][i] == null || playPieces[i][i] != player.playPiece){
                result = false;
                break;
            }
        }
        if(result) return true;

        result = true;
        for(int i=0;i<size;i++){
            if(playPieces[i][size-i-1] == null || playPieces[i][size-i-1] != player.playPiece){
                result = false;
                break;
            }
        }
        return result;
    }
}
