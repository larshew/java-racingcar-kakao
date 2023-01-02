package racingcar.domain;

import java.util.Objects;

public class Position implements Comparable<Position>{
    private int val;

    public Position() {
        this(1);
    }
    public Position(int val){
        this.val = val;
    }

    public void move() {
        this.val++;
    }

    @Override
    public int compareTo(Position position) {
        return val - position.val;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()){
            return false;
        }
        Position position = (Position) o;
        return val == position.val;
    }

    @Override
    public int hashCode() {
        return Objects.hash(val);
    }

    @Override
    public String toString() {
        return "-".repeat(this.val);
    }


}
