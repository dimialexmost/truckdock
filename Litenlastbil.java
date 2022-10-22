public class Litenlastbil  extends Lastbilar {
    public Litenlastbil(double weight) {

        this.vikten = weight;
    }

    @Override
    public int getType() {
        return 2;
    }
    @Override
    public String toString() {
        return "Lätt lastbil, vikt = " + vikten;
    }
    @Override
    public double getVikten() {
        return this.vikten;
    }
}
