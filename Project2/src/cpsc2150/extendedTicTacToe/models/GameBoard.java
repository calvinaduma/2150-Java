package cpsc2150.extendedTicTacToe.models;

/**
 * @author Ketki Patel
 * @Version 1.0
 *
 * @invariant 0 <= row <= 5 AND 0 <= col <= 8
 * @correspondence self = Board[row][col]
 */
public class GameBoard extends AbsGameBoard {
    private int rowNum;
    private int colNum;
    private int winCount;
    public static char GameBoard[][];

    /**
     * Constructor to create an empty array for the GameBoard class.
     *
     * @pre NONE
     * @post r = rowNum AND c = colNum AND w = winCount AND new char[r][c] = GameBoard
     */
    public GameBoard() {
        GameBoard = new char[rowNum][colNum];
        for (int i = 0; i < rowNum; i++) {
            for (int j = 0; j < colNum; j++) {
                GameBoard[i][j] = ' ';
            }
        }
    }

    /**
     * This method returns the number of rows on the board.
     *
     * @return returns the number of rows on the board
     * @pre NONE
     * @post getNumRows = MAX_ROW
     */
    public int getNumRows() {
        return rowNum;
    }

    /**
     * This method returns the number of columns on the board.
     *
     * @return returns the number of columns on the board
     * @pre NONE
     * @post getNumColumns = MAX_COLUMN
     */
    public int getNumColumns() {
        return colNum;
    }

    /**
     * This method returns the number of tokens in a row needed to win the game.
     *
     * @return returns the number of tokens in a row needed to win the game
     * @pre NONE
     * @post getNumToWin = WIN_COUNT
     */
    public int getNumToWin() {
        return winCount;
    }

    /**
     * This method will place the character in marker on the position specified by marker
     *
     * @param pos    the position on the board
     * @param player
     * @pre [player is a valid player] AND checkSpace(marker) = true
     * @post board[marker.getRow()][marker.getColumn()] = player
     */
    public void placeMarker(BoardPosition pos, char player) {
        GameBoard[pos.getRow()][pos.getColumn()] = player;
    }

    /**
     * This method will check to see what is in the GameBoard position pos
     * and returns it
     *
     * @param pos
     * @return the character at the position specified by pos
     * @pre 0 <= pos.getRow() < MAX_ROW AND 0 <= pos.getColumn() < MAX_COL
     * @post getBoardPosition = board[pos.getRow()][pos.getColumn()]
     */
    public char whatsAtPos(BoardPosition pos) {
        int row = pos.getRow();
        int col = pos.getColumn();
        return GameBoard[row][col];
    }
}
