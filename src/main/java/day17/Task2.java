package day17;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        //Вводим константу - размер доски
        final int boardSize = 8;

        //Создаем доску
        ChessPiece[][] chessBoard = new ChessPiece[boardSize][boardSize];
        //Заполняем доску с помощью цикла пустыми значениями
        for (int i = 0; i < boardSize; i++) {
            for(int j = 0; j < boardSize; j++) {
                chessBoard[i][j] = ChessPiece.EMPTY;
            }
        }
        //Расставляем фигуры:
        chessBoard[0][0] = ChessPiece.ROOK_BLACK;
        chessBoard[0][5] = ChessPiece.ROOK_BLACK;
        chessBoard[0][6] = ChessPiece.KING_BLACK;

        ChessBoard chess = new ChessBoard(chessBoard);
        chess.print();
    }
}
