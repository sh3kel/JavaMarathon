package day17;



public enum ChessPiece {
    KING_WHITE(100, "♔"), QUEEN_WHITE(9, "♕"), ROOK_WHITE(5, "♖"),
    BISHOOP_WHITE(3.5, "♗"), KNIGHT_WHITE(3, "♘"), PAWN_WHITE(1, "♙"),
    KING_BLACK(100, "♚"), QUEEN_BLACK(9, "♛"), ROOK_BLACK(5, "♜"),
    BISHOOP_BLACK(3.5, "♝"), KNIGHT_BLACK(3, "♞"), PAWN_BLACK(1, "♟"),
    EMPTY(-1, "_");

    private double rate;
    private String symbol;

    ChessPiece(double rate, String symbol) {
        this.rate = rate;
        this.symbol = symbol;
    }

    public double getRate() {
        return rate;
    }

    public String getSymbol() {
        return symbol;
    }

    @Override
    public String toString() {
        return symbol + " ";
    }
}
