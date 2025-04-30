package Core;

public enum Color {
    WHITE, BLACK;

    /**
     * Returns the opposite color
     */
    public Color opposite() {
        return this == WHITE ? BLACK : WHITE;
    }

    /**
     * Returns the direction of forward movement for pawns of this color
     */
    public int getPawnDirection() {
        return this == WHITE ? 1 : -1;
    }

    /**
     * Returns the starting row for pawns of this color
     */
    public int getPawnStartingRow() {
        return this == WHITE ? 1 : 6;
    }

    /**
     * Returns the row where this color's pieces are initially placed
     */
    public int getHomeRow() {
        return this == WHITE ? 0 : 7;
    }

    @Override
    public String toString() {
        return this == WHITE ? "White" : "Black";
    }
}