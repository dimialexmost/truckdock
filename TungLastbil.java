public class TungLastbil extends Lastbilar {
    public TungLastbil(double weight) {

        this.vikten = weight;

    }

    @Override
    public int getType() {

        return 3;
    }
    @Override
    public String toString() {
        return "Tung lastbil, vikt = " + vikten;
    }

    @Override
    public double getVikten() {
        return this.vikten;
    }
}
