package xxl.utils;

public class Position {
    private int _row;
    private int _column;

    public Position(int row, int column) {
        _row = row;
        _column = column;
    }

    /**
     * @return the requested line
     */
    public int getRow() {
        return _row;
    }

    /**
     * @return the requested column
     */
    public int getColumn() {
        return _column;
    }

    /**
     * @param row
     * @return void
     */
    public void setRow(int row) {
        _row = row;
    }

    /**
     * @param column
     * @return void
     */
    public void setColumn(int column) {
        _column = column;
    }

    /**
     * 
     * @param coordinate
     * @return the requested position as a Position
     */
    public Position toPosition(String coordinate) {
        String coords[] = coordinate.split(";");
        return new Position(Integer.parseInt(coords[0]), Integer.parseInt(coords[1]));
    }

    /**
     * @return the requested position as a string
     */
    @Override
    public String toString() {
        return this.getRow() + ";" + this.getColumn();
    }

    /**
     * @param position
     * @return true if the position is the same as the current one
     */
    public boolean equals(Position position) {
        return this.getRow() == position.getRow() &&
                this.getColumn() == position.getColumn();
    }
}
