package cleancode.minesweeper.tobe.mineswepper.io;

import cleancode.minesweeper.tobe.mineswepper.board.GameBoard;
import cleancode.minesweeper.tobe.mineswepper.exception.GameException;

public interface OutputHandler {

    void showGameStartComments();

    void showBoard(GameBoard board);

    void showGameWinningComment();

    void showGameLosingComment();

    void showCommentForSelectingCell();

    void showCommentForUserAction();

    void showExceptionMessage(GameException e);

    void showSimpleMessage(String message);
}
