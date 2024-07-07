package cleancode.minesweeper.tobe.mineswepper.board.position;

import java.util.Objects;

public class CellPosition {

    private final int rowIndex;
    private final int conIndex;

    private CellPosition(int rowIndex, int conIndex) {
        if (rowIndex < 0 || conIndex < 0) {
            throw new IllegalArgumentException("올바르지 않은 좌표입니다.");
        }
        this.rowIndex = rowIndex;
        this.conIndex = conIndex;
    }

    public static CellPosition of(int rowIndex, int conIndex) {
        return new CellPosition(rowIndex, conIndex);
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        CellPosition that = (CellPosition) object;
        return rowIndex == that.rowIndex && conIndex == that.conIndex;
    }

    @Override
    public int hashCode() {
        return Objects.hash(rowIndex, conIndex);
    }

    public boolean isRowIndexMoreThanOrEqual(int rowIndex) {
        return this.rowIndex >= rowIndex;
    }

    public boolean isColIndexMoreThanOrEqual(int colIndex) {
        return this.conIndex >= colIndex;
    }

    public int getRowIndex() {
        return rowIndex;
    }

    public int getColIndex() {
        return conIndex;
    }

    public boolean canCalculatePositionBy(RelativePosition relativePosition) {
        return this.rowIndex + relativePosition.getDeltaRow() >= 0
            && this.conIndex + relativePosition.getDeltaCol() >= 0;
    }

    public CellPosition calculatePositionBy(RelativePosition relativePosition) {
        if (this.canCalculatePositionBy(relativePosition)) {
            return CellPosition.of(
                this.rowIndex + relativePosition.getDeltaRow(),
                this.conIndex + relativePosition.getDeltaCol()
            );
        }
        throw new IllegalArgumentException("움직일 수 있는 좌표가 아닙니다.");
    }

    public boolean isRowIndexLessThan(int rowIndex) {
        return this.rowIndex < rowIndex;
    }

    public boolean isColIndexLessThen(int colIndex) {
        return this.conIndex < colIndex;
    }
}
