package day17;

import java.util.List;
import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {

        ChessPiece[] chess = {ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE, ChessPiece.PAWN_WHITE,
        ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK, ChessPiece.ROOK_BLACK};

        for (ChessPiece c: chess) {
            System.out.print(c);
        }
    }
}