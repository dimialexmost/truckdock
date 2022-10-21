public class TungLastbil extends Lastbilar {
    public TungLastbil(double weight) {
        super(3);
        this.weight = weight;
    }

    @Override
    public int getType() {
        return type;
    }
    @Override
    public String toString() {
        return "Tung lastbil, vikt = " + weight;
    }

    @Override
    public double getWeight() {
        return this.weight;
    }
}