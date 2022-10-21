public class Litenlastbil  extends Lastbilar {
    public Litenlastbil(double weight) {
        super(2);
        this.weight = weight;
    }

    @Override
    public int getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Lätt lastbil, vikt = " + weight;
    }
    @Override
    public double getWeight() {
        return this.weight;
    }
}
