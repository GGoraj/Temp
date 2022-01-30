package Temp.Feature2;

public class Feature {

    private int paula;

    

    public Feature(int paula) {
        this.paula = paula;
    }

    public int getPaula() {
        return this.paula;
    }

    public void setPaula(int paula) {
        this.paula = paula;
    }

    public Feature paula(int paula) {
        setPaula(paula);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Feature)) {
            return false;
        }
        Feature feature = (Feature) o;
        return paula == feature.paula;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(paula);
    }

    @Override
    public String toString() {
        return "{" +
            " paula='" + getPaula() + "'" +
            "}";
    }

    
}
