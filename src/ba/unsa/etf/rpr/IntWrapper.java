package ba.unsa.etf.rpr;

import java.util.Objects;

public class IntWrapper {
    private int x;

    public IntWrapper(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    @Override
    public String toString() {
        return "" + x;
    }

    @Override
    public boolean equals (Object o) {
        IntWrapper that = (IntWrapper) o;
        return this.x == that.x;
    }
}
