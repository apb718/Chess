package Core;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter // Generates getters for all fields
@SuperBuilder // Allows hierarchical builder pattern for subclasses
@NoArgsConstructor(access = AccessLevel.PROTECTED) // For subclass instantiation
@AllArgsConstructor // Generates constructor with all fields
public abstract class Piece {
    private Color color;

    @Setter
    private Position position;

    /**
     * Checks if a piece is an opponent's piece.
     */
    public boolean isOpponent(Piece other) {
        return other != null && this.color != other.getColor();
    }
}
