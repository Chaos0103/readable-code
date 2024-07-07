package cleancode.minesweeper.tobe.mineswepper.io.sign;

import cleancode.minesweeper.tobe.mineswepper.board.cell.CellSnapshot;
import cleancode.minesweeper.tobe.mineswepper.board.cell.CellSnapshotStatus;

public class LandMinCellSignProvider implements CellSignProvidable {

    private static final String LAND_MINE_SIGN = "☼";

    @Override
    public boolean supports(CellSnapshot cellSnapshot) {
        return cellSnapshot.isSameStatus(CellSnapshotStatus.LAND_MINE);
    }

    @Override
    public String provide(CellSnapshot cellSnapshot) {
        return LAND_MINE_SIGN;
    }
}
