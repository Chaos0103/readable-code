package cleancode.minesweeper.tobe.mineswepper.io.sign;

import cleancode.minesweeper.tobe.mineswepper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.mineswepper.board.cell.CellSnapshotStatus;

public class NumberCellSignProvider implements CellSignProvidable {

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.NUMBER);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return String.valueOf(cellSnapshot.getNearbyLandMineCount());
    }
}
