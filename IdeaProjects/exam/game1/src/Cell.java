public class Cell {

    public static final int DEAD_TO_ALIVE = 3;
    public static final int ALIVE_TO_DEAD_OVER = 3;
    public static final int ALIVE_TO_DEAD_UNDER = 2;

    private boolean isAlive;

    public Cell() {
        dead();
    }

    public Cell(boolean isAlive) {
        setAlive(isAlive);
    }

    public boolean isAlive() {
        return this.isAlive;
    }

    public void setAlive(boolean isAlive) {
        this.isAlive = isAlive;
    }

    public void alive() {
        this.isAlive = true;
    }

    public void dead() {
        this.isAlive = false;
    }

    public void toggleLife() {
        this.isAlive = !this.isAlive;
    }

    @Override
    public Cell clone() {
        return new Cell(isAlive);
    }
}
