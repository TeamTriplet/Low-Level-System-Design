package TicTacToeModule.Model;

public class Player {
    String id;
    PlayPiece playPiece;

    public Player(String id, PlayPiece playPiece){
        this.id = id;
        this.playPiece = playPiece;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public PlayPiece getPlayPiece() {
        return playPiece;
    }

    public void setPlayPiece(PlayPiece playPiece) {
        this.playPiece = playPiece;
    }
}
