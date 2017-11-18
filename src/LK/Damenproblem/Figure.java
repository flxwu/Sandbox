package LK.Damenproblem;

public class Figure {
    protected int x = 0;
    protected int y = 0;
    protected char color='N';

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public boolean move(int x, int y) {
        return true;
    }

    protected boolean moveCross(int x, int y) {
        if (this.x == x || this.y == y) {
            return true;
        }
        return false;
    }

    protected boolean moveDiagonal(int x, int y) {
        if (Math.abs(this.x - x) == Math.abs(this.y - y)) {

            return true;
        }
        return false;
    }

    protected boolean[][] beat() {
        boolean[][] field = new boolean[8][8];
        for(int x=0;x<8;x++) {
            for(int y=0;y<8;y++) {
                if (move(x, y)) {
                    field[x][y] = true;
                }
            }
        }
        return field;
    }

    @Override
    public String toString() {
        return "F";
    }
}
