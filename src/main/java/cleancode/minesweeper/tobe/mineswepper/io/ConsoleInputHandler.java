package cleancode.minesweeper.tobe.mineswepper.io;

import cleancode.minesweeper.tobe.mineswepper.board.position.CellPosition;
import cleancode.minesweeper.tobe.mineswepper.uesr.UserAction;

import java.util.Scanner;

public class ConsoleInputHandler implements InputHandler {

    private static final Scanner SCANNER = new Scanner(System.in);

    private final BoardIndexConverter boardIndexConverter = new BoardIndexConverter();

    @Override
    public UserAction getUserActionFromUser() {
        String userInput = SCANNER.nextLine();
        if ("1".equals(userInput)) {
            return UserAction.OPEN;
        }
        if ("2".equals(userInput)) {
            return UserAction.FLAG;
        }
        return UserAction.UNKNOWN;
    }

    @Override
    public CellPosition getCellPositionFromUser() {
        String userInput = SCANNER.nextLine();

        int rowIndex = boardIndexConverter.getSelectedRowIndex(userInput);
        int colIndex = boardIndexConverter.getSelectedColIndex(userInput);
        return CellPosition.of(rowIndex, colIndex);
    }

}
