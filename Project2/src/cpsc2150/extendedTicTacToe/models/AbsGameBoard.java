package cpsc2150.extendedTicTacToe.models;

/**
 * @author Ketki Patel
 * @Version 1.0
 */

/**
 * This method creates a string to show the row and column position
 * @return one string that will show the entire game board
 * @pre none
 * @post string that shows the game board = {"
 *   0|1|2|3|4|5|6|7|
 * 0| | | | | | | | |
 * 1| | | | | | | | |
 * 2| | | | | | | | |
 * 3| | | | | | | | |
 * 4| | | | | | | | |
 * "}
 */
public abstract class AbsGameBoard implements IGameBoard {
     /**
     * This method Overrides the toString() Object method to provide a string of the current GameBoard
     *
     * @return a string representation of the current GameBoard
     *
     * @post: toString() = string representation of the GameBoard
     */
    @Override
    public String toString(){
        String line = "|";

        for(int i = 0; i < getNumColumns(); i++) {
            if(i < 9) {
                line = line.concat(" ");
            }
            line = line.concat(Integer.toString(i));
            line = line.concat("|");
        }
        line =line.concat("\n");

        for(int i = (getNumRows() - 1); i >= 0; i--) {
            for(int k = 0; k < getNumColumns(); k++) {
                BoardPosition pos = new BoardPosition(i,k);
                char c = whatsAtPos(pos);
                line = line.concat("|");
                line = line.concat(Character.toString(c));
                line = line.concat(" ");
            }
            line = line.concat("|");
            line = line.concat("\n");
        }
        return line;
    }
}

