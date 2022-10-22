public class Skapbil extends Lastbilar {
    public Skapbil(double weight) {

        this.vikten = weight;
    }

    @Override
    public double getVikten() {
        return this.vikten;
    }

    @Override
    public int getType() {
        return 1;
    }

    @Override
    public String toString() {
        return "Skåpbil, vikt = " + vikten;
    }
}
