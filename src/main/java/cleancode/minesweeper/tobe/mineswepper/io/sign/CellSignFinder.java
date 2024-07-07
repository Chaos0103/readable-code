package cleancode.minesweeper.tobe.mineswepper.io.sign;

import cleancode.minesweeper.tobe.mineswepper.board.cell.CellSnapshot;

import java.util.List;

public class CellSignFinder {

    private static final List<CellSignProvidable> CELL_SIGN_PROVIDERS = List.of(
        new EmptyCellSignProvider(),
        new FlagCellSignProvider(),
        new LandMinCellSignProvider(),
        new NumberCellSignProvider(),
        new UncheckedCellSignProvider()
    );

    public String findCellSignFrom(CellSnapshot snapshot) {
        return CELL_SIGN_PROVIDERS.stream()
            .filter(provider -> provider.supports(snapshot))
            .findFirst()
            .map(provider -> provider.provide(snapshot))
            .orElseThrow(() -> new IllegalArgumentException("확인할 수 없는 셀입니다."));
    }
}
