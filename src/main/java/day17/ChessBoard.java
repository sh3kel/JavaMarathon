package day17;

public class ChessBoard {
    ChessPiece[][] chessBoard;
    public ChessBoard(ChessPiece[][] chessBoard) {
        this.chessBoard = chessBoard;
    }

    public void print() {
        for(ChessPiece[] row: chessBoard) {
            for(ChessPiece el: row) {
                System.out.print(el.getSymbol());
            }
            System.out.println();
        }
    }
}
