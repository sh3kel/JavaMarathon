package day17;

public class Task2 {
    public static void main(String[] args) {
        ChessPiece empty = ChessPiece.EMPTY;
        ChessPiece[][] chessBoard = {
                {ChessPiece.ROOK_BLACK, empty, empty, empty, empty, ChessPiece.ROOK_BLACK, ChessPiece.KING_BLACK, empty},
                {empty, ChessPiece.ROOK_WHITE, empty, empty, ChessPiece.PAWN_BLACK, ChessPiece.PAWN_BLACK, empty, ChessPiece.PAWN_BLACK},
                {ChessPiece.PAWN_BLACK, empty, ChessPiece.KNIGHT_BLACK, empty, empty, empty, ChessPiece.PAWN_BLACK, empty},
                {ChessPiece.QUEEN_BLACK, empty, empty, ChessPiece.BISHOOP_WHITE, empty, empty, empty, empty},
                {empty, empty, empty, ChessPiece.BISHOOP_BLACK, ChessPiece.PAWN_WHITE, empty, empty, empty},
                {empty, empty, empty, empty, ChessPiece.BISHOOP_WHITE, ChessPiece.PAWN_WHITE, empty, empty},
                {ChessPiece.PAWN_WHITE, empty, empty, ChessPiece.QUEEN_WHITE, empty, ChessPiece.PAWN_WHITE, empty, ChessPiece.PAWN_WHITE},
                {empty, empty, empty, empty, empty, ChessPiece.ROOK_WHITE, ChessPiece.KING_WHITE, empty}
        };

        ChessBoard chess = new ChessBoard(chessBoard);
        chess.print();
    }
}
