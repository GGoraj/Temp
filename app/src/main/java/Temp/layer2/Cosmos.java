package Temp.layer2;

import java.util.Objects;

public class Cosmos {

    private int integer1;


    public Cosmos() {
    }

    public Cosmos(int integer1) {
        this.integer1 = integer1;
    }

    public int getInteger1() {
        return this.integer1;
    }

    public void setInteger1(int integer1) {
        this.integer1 = integer1;
    }

    public Cosmos integer1(int integer1) {
        setInteger1(integer1);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Cosmos)) {
            return false;
        }
        Cosmos cosmos = (Cosmos) o;
        return integer1 == cosmos.integer1;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(integer1);
    }

    @Override
    public String toString() {
        return "{" +
            " integer1='" + getInteger1() + "'" +
            "}";
    }

}

